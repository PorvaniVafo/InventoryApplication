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
```bash
git clone <repository_url>
cd InventoryApplication

4. Configure Database
This project uses an in-memory H2 database, so no further configuration is needed.

If you need to use a different database, update the application.properties file in the src/main/resources directory with the necessary configuration.

5. Build and Run the Application
To build and run the application, execute the following command:

bash
Копировать код
mvn spring-boot:run
The application will start at http://localhost:8080.

6. Testing the API with Postman
