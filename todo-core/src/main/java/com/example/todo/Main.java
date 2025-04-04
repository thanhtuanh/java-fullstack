package com.example.todo;

import com.example.todo.service.TaskManager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n📋 To-Do Liste:");
            manager.printTasks();
            System.out.println("\n[1] Aufgabe hinzufügen  [2] Abschließen  [3] Löschen  [0] Beenden");
            System.out.print("Auswahl: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Titel: ");
                    String title = scanner.nextLine();
                    System.out.print("Fälligkeitsdatum (YYYY-MM-DD): ");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
                    manager.addTask(title, dueDate);
                }
                case "2" -> {
                    System.out.print("ID der Aufgabe zum Abschließen: ");
                    String id = scanner.nextLine();
                    if (!manager.completeTask(id)) {
                        System.out.println("❌ Aufgabe nicht gefunden.");
                    }
                }
                case "3" -> {
                    System.out.print("ID der Aufgabe zum Löschen: ");
                    String id = scanner.nextLine();
                    if (!manager.deleteTask(id)) {
                        System.out.println("❌ Aufgabe nicht gefunden.");
                    }
                }
                case "0" -> running = false;
                default -> System.out.println("Ungültige Eingabe.");
            }
        }
        scanner.close();
    }
}