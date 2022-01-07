package com.qa.Hiking1.web;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Hiking1.domain.Hiking;

// boots the entire context - random port to avoid collisions (two apps running on the same)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc // sets up the MockMVC object
@Sql(scripts = { "classpath:hiking-schema.sql",
		"classpath:hiking-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test") // Set the profile JUST for the test

public class HikingControllerIntegrationTest {

	@Autowired // pulls the MockMVC object from the context
	private MockMvc mvc; // class that perform the request (kind of a postman equivalent)

	@Autowired
	private ObjectMapper mapper; // java <-> JSON converter that Spring uses

	@Test
	void testCreate() throws Exception {
		Hiking testHike = new Hiking(null, "Snowdon", "Snowdonia", 1085, "Wales");
		String testHikeAsJSON = this.mapper.writeValueAsString(testHike);
		RequestBuilder req = post("/create").contentType(MediaType.APPLICATION_JSON).content(testHikeAsJSON);

		Hiking testCreatedHike = new Hiking(4, "Snowdon", "Snowdonia", 1085, "Wales");
		String testCreatedHikeAsJSON = this.mapper.writeValueAsString(testCreatedHike);
		ResultMatcher checkStatus = status().isCreated(); // is status 201 - created
		ResultMatcher checkBody = content().json(testCreatedHikeAsJSON); // does the body match my testCreatedHikeAsJSON

		// sends request - checks the status - checks the body
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void getAllTest() throws Exception {
		RequestBuilder req = get("/getAll");

		List<Hiking> testHike = List.of(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"),
				new Hiking(2, "Blorenge", "Abergavenny", 555, "Wales"),
				new Hiking(3, "Ben Nevis", "Grampian", 1200, "Scotland"));
		String json = this.mapper.writeValueAsString(testHike);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
//
	@Test
	void getByIdTest() throws Exception {
		RequestBuilder req = get("/get/1");

		String json = this.mapper.writeValueAsString(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"));

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void getByMountainNameTest() throws Exception {
		RequestBuilder req = get("/getByMountainName/Snowdon");

		List<Hiking> testHike = List.of(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"));
		String json = this.mapper.writeValueAsString(testHike);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void getBygetByRegionTest() throws Exception {
		RequestBuilder req = get("/getByRegion/Snowdonia");

		List<Hiking> testHike = List.of(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"));
		String json = this.mapper.writeValueAsString(testHike);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void getByCountryTest() throws Exception {
		RequestBuilder req = get("/getByCountry/Wales");

		List<Hiking> testHike = List.of(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"));
		String json = this.mapper.writeValueAsString(testHike);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void getByHeightTest() throws Exception {
		RequestBuilder req = get("/getByHeight/1085");

		List<Hiking> testHike = List.of(new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales"));
		String json = this.mapper.writeValueAsString(testHike);

		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void testReplace() throws Exception {
		Hiking testHike = new Hiking(null, "Snowdon", "Snowdonia", 1085, "Wales");
		String testHikeAsJSON = this.mapper.writeValueAsString(testHike);
		RequestBuilder req = put("/replace/1").contentType(MediaType.APPLICATION_JSON).content(testHikeAsJSON);

		Hiking testCreatedHike = new Hiking(1, "Snowdon", "Snowdonia", 1085, "Wales");
		String testCreatedHikeAsJSON = this.mapper.writeValueAsString(testCreatedHike);
		ResultMatcher checkStatus = status().isAccepted(); // is status 202 - accepted
		ResultMatcher checkBody = content().json(testCreatedHikeAsJSON); // does the body match my testCreatedHikeAsJSON

		// sends request - checks the status - checks the body
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/delete/1")).andExpect(status().isNoContent());
	}
}
