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
mvn clean package


```

## 🐳 Docker verwenden

```bash
docker build -t book-api-validation .
docker run -p 8080:8080 book-api-validation
```

## 📘 Swagger UI

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 🧪 Beispiel-Test

```bash
mvn test
```

Testet POST-Anfrage mit leerem JSON → HTTP 400 mit Fehlermeldungen

## 🧑‍💻 Autor

Thanh – Java Fullstack Developer
