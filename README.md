# 📚 Book Service

A Spring Boot microservice that handles book data with CRUD operations, Eureka, RabbitMQ, Resilience4j, and Docker.

## 🚀 Run

```bash
mvn clean install
mvn spring-boot:run
```

Or use Docker:

```bash
docker build -t book-service .
docker run -p 8082:8082 book-service
```