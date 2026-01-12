# =========================
# Build stage
# =========================
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven config and source
COPY pom.xml .
COPY src ./src

# Build the application (tests already removed)
RUN mvn clean package -DskipTests

# =========================
# Run stage
# =========================
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
