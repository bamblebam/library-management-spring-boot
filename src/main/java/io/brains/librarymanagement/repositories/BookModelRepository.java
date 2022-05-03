package io.brains.librarymanagement.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.brains.librarymanagement.models.BookModel;

@Repository
public interface BookModelRepository extends MongoRepository<BookModel, String> {

}
