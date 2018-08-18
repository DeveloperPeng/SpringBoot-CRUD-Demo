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

**5. Spring Security Login**

Enter Username & password as "admin".

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /test/hospitals
    
    POST /test/addHosp
    
    PUT /test/hospital/{id}
    
    DELETE /test/deleteHospital/{id}

You can test them using postman or any other rest client.

## Screenshots

HomePage    |  Route
:-------------------------:|:-------------------------:
![homepage](https://user-images.githubusercontent.com/34331677/44298703-59b50680-a305-11e8-8ae5-21b1776305f4.png) | ![route](https://user-images.githubusercontent.com/34331677/44298704-5a4d9d00-a305-11e8-88a8-4bc5a3248503.png)

Add    |  After Add
:-------------------------:|:-------------------------:
![add](https://user-images.githubusercontent.com/34331677/44298699-56ba1600-a305-11e8-88ab-8d5d2c5327fa.png) | ![after add](https://user-images.githubusercontent.com/34331677/44298700-5752ac80-a305-11e8-8c4e-aa1b5f210ebc.png)

Edit    |  Delete
:-------------------------:|:-------------------------:
![edit](https://user-images.githubusercontent.com/34331677/44298702-5883d980-a305-11e8-9463-f18bd09212b4.png) | ![delete](https://user-images.githubusercontent.com/34331677/44298701-57eb4300-a305-11e8-8306-0fdadc0da694.png)
