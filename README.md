A hands-on project focused on learning and implementing application security using Spring Boot and Spring Security.

The project explores authentication, authorization, password encryption, JWT-based authentication, and role-based access control while following industry-standard security practices.

Project Objectives
Understand Spring Security architecture and its security filter chain.

Implement user registration and authentication.

Secure passwords using BCrypt password encoding.

Implement authentication using JSON Web Tokens (JWT).

Apply role-based access control (RBAC).

Secure RESTful APIs against unauthorized access.

Understand authentication and authorization best practices.

Technologies Used
Technology	Purpose
Java	Programming language
Spring Boot	Backend application framework
Spring Security	Authentication and authorization
Spring Data JPA	Database persistence
MySQL	Relational database
Maven	Dependency management and build automation
JWT	Token-based authentication
Git & GitHub	Version control and source code management
Project Structure
spring_security/
│
├── .gitignore
├── README.md
│
└── compsciezimsecurity/
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    └── mvnw
Getting Started
Prerequisites
Java JDK 21 or compatible version configured for the project.

Maven (or use the included Maven Wrapper).

MySQL Server.

IntelliJ IDEA or another Java IDE.

Postman (for API testing).

Installation
Clone the repository:

git clone https://github.com/Microsmarumbi/spring_security.git
Navigate to the Spring Boot project directory:

cd spring_security/compsciezimsecurity
Configure your MySQL database and environment variables.

Build the application:

./mvnw clean install
On Windows:

.\mvnw.cmd clean install
Run the application:

.\mvnw.cmd spring-boot:run
The application runs on:

http://localhost:8081
