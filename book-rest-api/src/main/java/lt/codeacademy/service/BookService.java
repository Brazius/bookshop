package lt.codeacademy.service;

import lt.codeacademy.entities.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> findAll();

    Book findById(Long id);

    Book save(Book book);

    Book update (Book book);

    Book deleteById(Long id);
}
