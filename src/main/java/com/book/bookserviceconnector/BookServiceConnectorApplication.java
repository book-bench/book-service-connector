package com.book.bookserviceconnector;

import com.book.bookserviceconnector.service.BookService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BookServiceConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceConnectorApplication.class, args);

	}

	@Bean
	ApplicationRunner applicationRunner(BookService bookService) {
		return args -> bookService.getBookById(1).getBooks().forEach(System.out::println);
	}

}
