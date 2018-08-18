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

HomePage    |  Route
:-------------------------:|:-------------------------:
![homepage](https://user-images.githubusercontent.com/34331677/44298414-5a976980-a300-11e8-9cd7-38aa2de97b13.png) | ![route](https://user-images.githubusercontent.com/34331677/44298415-5b300000-a300-11e8-9922-e70e93660443.png)

Add    |  After Add
:-------------------------:|:-------------------------:
![add](https://user-images.githubusercontent.com/34331677/44298416-5bc89680-a300-11e8-9105-3c3cbd27a36f.png) | ![after add](https://user-images.githubusercontent.com/34331677/44298411-59663c80-a300-11e8-8e44-d6838fd06ffa.png)


Edit    |  Delete
:-------------------------:|:-------------------------:
![edit](https://user-images.githubusercontent.com/34331677/44298413-59fed300-a300-11e8-8709-d78c0f8af23f.png) | ![delete](https://user-images.githubusercontent.com/34331677/44298412-59fed300-a300-11e8-8229-dab8219de7e5.png)
