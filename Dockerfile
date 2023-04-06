FROM maven:3.8-openjdk-17-slim AS builder

ADD ./pom.xml pom.xml
ADD ./src src/

RUN mvn clean package


From openjdk:17.0-jdk

COPY --from=builder target/spring-boot-complete-0.0.1-SNAPSHOT.jar spring-boot-complete-0.0.1-SNAPSHOT.jar

EXPOSE 8888

CMD ["java", "-jar", "spring-boot-complete-0.0.1-SNAPSHOT.jar"]
