# 🧠 Java Fullstack Demo-Projekt

Dies ist ein öffentliches Lern- und Demo-Projekt, das ich als Fullstack Java Entwickler im Rahmen meiner Vorbereitung auf Bewerbungen erstellt habe.  
Es zeigt meine Kenntnisse in **Java**, **Spring Boot**, **RESTful APIs**, **Clean Code**, **Datenbankzugriff**, **Docker**, **CI/CD** und **modernen Frontend-Technologien**.

Ziel ist es, in mehreren Phasen ein vollständiges, realitätsnahes Beispielprojekt aufzubauen – von der einfachen API bis zum produktionsreifen Microservice mit Frontend und Login-System.

Dieses Repository richtet sich sowohl an Entwickler als auch an Recruiter, Projektmanager und technische Entscheider. Jeder Teil ist dokumentiert und mit Testdaten und `.http`-Dateien sowie `.gif`-Aufzeichnungen nachvollziehbar.

---

## 🚀 Projektübersicht

| Teil | Thema                                                             |
| ---- | ----------------------------------------------------------------- |
| 1    | Java Core & Clean Code                                            |
| 2    | Spring Boot & REST-API (Book Service)                             |
| 3    | Spring Data JPA & relationale Datenbank (H2/PostgreSQL)           |
| 4    | Fehlerbehandlung, DTOs, Validierung                               |
| 5    | Docker & Containerisierung                                        |
| 6    | CI/CD mit GitHub Actions                                          |
| 7    | Vollständige Fullstack-Anwendung mit JWT Login & Angular Frontend |

---

## 📦 Technologien

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Security + JWT
- Spring Data JPA
- H2 (In-Memory) & PostgreSQL
- Maven
- JUnit 5 & MockMvc
- Swagger / OpenAPI
- Docker + docker-compose
- GitHub Actions (CI/CD)
- Angular (Frontend)

---

## 📁 Projektstruktur

```
java-fullstack/
├── README.md <- Zentrale Übersicht
├── todo-core/
│   └── README.todo-core.md
├── book-api/
│   └── README.book-api.md
├── book-api-full/
│   └── README.book-api-full.md
├── book-api-validation/
│   ├── README.book-api-validation.md
│   ├── book-api.http
│   ├── media/
├── book-api-validation-docker/
│   ├── README.book-api-validation-docker.md
│   ├── docker-compose.yml

```

## 📂 Teilprojekte

- [`todo-core`](./todo-core/README.todo-core.md) – Java-Basics ohne Spring
- [`book-api`](./book-api/README.book-api.md) – Erste REST-API mit Spring Boot
- [`book-api-full`](./book-api-full/README.book-api-full.md) – Datenbankzugriff mit JPA
- [`book-api-validation`](./book-api-validation/README.book-api-validation.md) – Validierung, Fehlerbehandlung, DTO
- [`book-api-validation-docker`](./book-api-validation-docker/README.book-api-validation-docker.md) – Docker & PostgreSQL
- [`mybookstore`](https://github.com/thanhtuanh/mybookstore) – Vollständige Fullstack-Anwendung mit Login + Angular

Jedes README enthält Screenshots oder `.gif`-Dateien zur Demonstration des Funktionsumfangs und `.http`-Dateien zum einfachen Testen.

---

## ▶️ Projekt ausführen & Testen

```bash
# ✅ Teil 1: todo-core
cd todo-core
mvn compile
mvn exec:java -Dexec.mainClass="com.example.todo.Main"
mvn test

# ✅ Teil 2: book-api
cd book-api
mvn spring-boot:run

# ✅ Teil 3: book-api-full
cd book-api-full
mvn spring-boot:run

# ✅ Teil 4: book-api-validation
cd book-api-validation
mvn spring-boot:run

# ✅ Teil 5: book-api-validation-docker
cd book-api-validation-docker
docker-compose up --build

---

## 🏁 Wichtigster Teil: `bookstore`

Das Modul `mybookstore` stellt die **wichtigste Projektphase** dar, in der alle Anforderungen umgesetzt wurden:

- **JWT-basierte Login-Funktion mit Spring Security 6**
- Benutzer-Authentifizierung und Token-Verwaltung
- Vollständige REST-API mit DTOs, Validierung, Swagger-Dokumentation
- **Frontend mit Angular**: Buchliste, Login-Seite, Routing, Token-Speicherung
- H2- oder PostgreSQL-Datenbank, konfigurierbar über `application.properties`
- Erweiterbar für zukünftige Features wie User-Registrierung oder Rollenverwaltung

👉 Details und Demo findest du im https://github.com/thanhtuanh/mybookstore.

---

📘 Dieses README wird regelmäßig aktualisiert – Feedback willkommen!
```
