FROM openjdk:17-jdk-alpine

COPY . /app

WORKDIR /app

RUN chmod +x mvnw

RUN ./mvnw package -DskipTests
