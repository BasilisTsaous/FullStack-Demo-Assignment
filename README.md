# Full Stack Java Assignment – Backend Implementation
```
This repository contains the backend implementation for the Full Stack Java Engineer assignment.  
The application is built using **Java 21**, **Spring Boot 3.5.7**, **DAO pattern**, and **MariaDB**.

The assignment includes four backend tasks (Task 1a, 1b, 2, and 3) fully implemented according to the instructions in the provided PDF.  
The frontend (Angular) is not implemented and therefore not included.
```

## 🚀 Technologies Used
- IDE IntelliJ
- Java 21  
- Spring Boot 3.5.7  
- Spring Web  
- Spring Data JPA (only for EntityManager; DAO pattern used)  
- MariaDB (using MySql Workbench client tool)
- Maven  
- Native SQL queries with EntityManager  
- RESTful API design  

---

## ⚙️ Setup Instructions

### 1. Configure MariaDB
Import the provided SQL file (`nation.sql`) into MariaDB using MySQL Workbench.

### 2. Update application.properties
```
spring.datasource.url=jdbc:mariadb://localhost:3307/nation
spring.datasource.username= springdemo
spring.datasource.password= springdemo
spring.datasource.driver-class-name =  org.mariadb.jdbc.Driver

server.port = 8080

spring.jpa.show-sql=true
jpa.hibernate.ddl-auto = validate

logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.orm.jdbc.bind=trace
```

📌 Task Summary
Η παρακάτω ενότητα περιγράφει συνοπτικά τις λειτουργίες που υλοποιήθηκαν για κάθε Task.

Task1a (Return All Countries)
```
Entities: Country
DAO: CountryDAO + CountryDAOImpl
JPQL query: Task1a.sql
REST Controller endpoint: CountryController -> GET /api/countries
```
Task1b (Return all the Languages for a Country)
```
Entities: Languages + CountryLanguages
DAO: CountryLangDAO + CountryLangDAOImpl
Native SQL Query: Task1b.sql
REST Controller endpoint: CountryLangController -> GET /api/countries/{id}/languages
```
Task2 (Return Max GDP/Population per Country)
```
Entities: CountryStats + CountryMaxStats
DAO: CountryMaxStatsDAO + CountryMaxStatsDAOImpl
Native SQL Query: Task2.sql
REST Controller endpoint: CountryMaxStatsController ->  GET /api/stats/max_ratio
```
Task3 (Return data using Filters)
```
Entities: Continents + Regions + FilterStats
DAO: FilterStatsDAO + FilterStatsDAOImpl
Native SQL Query: Task3.sql
REST Controller endpoint: FilterStatsController ->  GET /api/filters/{Id}/{yearFrom}/{yearTo}
```

🗂 Folder Structure
src/main/java/com/fullstack/demo/
    dao/
    entity/
    rest/
    DemoApplication.java

## ▶️ Running the Application
After cloning the repository and importing the database, you can start the backend using Maven: 

mvn spring-boot:run


📎 Notes
```
All tasks implemented using DAO pattern.
All queries are Native SQL except Task 1a which uses JPQL.
Angular frontend is not included.
