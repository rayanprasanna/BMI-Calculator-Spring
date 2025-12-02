# Build stage
FROM openjdk:11-jdk-slim AS builder
WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test

# Runtime stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
