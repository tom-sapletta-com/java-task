:: To get started quickly, you can run Jib without even changing your pom.xml
mvnw com.google.cloud.tools:jib-maven-plugin:dockerBuild -Dimage=springio/gs-spring-boot-docker
:: To push to a Docker registry you use the build goal, instead of dockerBuild
mvnw com.google.cloud.tools:jib-maven-plugin:build -Dimage=springio/gs-spring-boot-docker