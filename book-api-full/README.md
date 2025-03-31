# 📚 Book API – Spring Boot + JPA + H2

Dies ist ein vollständiges Spring Boot Projekt mit REST API für die Verwaltung von Büchern, JPA-Datenbankanbindung und H2-Konsole.

## 🚀 Features

- REST API: CRUD für Bücher
- Datenbank: H2 (in-memory)
- Spring Boot + Spring Data JPA
- H2-Webkonsole aktiviert
- Maven Build

## ▶️ Starten

```bash
mvn clean install
mvn spring-boot:run
```

## 🌐 Endpunkte

- `GET    /api/books`
- `POST   /api/books`
- `GET    /api/books/{id}`
- `PUT    /api/books/{id}`
- `DELETE /api/books/{id}`

## 🖥️ H2-Konsole

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:booksdb`
- Benutzer: `sa` (ohne Passwort)

## 📦 Tech-Stack

- Java 17
- Spring Boot 3.2.3
- Spring Data JPA
- H2 Database

---

## 🎞️ Demo (Terminal & CURL als GIF)

Die folgende Animation zeigt die REST-API im Einsatz mit `curl`-Befehlen direkt im Terminal:

![Book API Demo](book-api-full/media/demo.gif)
