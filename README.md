# SpringBoot-ORM-PostgreSQL

A **Spring Boot 3.0.1** project demonstrating **Object-Relational Mapping (ORM)** with **JPA/Hibernate** and **PostgreSQL**.  
Exposes a REST API with **Spring Web** and **HATEOAS**, including validation and CRUD operations for mapped entities.

---

## Features
- 🔄 Object-Relational Mapping with **Spring Data JPA / Hibernate**
- 🗄️ Persistence to **PostgreSQL**
- 🌐 RESTful API with **Spring Web**
- ➕ Hypermedia controls via **Spring HATEOAS**
- ✅ Validation with **Hibernate Validator**
- ⚡ Developer hot reload with **Spring Boot DevTools**
- 🧪 Unit/integration tests with **Spring Boot Starter Test**

---

## Tech Stack
- **Java:** 17  
- **Framework:** Spring Boot 3.0.1  
- **ORM:** Hibernate (via Spring Data JPA)  
- **Database:** PostgreSQL  
- **API:** REST + HATEOAS  
- **Build Tool:** Maven (with wrapper)  

---

## Project Structure
```text
src/main/java/
└─ orm/com/orm/ # Base package (adjust to your actual code)
├─ entity/ # @Entity classes mapped to DB tables
├─ repository/ # Spring Data JPA repositories
├─ controller/ # REST controllers (@RestController)
├─ service/ # Business logic (if present)
└─ OrmApplication.java # @SpringBootApplication entry point
```
---
## Setup

### 1. Prerequisites
- Install **JDK 17**  
- Install **PostgreSQL** (local or remote)  
- Install **Maven 3.8+** (or use the included `mvnw` wrapper)

### 2. Database
Create a PostgreSQL database:
```sql
CREATE DATABASE ormdb;
```

3. Configuration

Edit src/main/resources/application.properties with your local credentials:
```java
  spring.datasource.url=jdbc:postgresql://localhost:5432/ormdb
  spring.datasource.username=postgres
  spring.datasource.password=YOUR_PASSWORD
  spring.datasource.driver-class-name=org.postgresql.Driver
  
  spring.jpa.hibernate.ddl-auto=update   # dev only; use migrations in prod
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.format_sql=true
```
4. Build & Run
```bash
  ./mvnw spring-boot:run
```
Application starts on:
  http://localhost:8080

Tests
```bash
./mvnw test
```
