# Stage 1: Build ứng dụng
FROM maven:3.8.5-openjdk-17 AS builder

# Sao chép file cấu hình Maven trước
COPY /app/pom.xml /app/pom.xml
WORKDIR /app
RUN mvn dependency:resolve

# Sao chép mã nguồn và build ứng dụng
COPY . /app
RUN mvn package -DskipTests


# Stage 2: Image chạy ứng dụng
FROM openjdk:17-jdk-alpine

# Sao chép file JAR từ stage build
COPY --from=builder /app/target/*.jar /app/app.jar

# Chạy ứng dụng
CMD ["java", "-jar", "/app/app.jar"]


