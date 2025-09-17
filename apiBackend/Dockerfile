# ==============================
# Etapa 1: Compilación con Maven
# ==============================
FROM maven:3.9.11-eclipse-temurin-21 AS build

WORKDIR /app

# Copiamos los archivos de configuración de Maven primero
COPY pom.xml .
COPY src ./src

# Compilamos y empaquetamos la app (genera un JAR en target/)
RUN mvn clean package -DskipTests

# ==============================
# Etapa 2: Imagen final ligera
# ==============================
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copiar el JAR desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto de la aplicación Spring Boot
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]
