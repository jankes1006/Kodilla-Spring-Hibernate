package com.kodilla.library.service;

import com.kodilla.library.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    void createBook(Book book);

    void deleteBook(int index);
}
