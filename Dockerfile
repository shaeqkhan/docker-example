FROM openjdk:8-jre-alpine
COPY ./target/docker-example-0.0.1-SNAPSHOT.jar /usr/src/hello/
WORKDIR /usr/src/hello
EXPOSE 8080
CMD ["java", "-jar", "docker-example-0.0.1-SNAPSHOT.jar"]