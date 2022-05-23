This is a mini overview of Spring Boot 
- One of the benefit is that just by adding one dependency like spring starter web 
- it has internal/sub dependencies which are required for the project like tomcat server / jakarta annotation dependency
- even spring starter test - has junit mocikto and more dependedencies under it.
- Spring boot Dev Tools dependency will help us reload the application automatically when we make changes instead of stopping and starting the server.
- While adding dependenciew ; we won't add version are based on parent SPring boot version.
- 

Key Annotation 
@SpringBootApplication
@Component - will add class into spring container
- Technically controller classes are a resource so instead of component use Controller
- @Controller - stereotype annotation; it behaves as a component by default.


in this we are creating RESTful API's
So use @ RestController - 
It is same as controller but also tells that it will always return response body
i.e REST Api's  will always return data 

Here we are building Backend Application :
CRUD Ops ->Service Layer -> Data Access/Repository Layer

CRUD Ops: this is where all endpoint requests are written //controller layer just to get request 
Service layer : Business layer / logic will be here 
DATA/Repo : interacction to DB will be handled using this layer 
For now we will use in-memory H2 Database. 

- Add H2 Dependency and Spring Data JPA 
- --dcbapp is my database name
spring.datasource.url=jdbc:h2:mem:dcbapp
this is the driver i'm using for now
spring.datasource.driverClassName=org.h2.driver
spring.datasource.username=ts
spring.datasource.password=password
usingH2 dialect platform 
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

for logging in H2-DB :
localhost:8080/h2-console
provide username and password



@RequestMapping (value = "Mention your endpoint ", method = RequestMethod.GET)
This is one of the way to map an endpoint to CRUD operations GET,POST,PUT,DELETE
You can directly use 
@GetMapping @PutMapping @PostMapping @DeleteMapping 

Application properties 
You can change application config in here
Ex: tomcat port change (define a number for port )
server.port = 8082 

Maven GOALS
You can start the application using CLI 
mvn spring-boot:run