package com.book.bookserviceconnector.service;

import com.book.bookserviceconnector.model.ResponseFromBookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;


@HttpExchange("/books")
public interface BookService {

    @GetExchange
    ResponseFromBookService getAvailableBooks();

    @GetExchange("/{id}")
    ResponseFromBookService getBookById(@PathVariable int id);







}
