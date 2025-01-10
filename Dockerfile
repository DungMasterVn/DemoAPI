# Chọn base image Python
FROM python:3.8-slim

# Cài đặt các phụ thuộc cần thiết
RUN pip install --upgrade pip
RUN pip install flask

# Sao chép mã nguồn vào container
COPY . /app
WORKDIR /app

# Mở cổng 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
