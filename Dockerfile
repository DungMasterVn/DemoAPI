# Sử dụng image Python chính thức
FROM python:3.9-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép các file cần thiết từ máy host vào container
COPY requirements.txt requirements.txt
COPY app.py app.py

# Cài đặt các thư viện cần thiết
RUN pip install --no-cache-dir -r requirements.txt

# Expose cổng 5000 để ứng dụng có thể truy cập từ bên ngoài
EXPOSE 5000

# Lệnh khởi chạy ứng dụng
CMD ["python", "app.py"]
