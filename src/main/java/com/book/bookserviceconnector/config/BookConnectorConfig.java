package com.book.bookserviceconnector.config;

import com.book.bookserviceconnector.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConnectorConfig {

    @Bean
    public BookService bookService() {
        return new BookService();
    }
}
