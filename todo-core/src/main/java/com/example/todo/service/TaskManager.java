package com.example.todo.service;

import com.example.todo.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {

    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title, LocalDate dueDate) {
        tasks.add(new Task(title, dueDate));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Optional<Task> getTaskById(String id) {
        return tasks.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    public boolean completeTask(String id) {
        Optional<Task> task = getTaskById(id);
        task.ifPresent(t -> t.setCompleted(true));
        return task.isPresent();
    }

    public boolean deleteTask(String id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden.");
        } else {
            tasks.forEach(t -> System.out.println(t.getId() + " → " + t));
        }
    }
}