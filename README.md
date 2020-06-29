# Hiberus-logistics

Hiberus-logistics is the microservice to generate and save the sent order.
The microservice returns void object and is registered in the eureka server of microservers

## Installation

Use the package manager gradle to install dependecies of the build gradle.

```bash
gradle clean build
```

Note: needs a gradle version 6.0 or higher

## Dependecies

spring-cloud-starter-netflix-eureka-client: eureka client to registered to a eureka server.
spring-boot-starter-data-jpa: helpfull to estructure the entitys with the databases
h2: librery to create a local database that start witch the app.
spring-boot-starter-web : create rest api services
springfox-swagger2: documentation librery of swagger
springfox-swagger-ui: swagger ui interface


## Usage

- Import project as gradle project.
- rigth click in HiberusLogisticsApplication and Run as a Java application
- ingress http://localhost:8761/, you find a dashboard with the microservice hiberus-logistics active.
- to watch the swagger documentation of the api ingress to http://localhost:8090/swagger-ui.html#/

## What we expect from you

- I have no experience working witch docker containers so i just created the DockerFile, to create the image
a deployit in a docker container 