package lt.codeacademy.service.impl;

import lt.codeacademy.entities.Book;
import lt.codeacademy.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    private Long bookId = 100L;
    private Map<Long, Book> bookMap = new HashMap<Long, Book>();

    {
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("Gera knyga");
        book.setAuthor("Geras Zmogus");
        book.setCoverPhotoURL("https://images.unsplash.com/photo-1532012197267-da84d127e765?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80");
        book.setIsbnNumber(1234567890L);
        book.setPrice(10.00);
        book.setLanguage("English");
        bookMap.put(book.getId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookMap.values();
    }

    @Override
    public Book findById(Long id) {
        return bookMap.get(id);
    }

    @Override
    public Book save(Book book) {
        Long newBookId = ++bookId;
        book.setId(newBookId);
        bookMap.put(book.getId(), book);
        return bookMap.get(newBookId);
    }

    @Override
    public Book update(Book book) {
        bookId = book.getId();
        if (bookMap.get(bookId) != null) {
            bookMap.put(bookId, book);
            return bookMap.get(bookId);
        }
        return null;
    }

    @Override
    public Book deleteById(Long id) {
        if(bookMap.get(id) != null) {
            return bookMap.remove(id);
        }
        return null;
    }
}
