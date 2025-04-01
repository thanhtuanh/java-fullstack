package com.example.bookapi.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDTO {

    private Long id;

    @NotBlank(message = "Titel darf nicht leer sein")
    private String title;

    @NotBlank(message = "Autor darf nicht leer sein")
    private String author;

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
