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

![]![kanban with epics and users](https://user-images.githubusercontent.com/75577200/146398215-4a0ae236-eeb5-45bb-8a7e-c23ebc51dcb5.png)

Throughout the project build I completed two sprints, grouping the issues from epics to complete different sections - front end task and back end tasks.

![](https://lh6.googleusercontent.com/sN428wmx3-QxizkfNOStiIjTWaxsyEGCqtzF_3eqY5tGEg29l7iuC07PvwSwU7T7gr955TXQWr7Sw-MV9syxSO_W-rdP-k1YTYhSGpP0KEyWl6nkEx5DZ4te-WlxOeV4xvxEMd3D)

I set up two git repositories before starting - one for the front-end and one for back-end. This is the network graph from my back-end repository:

![](https://lh3.googleusercontent.com/2dpUFod5kFAkHn4VByrPF2JHdFommcMl2Ye-BfROPz5ooNtsgvPYw1uW7OV6PQH7pGc-xFDuGfOICd1Xkvc3knNZu6OwnkWzROQ3sTxJ7mpkwjZfQYI3Ca-8kWZun7_kShVCHlZz)

I linked my git with my jira board so I could make smart commits throughout the build and made sure to commit after each new functionality.

* * * * *

### Databases

Two databases were used in this project, a local H2 database which was used for testing the back-end and a MySQL database for storing the persistent data from the application.

H2:

The H2 database was created with hiking-schema.sql and hiking-data.sql files to automatically populate the fields for testing purposes.

MySQL:![](https://lh4.googleusercontent.com/c6HPVD5UJE7-4yMkp7pWo_2WIdd_RoZxVW1ZHYbZLz1R31yUBEGHeSVVAYGnyUjqpX4QDcfZ1iKuFaZE4yf9PYFj4zJKYeqlMxmlrU_Ew2cLpLFIK5U9U5rsnHRUI7Sr4tOg1vGQ)

This is the layout of my database for the hiking database.![](https://lh5.googleusercontent.com/MaP8RKoTEaXjU4FQCz7LChlqU1FDtWemg_XefUvXUgOGaTiD2jBwjsbLBBnRGNiN6c29R9Rb-STcQpd2QAaMyWTYyQg_xTmvz43XXHNLDw6EEWngayvSQukWz6jEluC9WCp3iSAh)

It shows the datatype of each column.

* * * * *

### Back-end + Testing:

The back-end of this project was created using Java in a Spring Boot Framework. I made sure that the majority of my Kanban board requirements were met with the correct mappings in my code.

![](https://lh4.googleusercontent.com/3lqHWvWTZwx-yrqsHsXe5hn_YyjlA5x6Fg8IbVySVv2LlZI7SifJY8jBUsu0LQog6x92nF4ZzRbRBdZI-F_4MdVWcQI38LPBtHbLhomsw4pLhbjQsR6fBUCNHkve0XMP3V7CCbxy)

#### Testing:

Integration and unit testing was used on this project.

Integration testing: MockMVC\
![](https://lh4.googleusercontent.com/eFd3quy2T8RZuh3mjpBMGv84zvQFkbIb255BBzic2MROstOFq4KgQtdD7HLoPoSDDyYFWPqpG4M_lLnQQYdzCldqAb2EEhDpZ-xzPkY6uQ9RT4XDJ9JcfIDijlNHCxIrXRXe99_l)

To make sure that the program was working, I used MockMVC to create a mocked Controller class.

It performed mock HTTP requests like a user of the program would and allowed me to test the outcomes of each HTTP endpoint.

Unit testing: JUnit

By unit testing each part of the program I could check that the individual parts are working as they should.

![](https://lh6.googleusercontent.com/4cJFjIRKfRDFyyotmGI8snpLpZwBJeUpROH_ciNUy4FmlOJwwP2PjS1Q76ym2bPyFm-6O81LZTsRThKPrB908bxZBaZ9fvTgtRzvk2HnY2H4tAs2zUlOsq3gLEgun8yURT7nqcRH)


* * * * *

### Front-End:

The front-end is built from HTML and JavaScript. I used the Bootstrap framework for various components, including forms, modals and buttons.

The HTML is used to create the look of the website.
![](https://lh4.googleusercontent.com/03_SLAbjwnCNTHhDvgEYJYmXhjUUIzMxn4BauCxT1TYVsrbP_dFk02a94idpkLIgZljLw4nY3r3X8kfKW8-hL5E3Pnsb37bkMVEJJU5gxjH8oxr7NgM7VOJDRZZTgr7j48iTJsU2)

The JS was used for the API integration using axios. It was also used to get the modals to pop up on forms.
![](https://lh3.googleusercontent.com/OctetUULYWPzih9ZkTBcZfUj76zcX-bzTKPeA5Lw043hmewq7J2WWXKRaq6-9ZhYyQYEWzYvwG3bWSSa9PYHvd_abYl-QFo34-xBVToRCeb2HudeCju6ODOsSNMVInD8SvoU_uF3)\
![](https://lh5.googleusercontent.com/aGOgfJLdtWOC4p5xw3lv3lLR-t-oqNpE2GQq5jXjgAJCIAKYnJVOrkrTwAAlxn5WMePT3ttvd2RBERW8crgnpEcm6-PzC2Ei8T0pWs-ZoKPaK7IPi70Tp9vNlFnONonUYU_VZfj0)
