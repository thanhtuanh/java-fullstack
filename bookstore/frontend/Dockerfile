# Phase 1: Build der Angular App
FROM node:18-alpine as build
WORKDIR /app

# Abhängigkeiten installieren
COPY package*.json ./
RUN npm install

# Projektquellcode kopieren und Angular Build starten
COPY . .
RUN npm run build --prod

# Phase 2: NGINX für das fertige Build verwenden
FROM nginx:1.25-alpine
COPY --from=build /app/dist/frontend /usr/share/nginx/html

# Optional: eigene nginx.conf für SPA-Routing
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
