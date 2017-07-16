package net.javayum.pattern.app.springboot.web;

import net.javayum.pattern.ws.SpringSOAPConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
        SpringSOAPConfiguration.class
)
public class ApplicationConfiguration {
}
