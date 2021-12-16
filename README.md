# HikingBE

# Cloud Native - Fundamental Project Specification
====================================

Introduction:
-------------

The brief was to create a CRUD application that encapsulated all the core modules covered during the training.

Project Management - A fully expanded Jira board, clear documentation from a design phase. Code integrated into a Version Control System.

Databases - Using MySQL database to store persistent data from the project.

Java SE & Spring Boot - Functional application created in OOP language, following best practices abd design principles.

Testing - Acceptable level of test coverage on back-end using JUnit.

Front-End Development - Functioning front-end website with API integration.

* * * * *

### Planning Resources:

Using Jira Software I created a Kanban board and created the user stories and epics. From the user stories I created linked issues for the front and back end of my project to help the structure of the build. 

![kanban with epics and users](https://user-images.githubusercontent.com/75577200/146398215-4a0ae236-eeb5-45bb-8a7e-c23ebc51dcb5.png)

Throughout the project build I completed two sprints, grouping the issues from epics to complete different sections - front end task and back end tasks.

![Two Sprints](https://user-images.githubusercontent.com/75577200/146402297-8f8461bd-47d6-4223-aa21-575f8a511095.png)

I set up two git repositories before starting - one for the front-end and one for back-end. This is the network graph from my front-end repository:

![fe network graph](https://user-images.githubusercontent.com/75577200/146402461-268a7ed0-1e38-4ac2-8bb4-9220c4504bbd.png)

This is the network graph from my back-end repository:

![image](https://user-images.githubusercontent.com/75577200/146405384-c8f0324a-caeb-4a30-b80f-82a04ca5964b.png)




I linked my git with my jira board so I could make smart commits throughout the build and made sure to commit after each new functionality.

* * * * *

### Databases

Two databases were used in this project, a local H2 database which was used for testing the back-end and a MySQL database for storing the persistent data from the application.

H2:

The H2 database was created with hiking-schema.sql and hiking-data.sql files to automatically populate the fields for testing purposes.

![h2 console test](https://user-images.githubusercontent.com/75577200/146402753-3e75a92b-aaee-4f4f-b7eb-8c84a7965f4d.png)

Postman was used in testing to send data to the H2 console:

![postman test](https://user-images.githubusercontent.com/75577200/146402989-87c3fd5c-4ea1-466f-8e9c-02c7fb82989b.png)

This is the layout of my database for the hiking database. 

![Mysql erd](https://user-images.githubusercontent.com/75577200/146403104-0cd8809f-b97d-420b-ae0c-6b00093c57d1.png)


It shows the datatype of each column.

* * * * *

### Back-end + Testing:

The back-end of this project was created using Java in a Spring Boot Framework. I made sure that the majority of my Kanban board requirements were met with the correct mappings in my code.

![mapping](https://user-images.githubusercontent.com/75577200/146403238-77e52c3c-073a-402c-9320-fd13a61a28d1.png)


#### Testing:

Integration and unit testing was used on this project.

Integration testing: MockMVC

![testing](https://user-images.githubusercontent.com/75577200/146403334-98c79b87-caf5-43c1-b6c4-a8b19e248f34.png)

To make sure that the program was working, I used MockMVC to create a mocked Controller class.

It performed mock HTTP requests like a user of the program would and allowed me to test the outcomes of each HTTP endpoint.

By unit testing each part of the program I could check that the individual parts are working as they should.




* * * * *

### Front-End:

The front-end is built from HTML and JavaScript. I used the Bootstrap framework for various components, including forms, modals and buttons.

The HTML is used to create the look of the website.

![front end design](https://user-images.githubusercontent.com/75577200/146403621-b5956da7-0fad-4906-9880-73295bcf5d46.png)

The JS was used for the API integration using axios. It was also used to get the modals to pop up on forms.

![modal- create](https://user-images.githubusercontent.com/75577200/146403759-64845a5f-31ff-4e52-aca2-ca3f1754484d.png)

![modal- update](https://user-images.githubusercontent.com/75577200/146403837-9854e99e-e04d-4b0f-a439-c651fefc6885.png)

This is a general build up of how the front end was built:

Adding the GetALL function:

![GetALL 1](https://user-images.githubusercontent.com/75577200/146404415-2a9a64f2-a2a6-4ebf-b6b3-deb05e5afc9a.png)

Adding forms for Create:

![create forms1](https://user-images.githubusercontent.com/75577200/146404540-145d7fb6-2f14-4689-8c73-cd770ed96d22.png)

Adding a Delete button:

![delete](https://user-images.githubusercontent.com/75577200/146404609-099d63d6-e1b9-48cf-af7e-51927ca37dff.png)

Adding a search by Mountain Name form:

![mountain](https://user-images.githubusercontent.com/75577200/146404685-11ad8c4a-6a7f-4999-a3b0-b0be96acd34f.png)

Adding a search by Height, Region and Country form:

![height](https://user-images.githubusercontent.com/75577200/146404876-4007b85e-5794-420e-8813-be8d4aaa71b4.png)






