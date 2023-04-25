package com.book.bookserviceconnector.config;

import com.book.bookserviceconnector.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BookConnectorConfig {

    @Value("${web-client.base-url}")
    String baseUrl;

    @Bean
    public BookService bookService(WebClient.Builder webClientBuilder) {
        WebClient webClient = webClientBuilder
                .baseUrl(baseUrl)
                .build();

        return new BookService(webClient);
    }
}
