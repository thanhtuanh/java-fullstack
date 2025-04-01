# 🧠 Java Fullstack Demo-Projekt

Dies ist ein öffentliches Lern- und Demo-Projekt, das ich als Fullstack Java Entwickler im Rahmen meiner Vorbereitung auf Bewerbungen erstellt habe.  
Es zeigt meine Kenntnisse in **Java**, **Spring Boot**, **RESTful APIs**, **Clean Code**, **Datenbankzugriff**, **Docker**, und **CI/CD**.

Ziel ist es, in mehreren Phasen ein vollständiges, realitätsnahes Beispielprojekt aufzubauen – von der einfachen API bis zum produktionsreifen Microservice.

---

## 🚀 Projektübersicht

| Teil | Thema                                                   |
| ---- | ------------------------------------------------------- |
| 1    | Java Core & Clean Code                                  |
| 2    | Spring Boot & REST-API (Book Service)                   |
| 3    | Spring Data JPA & relationale Datenbank (H2/PostgreSQL) |
| 4    | Fehlerbehandlung, DTOs, Validierung                     |
| 5    | Docker & Containerisierung                              |
| 6    | CI/CD mit GitHub Actions                                |
| 7    | Erweiterung mit Frontend (Angular oder Vue)             |

---

## 📦 Technologien

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 (In-Memory) & PostgreSQL (optional)
- Maven
- JUnit 5 & MockMvc
- Swagger / OpenAPI
- Docker (geplant)
- GitHub Actions (geplant)
- Angular / Vue.js (optional)

---

## 📁 Projektstruktur

java-fullstack/
├── README.md <- Zentrale Übersicht
├── todo-core/
│ └── README.todo-core.md
├── book-api/
│ └── README.book-api.md
├── book-api-validation/
│ ├── README.book-api-validation.md
│ ├── book-api.http
│ ├── media/
│ └── ...

## 📂 Teilprojekte

- [`todo-core`](./todo-core/README.todo-core.md)
- [`book-api`](./book-api/README.book-api.md)
- [`book-api-full`](./book-api-full/README.book-api-full.md)
- [`book-api-validation`](./book-api-validation/README.book-api-validation.md)

## ▶️ Projekt ausführen

Hier findest du die wichtigsten Befehle, um jedes Modul zu starten oder zu testen.

---

```bash

### ✅ `todo-core`
cd todo-core
mvn compile
mvn exec:java -Dexec.mainClass="com.example.todo.Main"
mvn test

### ✅ `book-api`
cd book-api
mvn clean install
mvn spring-boot:run
mvn test

### ✅ `book-api-full`
cd book-api-full
mvn clean install
mvn spring-boot:run
mvn test

### ✅ `book-api-validation`
cd book-api-validation
mvn clean install
mvn spring-boot:run
mvn test
```
