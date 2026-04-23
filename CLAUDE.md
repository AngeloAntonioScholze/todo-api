# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Java todo REST API. Git initialized, source not yet added.

- GitHub: https://github.com/AngeloAntonioScholze/todo-api
- Stack: Java 21+, Spring Boot 3.x, Maven or Gradle (TBD)

## Commands

> Expand once build system chosen.

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

Parent standards: `C:\Users\angelo\Documents\projects\CLAUDE.md`. Java overrides:
- Use Maven or Gradle (not Bun/uv)
- Use Checkstyle or Spotless for formatting
