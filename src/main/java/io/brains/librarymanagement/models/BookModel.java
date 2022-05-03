package io.brains.librarymanagement.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

// Book Model
@Document
public class BookModel {
    @Id
    private String id;

    @Field
    private String title;

    @Field
    private String author;

    @Field
    private String genre;

    @Field
    private String publisher;

    @Field
    private String description;

    public BookModel() {
    }

    public BookModel(String title, String author, String genre, String publisher, String description) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.description = description;
    }

    // @Override
    // public String toString() {
    //     return "BookModel{" +
    //             "id='" + id + '\'' +
    //             ", title='" + title + '\'' +
    //             ", author='" + author + '\'' +
    //             ", genre='" + genre + '\'' +
    //             ", publisher='" + publisher + '\'' +
    //             ", description='" + description + '\'' +
    //             '}';
    // }
}
