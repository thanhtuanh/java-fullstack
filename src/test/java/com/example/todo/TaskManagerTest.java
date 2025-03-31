package com.example.todo;

import com.example.todo.service.TaskManager;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void testAddAndCompleteTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test-Aufgabe", LocalDate.now());

        var tasks = manager.getAllTasks();
        assertEquals(1, tasks.size());

        String taskId = tasks.get(0).getId();
        assertTrue(manager.completeTask(taskId));
        assertTrue(tasks.get(0).isCompleted());
    }

    @Test
    void testDeleteTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Aufgabe zum Löschen", LocalDate.now());
        String id = manager.getAllTasks().get(0).getId();

        assertTrue(manager.deleteTask(id));
        assertEquals(0, manager.getAllTasks().size());
    }
}