# Inventory Application

## Overview
The Inventory Application is designed to manage products and users within an inventory system. This backend application is built using Java 17, Spring Boot, Hibernate, and an H2 database, with endpoints for managing product details, user information, and their relationships.

## Features
- **Product Management**: Create, read, update, and delete product entries.
- **User Management**: Create, read, and delete users.
- **H2 Database**: In-memory H2 database for testing and development.
- **RESTful API**: Exposes APIs to interact with the application using HTTP methods (GET, POST, DELETE).

## Technologies
- Java 17
- Spring Boot (v3.3.5)
- Hibernate ORM (v6.5.3)
- H2 Database (v2.2.224)
- Maven for Dependency Management

## Setup Instructions

### 1. Clone the repository
git clone https://github.com/PorvaniVafo/InventoryApplication.git
cd InventoryApplication

### 2.Configure H2 Database (Optional for production use)
For development purposes, the app uses an in-memory H2 database. You can configure the connection URL and other details in application.properties.

# application.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

### 3. Run the Application
After all dependencies are installed, navigate to the project folder and run the application using Maven.

If you need to use a different database, update the application.properties file in the src/main/resources directory with the necessary configuration.

### 4. Build and Run the Application

### 5. Testing the API with Postman
The application will start at http://localhost:8080/api/...
