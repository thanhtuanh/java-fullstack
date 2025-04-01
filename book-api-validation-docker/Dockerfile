# --- Build Stage ---
FROM maven:3.9.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# --- Runtime Stage ---
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /app/target/book-api-validation-docker-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
