package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookServices {
    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(123, "java tut", "saurabh"));
    // list.add(new Book(124, "python tut", "shubham"));
    // list.add(new Book(125, "javascript tut", "ketan"));
    // }

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return (List<Book>) this.bookRepository.findAll();
    }

    public Book getBookById(int id) {
        Book book = null;
        try {
            book = this.bookRepository.findBookById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book book) {
        this.bookRepository.save(book);
        return book;
    }

    public void deleteBook(int bookId) {
        this.bookRepository.deleteById(bookId);
    }

    public void update(Book book, int bookId) {
        book.setId(bookId);
        this.bookRepository.save(book);

    }
}
