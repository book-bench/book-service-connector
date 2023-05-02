package com.book.bookserviceconnector.service;

import com.book.bookserviceconnector.model.ResponseFromBookService;
import org.springframework.web.reactive.function.client.WebClient;



public class BookService {

    WebClient webClient;

    public BookService(WebClient webClient) {
        this.webClient = webClient;
    }

    public ResponseFromBookService getAvailableBooks() {

        return webClient
                .get()
                .uri("/books")
                .retrieve()
                .bodyToMono(ResponseFromBookService.class)
                .block();
    }

    public ResponseFromBookService getBookById(int id) {

        String path = "/books/" + id;

        return webClient
                .get()
                .uri(path)
                .retrieve()
                .bodyToMono(ResponseFromBookService.class)
                .block();
    }





}
