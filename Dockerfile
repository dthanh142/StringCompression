# Build stage
FROM maven:3.6.3-jdk-11 as build
MAINTAINER thanhpham
WORKDIR /app
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B

COPY ./src ./src
RUN mvn package -DskipTest

# Run stage
FROM openjdk:11-jre
EXPOSE 8080
COPY --from=build /app/target/*.jar /app/string-compression-0.0.1.jar
CMD ["java", "-jar", "/app/string-compression-0.0.1.jar"]
