FROM openjdk:17-jdk-alpine

# Sao chép tất cả các file trong thư mục hiện tại vào thư mục /app trong container
COPY . /app

# Đặt thư mục làm việc là /app
WORKDIR /app

# Cài đặt Maven (sử dụng apk thay vì apt-get)
RUN apk add --no-cache maven

# Chạy lệnh build Maven
RUN ./mvnw package -DskipTests

