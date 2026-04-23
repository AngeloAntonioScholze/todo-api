# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Java todo REST API. Directory currently empty — populate with build files and source before expanding this file.

## Expected Stack

- Java 21+
- Spring Boot 3.x (assumed from project type)
- Maven or Gradle

## Commands

> Fill in once project is initialized.

```bash
# Maven
./mvnw spring-boot:run
./mvnw test
./mvnw test -Dtest=SomeTest

# Gradle
./gradlew bootRun
./gradlew test
./gradlew test --tests "com.example.SomeTest"
```

## Notes

Parent project standards live in `C:\Users\angelo\Documents\projects\CLAUDE.md`. Key overrides for Java:
- This is a Java project, not TypeScript/Python
- Use Maven or Gradle (not Bun/uv)
- Use Checkstyle or Spotless for formatting
