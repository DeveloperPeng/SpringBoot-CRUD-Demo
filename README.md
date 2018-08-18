# SpringBoot-CRUD-Demo

Simple CRUD application made with Spring Boot, SQL, JPA, Hibernate, AngularJS, Bootstrap, HTML, slf4j(Logger) and secured with Spring Security.

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Boot
- Spring Security

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/ChandanKolambe/SpringBoot-CRUD-Demo.git
```

**2. Create SQL database**
```bash
create database SomeName
```

**3. Change SQL username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your SQL installation

**4. Build and run the app**

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /test/hospitals
    
    POST /test/addHosp
    
    PUT /test/hospital/{id}
    
    DELETE /test/deleteHospital/{id}

You can test them using postman or any other rest client.

## Screenshots

