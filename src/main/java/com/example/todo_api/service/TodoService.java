package com.example.todo_api.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.todo_api.exception.TodoNotFoundException;
import com.example.todo_api.model.Todo;
import com.example.todo_api.repository.TodoRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository repository;

    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    public Todo getTodoById(@NonNull Long id) {
        final Optional<Todo> response = repository.findById(id);
        if(response.isPresent()) return response.get();
        throw new TodoNotFoundException(id);
    }

    public Todo createTodo(@NonNull Todo todo) {
        return repository.save(todo);
    }

    public Todo updateTodo(@NonNull Long id, @NonNull Todo updated) {
        final Optional<Todo> todo = repository.findById(id);
        if(todo.isPresent()) {
            final Todo t = todo.get();
            t.setDescription(updated.getDescription());
            t.setTitle(updated.getTitle());
            t.setCompleted(updated.isCompleted());
            return repository.save(t);
        }
        throw new TodoNotFoundException(id);
    }

    public void deleteTodo(@NonNull Long id) {
        repository.deleteById(id);
    }

}
