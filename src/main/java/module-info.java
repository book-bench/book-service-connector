open module book.service.connector.main {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.webflux;
    requires spring.web;

    requires com.fasterxml.jackson.core;

    requires org.apache.tomcat.embed.core;
}