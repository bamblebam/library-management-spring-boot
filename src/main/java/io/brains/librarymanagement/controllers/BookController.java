package io.brains.librarymanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.brains.librarymanagement.models.BookModel;
import io.brains.librarymanagement.repositories.BookModelRepository;

@RestController
public class BookController {
    private final BookModelRepository bookModelRepository;

    @Autowired
    public BookController(BookModelRepository bookModelRepository) {
        this.bookModelRepository = bookModelRepository;
    }

    @GetMapping("/books")
    public List<BookModel> getBooks() {
        return bookModelRepository.findAll();
    }
}
