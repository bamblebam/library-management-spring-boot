package io.brains.librarymanagement.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    //Get all the books
    @GetMapping("/books")
    public List<BookModel> getBooks() throws Exception {
        return bookModelRepository.findAll();
    }

    //Create a book
    @PostMapping("/books/create")
    public void createBook(@RequestBody Map<String,Object> payload) throws Exception {
        BookModel bookModel = new BookModel(payload.get("title").toString(), payload.get("author").toString(), payload.get("genre").toString(), payload.get("publisher").toString(), payload.get("description").toString());
        bookModelRepository.save(bookModel);
        System.out.println("Saved");
    }
}
