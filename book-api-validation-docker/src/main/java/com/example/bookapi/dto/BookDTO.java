package com.example.bookapi.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDTO {

    @NotBlank(message = "Titel darf nicht leer sein")
    private String title;

    @NotBlank(message = "Autor darf nicht leer sein")
    private String author;

    // Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}