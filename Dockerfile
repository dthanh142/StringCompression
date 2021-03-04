# Build stage
FROM maven:3.6.3-jdk-11 as build
MAINTAINER thanhpham
WORKDIR /app
COPY pom.xml .
RUN mvn -f ./pom.xml clean package

COPY src/ .
RUN mvn package

# Run stage
FROM openjdk:11-jre-alpine
EXPOSE 8080
COPY --from=app /app/target/*.jar /app/string-compression-0.0.1.jar
CMD ["java", "-jar", "/app/string-compression-0.0.1.jar"]