package net.javayum.pattern.app.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext;

        applicationContext = SpringApplication.run(Application.class, args);
    }
}

