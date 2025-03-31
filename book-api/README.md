# 📚 Book REST API – Spring Boot Demo

Dies ist der zweite Teil meines Fullstack-Demo-Projekts.  
Es demonstriert den Aufbau einer **RESTful API mit Spring Boot**, die einfache CRUD-Operationen auf einem Buch-Modell ausführt.

---

## 🚀 Funktionen

- 📖 Buch anlegen (`POST /api/books`)
- 📚 Alle Bücher abrufen (`GET /api/books`)
- 🔍 Buch nach ID anzeigen (`GET /api/books/{id}`)
- ✏️ Buch aktualisieren (`PUT /api/books/{id}`)
- ❌ Buch löschen (`DELETE /api/books/{id}`)
- 🧠 In-Memory Speicher (keine Datenbank)
- ✅ Fehlerbehandlung mit HTTP-Statuscodes

---

## 🎞️ Demo (Terminal & CURL als GIF)

Die folgende Animation zeigt die REST-API im Einsatz mit `curl`-Befehlen direkt im Terminal:

![Book API Demo](book-api/media/demo.gif)

---

## 🔧 Projekt starten

### 1. Projekt bauen

```bash
mvn clean install

```

mvn spring-boot:run
...
mvn test
