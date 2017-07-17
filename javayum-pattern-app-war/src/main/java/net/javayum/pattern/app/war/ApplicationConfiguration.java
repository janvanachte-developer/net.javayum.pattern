package net.javayum.pattern.app.war;


import net.javayum.pattern.ws.SpringRESTConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
        SpringRESTConfiguration.class
)
public class ApplicationConfiguration {
}