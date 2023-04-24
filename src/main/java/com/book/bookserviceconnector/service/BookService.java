package com.book.bookserviceconnector.service;

import com.book.bookserviceconnector.model.Book;
import com.book.bookserviceconnector.model.ResponseFromBookService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


public class BookService {

    public List<Book> getAvailableBooks() {
        WebClient client = WebClient.create("http://localhost:8080");
        ResponseFromBookService response = client
                .get()
                .uri("/books")
                .retrieve()
                .bodyToMono(ResponseFromBookService.class)
                .block();

        return response.getBooks();
    }

}
