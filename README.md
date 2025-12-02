# BMI Calculator Spring Application

## Overview
A Kotlin-based Spring Boot application for calculating Body Mass Index (BMI) with LMS (Lambda-Mu-Sigma) parameter support. This service provides APIs for BMI calculations and management of LMS parameters used in growth chart assessments.

## Features
- BMI calculation capabilities
- LMS parameter management (Lambda-Mu-Sigma values used in pediatric growth charts)
- RESTful API endpoints
- Docker containerization support

## Prerequisites
- Java 26
- Maven
- Docker (optional, for containerized deployment)

## Getting Started

### Building the Application
```bash
./mvnw clean package
```


### Running the Application
```bash
java -jar target/*.jar
```


### Using Docker
The application includes a [Dockerfile](file:///home/xora-dev-rayan/IdeaProjects/BMI-Calculator/bmi-calculator-spring/Dockerfile) for containerization:

```bash
# Build the Docker image
docker build -t bmi-calculator-spring .

# Run the container
docker run -p 8085:8085 bmi-calculator-spring
```


## API Endpoints
The application exposes RESTful endpoints for:
- LMS parameter management ([LMSParameterService](file:///home/xora-dev-rayan/IdeaProjects/BMI-Calculator/bmi-calculator-spring/src/main/kotlin/com/xora/dev/rayan/spring/bmi_calculator/service/LMSParameterService.kt#L5-L9))
- BMI calculations
- Data persistence operations

## Architecture
Built with:
- Kotlin programming language
- Spring Boot framework
- Maven build system
- Multi-stage Docker build process

## Port Configuration
The application runs on port `8085` when deployed via Docker.

## Services
- [LMSParameterService](file:///home/xora-dev-rayan/IdeaProjects/BMI-Calculator/bmi-calculator-spring/src/main/kotlin/com/xora/dev/rayan/spring/bmi_calculator/service/LMSParameterService.kt#L5-L9): Handles LMS parameter operations including upsert, bulk insert, and retrieval by age and sex parameters
