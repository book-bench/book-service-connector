package com.book.bookserviceconnector;

import com.book.bookserviceconnector.model.Book;
import com.book.bookserviceconnector.model.ResponseFromBookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@SpringBootApplication
public class BookServiceConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceConnectorApplication.class, args);	}

}
