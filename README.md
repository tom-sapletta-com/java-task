https://github.com/tom-sapletta-com/java-task

# java-task
+ Java 8+
+ Spring boot
+ docker
+ JPA
+ REST
+ UnitTest

### Data layer for DB entity, 

 can be very simple one with just few fields, for example:  

+ firstName 
+ lastName 
+ birthday 
+ country
+ isEmployed
 

### REST endpoints to make CRUD operation with entity from (1). 

### App should be runnable using docker. 

### Implement test for WS layer. 
 

# Spring init, maven pom.xml, ...

https://start.spring.io/

![spring-boot.png](docs/spring-boot.png)

## Scripts to manage the project

### Docker

Create / Remove

    docker_build.bat
    docker_rm.bat

Start / Stop
    
    docker_start.bat
    docker_stop.bat
    
## Maven     

run the application without the Docker container on localhost:8080/

    maven_jar.bat
    
To push to a Docker registry you use the build goal, instead of dockerBuild    

    maven_docker_build.bat
    
After Creting the docker, use the  Start / Stop scripts below   

# Tests

## Endpoint
http://localhost:8080/actuator/

## Hello
http://localhost:8080/

## All data Users
http://localhost:8080/users/all

