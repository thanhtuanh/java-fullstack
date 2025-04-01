# 📚 Book API Validation – Docker + CI/CD Erweiterung

Dieses Projekt ist eine Erweiterung des Projekts **Book API Validation – Docker**  
und enthält nun zusätzlich eine vollständige **CI/CD-Integration mit GitHub Actions**.

Ziel ist es, eine vollständige Fullstack-Architektur aufzubauen mit:

- 📦 Java Spring Boot REST-API
- 🧪 Validierung & Fehlerbehandlung
- 🐳 Docker-Containerisierung
- 🔄 Automatisiertes Build & Test über GitHub Actions
- 📊 Testberichte & Code-Coverage als Artefakte
- (Nächster Schritt: Frontend-Integration mit Angular oder Vue)

---

## 🔄 CI/CD mit GitHub Actions

Dieses Projekt verwendet **GitHub Actions**, um bei jedem Push oder Pull Request auf den Branch `main` automatisch folgende Schritte auszuführen:

### ⚙️ Automatisierter Workflow-Ablauf

- 🔄 Quellcode aus dem Repository klonen
- ☕ Java-Umgebung mit JDK 17 bereitstellen
- 🧪 Build und Unit-Tests mit Maven (`mvn clean verify`)
- 📊 Code-Coverage mit JaCoCo generieren
- 🐳 Docker-Image erstellen
- 📦 Testberichte und Coverage als Artefakte hochladen

📸 **Ablauf im GitHub Actions Workflow (Ergebnis):**

## ![CI/CD Workflow Ablauf](./assets/result-image.gif)
