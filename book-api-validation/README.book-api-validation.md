# 📚 Book API – Spring Boot + DTO + Validation + JUnit + Swagger

Dies ist Teil meines Java Fullstack Demo-Projekts.  
Es zeigt, wie man eine saubere REST-API mit folgenden Technologien aufbaut:

- 📦 Spring Boot + Spring Data JPA
- 🗃️ H2 In-Memory-Datenbank
- 🧾 DTOs + Validierung mit `@Valid`
- 🧪 Unit-Tests mit JUnit 5 & MockMvc
- 📘 API-Dokumentation mit Swagger/OpenAPI

---

## 🚀 Features

- 📖 Buch anlegen (`POST /api/books`)
- 📚 Alle Bücher abrufen (`GET /api/books`)
- 🔍 Buch nach ID anzeigen (`GET /api/books/{id}`)
- ✏️ Buch aktualisieren (`PUT /api/books/{id}`)
- ❌ Buch löschen (`DELETE /api/books/{id}`)
- ✅ Eingabevalidierung mit Annotationen (`@NotBlank`, `@Valid`)
- 🧪 Unit-Tests mit `MockMvc`
- 📘 Dokumentation mit Swagger/OpenAPI

---

## 🧪 Testübersicht

### 🛡️ Eingabevalidierung & Fehlerbehandlung (HTTP 400)

![Validation Demo](media/validation-demo.gif)

### 🧪 Automatisierte REST-Tests mit JUnit 5 & MockMvc

![JUnit Test](media/mockmvc-test.gif)

### 📘 Interaktive API-Dokumentation mit Swagger UI

![Swagger Demo](media/swagger-demo.gif)

### 📄 API-Tests mit .http-Dateien direkt in VS Code

![HTTP File Demo](media/http-test.gif)
