# base docker image
FROM openjdk:11
LABEL maintainer="firstDocker"
ADD target/first-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java","-jar", "/springboot-docker-demo.jar"]