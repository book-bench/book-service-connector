package com.book.bookserviceconnector.model;

import java.util.List;

public class ResponseFromBookService {
    List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "ResponseFromBookService{" +
                "books=" + books +
                '}';
    }
}
