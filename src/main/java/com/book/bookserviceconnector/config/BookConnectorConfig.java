package com.book.bookserviceconnector.config;

import com.book.bookserviceconnector.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class BookConnectorConfig {

    @Value("${web-client.base-url}")
    String baseUrl;

    @Bean
    public BookService bookService(WebClient.Builder webClientBuilder) {
        WebClient webClient = webClientBuilder
                .baseUrl(baseUrl)
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient)).build();
        return factory.createClient(BookService.class);
    }
}
