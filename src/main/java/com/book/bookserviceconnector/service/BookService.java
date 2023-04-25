package com.book.bookserviceconnector.service;

import com.book.bookserviceconnector.model.Book;
import com.book.bookserviceconnector.model.ResponseFromBookService;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


public class BookService {

    WebClient webClient;

    public BookService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Book> getAvailableBooks() {

        ResponseFromBookService response = webClient
                .get()
                .uri("/books")
                .retrieve()
                .bodyToMono(ResponseFromBookService.class)
                .block();

        return response.getBooks();
    }

    public Book getBookById(int id) {

        String path = "/books/" + id;

        ResponseFromBookService response =  webClient
                .get()
                .uri(path)
                .retrieve()
                .bodyToMono(ResponseFromBookService.class)
                .block();

        return response.getBooks().get(0);
    }





}
