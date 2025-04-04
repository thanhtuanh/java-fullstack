package com.example.todo.model;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
    private final String id;
    private String title;
    private boolean completed;
    private LocalDate dueDate;

    public Task(String title, LocalDate dueDate) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "[" + (completed ? "x" : " ") + "] " + title + " (Fällig am: " + dueDate + ")";
    }
}