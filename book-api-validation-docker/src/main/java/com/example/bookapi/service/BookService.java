package com.example.bookapi.service;

import com.example.bookapi.dto.BookDTO;
import com.example.bookapi.model.Book;
import com.example.bookapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    public Book addBook(BookDTO dto) {
        Book book = new Book(dto.getTitle(), dto.getAuthor());
        return repository.save(book);
    }

    public Optional<Book> updateBook(Long id, BookDTO dto) {
        return repository.findById(id).map(existing -> {
            existing.setTitle(dto.getTitle());
            existing.setAuthor(dto.getAuthor());
            return repository.save(existing);
        });
    }

    public boolean deleteBook(Long id) {
        return repository.findById(id).map(book -> {
            repository.delete(book);
            return true;
        }).orElse(false);
    }
}
