# 📚 Book API Validation – Docker Edition

Dieses Projekt zeigt eine vollständige Spring Boot REST API mit DTO-Validierung, globalem Fehler-Handling, MockMvc-Tests und Docker-Deployment.

## 🚀 Features

- `POST /api/books` – Buch mit Validierung anlegen
- `GET /api/books` – Liste aller Bücher
- DTO mit `@NotBlank`-Validierung
- Fehlerbehandlung mit `@ControllerAdvice`
- JUnit 5 + MockMvc Integrationstests
- H2-Datenbank (in-memory)
- Swagger UI automatisch aktiv
- Dockerfile zum Containerisieren

## ▶️ Projekt starten

```bash
mvn clean package ## Hier starte mockmvc unittest

```

## 🐳 Docker verwenden

```bash
docker-compose down
docker-compose up --build

```

## 🧪 Testübersicht

### 🛡️ Eingabevalidierung & Fehlerbehandlung (HTTP 400)

![Validation Demo](media/validation-demo.gif)

### 🧪 Automatisierte REST-Tests mit JUnit 5 & MockMvc

![JUnit Test](media/mockmvc-test.gif)

### 📘 Interaktive API-Dokumentation mit Swagger UI

![Swagger Demo](media/swagger-demo.gif)

### 📄 API-Tests mit .http-Dateien direkt in VS Code

![HTTP File Demo](media/http-test.gif)

## 🧑‍💻 Autor

Thanh – Java Fullstack Developer
