FROM openjdk:17-jdk-alpine

COPY . /app

WORKDIR /app

RUN apt-get update && apt-get install -y maven

RUN ./mvnw package -DskipTests
