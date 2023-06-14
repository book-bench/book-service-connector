open module book.service.connector.main {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.webflux;
    requires spring.beans;

    requires com.fasterxml.jackson.core;

    requires org.apache.tomcat.embed.core;

    exports com.book.bookserviceconnector.model;
    exports com.book.bookserviceconnector.service;



}