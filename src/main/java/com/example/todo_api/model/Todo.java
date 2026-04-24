package com.example.todo_api.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String title;
    @Column
    private String description;
    @Column(nullable=false)
    private boolean  completed = false;
    @Column(nullable=false, updatable=false)
    @CreationTimestamp
    private  LocalDateTime createdAt;
    @Column(nullable=false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
