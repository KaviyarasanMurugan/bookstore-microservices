<<<<<<< HEAD
# 📚 Book Service

A Spring Boot microservice that handles book data with CRUD operations, Eureka, RabbitMQ, Resilience4j, and Docker.







bookstore-microservices/
├── api-gateway/
│   ├── src/main/java/com/kavi/gateway/
│   │   ├── GatewayApplication.java
│   │   ├── config/
│   │   │   └── GatewayConfig.java
│   │   ├── filter/
│   │   │   └── JwtAuthFilter.java
│   │   └── exception/
│   │       └── GatewayErrorFilter.java (optional)
│   └── application.yml

├── eureka-server/
│   ├── src/main/java/com/kavi/eureka/
│   │   └── EurekaServerApplication.java
│   └── application.yml

├── user-service/
│   ├── src/main/java/com/kavi/user/
│   │   ├── UserServiceApplication.java
│   │   ├── controller/UserController.java
│   │   ├── service/UserService.java
│   │   ├── config/SecurityConfig.java
│   │   ├── jwt/JwtUtil.java
│   │   ├── jwt/AuthRequest.java, JwtResponse.java
│   │   ├── entity/User.java
│   │   └── repository/UserRepository.java
│   └── application.yml

├── book-service/
│   ├── src/main/java/com/kavi/book/
│   │   ├── BookServiceApplication.java
│   │   ├── controller/BookController.java
│   │   ├── service/BookService.java
│   │   ├── entity/Book.java
│   │   ├── repository/BookRepository.java
│   │   ├── exception/GlobalExceptionHandler.java
│   │   └── dto/BookDTO.java
│   └── application.yml

├── order-service/
│   ├── src/main/java/com/kavi/order/
│   │   ├── OrderServiceApplication.java
│   │   ├── controller/OrderController.java
│   │   ├── consumer/OrderConsumer.java
│   │   ├── consumer/EmailConsumer.java
│   │   ├── config/RabbitMQConfig.java, RestTemplateConfig.java
│   │   ├── entity/Order.java
│   │   ├── repository/OrderRepository.java
│   │   ├── dto/OrderMessage.java, BookDTO.java
│   │   └── exception/GlobalExceptionHandler.java
│   └── application.yml

├── docker-compose.yml
├── README.md
└── pom.xml (parent if using multi-module)


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
=======
# bookstore-microservices
A Spring Boot monolithic CRUD application for managing employees.  
Tech Stack: Java 8, Spring Boot, Spring MVC, Hibernate, MySQL, Lombok, Swagger 
Features:  Create/Read/Update/Delete employee data  Global exception handling  Secure with Spring Security and JWT
>>>>>>> 3998b6b6c87294415d3a5e3f13d1fdf8a6d5165b
