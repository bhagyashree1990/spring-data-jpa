# spring-data-jpa
Spring Data JPA and Hibernate

1. Association Unidirectional OneToMany `Book::Review`
2. Association Unidirectional OneToOne `Book::Manuscript`
3. Association Unidirectional ManyToMany `Book::Author`
4. Association Bidirectional OneToMany
5. Association Bidirectional OneToOne
6. Association Bidirectional ManyToMany
7. Composite Primary Key `Book::BookPublisher::Publisher`
8. Using Date and Time `LocalDate Date @Temporal`
9. Using `AttributeConverter`
10. Ordering vs Sorting `@OrderBy @SortNatural @SortComparator`
11. Log SQL Statements
12. Using `@Query` annotation
13. Derived Queries with Spring Data JPA

## Built With

* 	[Gradle](https://gradle.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
*   [MySQL 8](https://dev.mysql.com/doc/relnotes/mysql/8.0/en/) - MySQL Database Management System
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## To-Do

- [ ] Logger (Console, File, Mail)
- [x] RESTful Web Service (CRUD)
- [x] HATEOS
- [x] MySQL


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.spring.jpa.JpaApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing build.gradle
- Open Eclipse 
   - File -> Import -> Existing Gradle Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

### Application URL

To test application

|  URL 																				|  Method |
|-----------------------------------------------------------------------------------|---------|
|`http://localhost:8080/jpa-demo`  													| GET |
|`http://localhost:8080/jpa-demo/authors/search/findByFirstName?firstName=John&sort=dateOfBirth`     			| GET |
|`http://localhost:8080/jpa-demo/authors/search/findByFirstName?firstName=John&sort=dateOfBirth,desc`      		| GET |
|`http://localhost:8080/jpa-demo/authors/search/findByFirstNameOrderByLastName?firstName=John`    				| GET |
|`http://localhost:8080/jpa-demo/books?page=0&size=3`    							| GET |
|`http://localhost:8080/jpa-demo/authors/search/findByFirstNameContainingIgnoreCase?firstName=o`					| GET |
|`http://localhost:8080/jpa-demo/authors/search/findByLastName?lastName=Green`										| GET |
|`http://localhost:8080/jpa-demo/authors/search/updateDateOfBirth?dateOfBirth=1990-04-01&id=6`					| GET |

### Actuator

To monitor and manage application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080/jpa-demo`  						| GET |
|`http://localhost:8080/jpa-demo/actuator/`             | GET |
|`http://localhost:8080/jpa-demo/actuator/health`    	| GET |
|`http://localhost:8080/jpa-demo/actuator/info`      	| GET |


## Documentation

* [Swagger](http://localhost:8080/jpa-demo/swagger-ui.html) - `http://localhost:8080/jpa-demo/swagger-ui.html`- Documentation & Testing


## packages

- `entity` - to hold our entities;
- `repository`- to communicate with the database;
- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.yml` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server's default port, server's context path, database URLs etc, in this file.
- `test/` - contains unit and integration tests
- `build.gradle` - contains all the project dependencies
 
