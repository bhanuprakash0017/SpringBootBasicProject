# SpringBootBasicProject
starting with spring boot


# Challenges API - Spring Boot Project

## Overview
This is a basic **Spring Boot** project to understand key concepts like **Inversion of Control (IoC)**, **Dependency Injection (DI)**, and building **RESTful APIs**. The project implements a simple `Challenge` entity with CRUD operations.

## Tech Stack
- **Spring Boot**
- **Spring MVC**
- **Maven**
- **Java 17+**

## Features
- **Get all challenges** (`GET /challenges`)
- **Get challenge by month** (`GET /challenges/{month}`)
- **Add a new challenge** (`POST /challenges`)
- **Update an existing challenge** (`PUT /challenges/{id}`)
- **Delete a challenge** (`DELETE /challenges/{id}`)

## Project Structure
MyFirstProject │── src │ ├── main │ │ ├── java │ │ │ ├── com.bhanu.myfirstproject │ │ │ │ ├── Challenge.java │ │ │ │ ├── ChallengeController.java │ │ │ │ ├── ChallengeService.java │ │ │ │ ├── MyFirstProjectApplication.java │ │ ├── resources │ │ │ ├── application.properties │── test │── target │── .gitignore │── mvnw │── HELP.md


## Request Mapping Example
All endpoints are prefixed with `/challenges`.

### **1. Get all challenges**
GET /challenges Response: [ { "id": 1, "month": "January", "description": "Read a book" }, ... ]


### **2. Get challenge by ID**
GET /challenges/1 Response: { "id": 1, "month": "January", "description": "Read a book" }


### **3. Add a challenge**
POST /challenges Request Body: { "month": "February", "description": "Learn a new skill" } Response: 201 Created


### **4. Update a challenge**
PUT /challenges/1 Request Body: { "month": "January", "description": "Read two books" } Response: 200 OK


### **5. Delete a challenge**
DELETE /challenges/1 Response: 204 No Content



## How to Run
1. Clone the repository:
   git clone :-https://github.com/yourusername/MyFirstProject.git
   cd MyFirstProject
Build and run:
mvn spring-boot:run
Access the API at http://localhost:8080/challenges.


📧 Contact: kopparapubhanuprakash017@gmail.com
🔗 GitHub: github.com/bhanuprakash0017


