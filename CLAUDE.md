# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Java/Spring Boot REST API for a todo list. Learning project — developer has 7 years Flutter experience, transitioning to backend Java.

- GitHub: https://github.com/AngeloAntonioScholze/todo-api
- Stack: Java 25, Spring Boot 3.5.x, Maven, PostgreSQL, Lombok, Spring Data JPA

## Role

Guide and review only. Do not write implementation code. User builds, Claude reviews.

## Commands

```bash
./mvnw spring-boot:run
./mvnw test
./mvnw test -Dtest=SomeTest
```

## Architecture

```
controller/   → HTTP layer (routes, request/response)
service/      → business logic, validation
repository/   → database access (JpaRepository)
model/        → JPA entities
```

## Progress

- [x] Todo entity (`model/Todo.java`)
- [x] TodoRepository (`repository/TodoRepository.java`)
- [ ] TodoService
- [ ] TodoController
- [ ] Error handling
- [ ] Tests

## Notes

Parent standards: `C:\Users\angelo\Documents\projects\CLAUDE.md`. Java overrides:
- Use Maven (not Bun/uv)
- Use Checkstyle or Spotless for formatting
