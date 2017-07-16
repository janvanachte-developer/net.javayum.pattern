package net.javayum.pattern.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class Application {

    private static final String SPRING_PROFILE_DEFAULT = "spring.profiles.default";
    private static final String SPRING_PROFILE_DEVELOPMENT = "net.javayum.common.infra.spring.profile.development";
    private static final String SPRING_PROFILE_PRODUCTION = "net.javayum.common.infra.,spring.profile.production";

    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    private final Environment environment;

    public static void main(String[] args) {

        ApplicationContext applicationContext;

        // minimalistic: applicationContext = SpringApplication.run(Application.class, args);

        // more elaborate
        SpringApplication springApplication = new SpringApplicationBuilder()
                //.bannerMode(Banner.Mode.OFF)
                // Banner in banner.txt
                .sources(Application.class)
                .build();

        setDefaultProfile(springApplication, SPRING_PROFILE_DEVELOPMENT);

        applicationContext = springApplication.run(args);

        Environment environment = applicationContext.getEnvironment();
        logger.info(environment.getProperty("net.javayum.pattern.app.springboot.property"));
    }

    //optional
    public Application(Environment environment) {

        this.environment = environment;
    }

    //optional
    @PostConstruct
    public void checkProfiles() {
        Collection<String> activeProfiles = Arrays.asList(environment.getActiveProfiles());
        if (activeProfiles.contains(SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(SPRING_PROFILE_PRODUCTION)) {
            logger.error("You have misconfigured your application! It should not run " +
                    "with both the 'dev' and 'prod' profiles at the same time.");
        }
    }

    public static void setDefaultProfile(SpringApplication springApplication, String profile) {
        Map<String, Object> properties = new HashMap<>();
        properties.put(SPRING_PROFILE_DEFAULT, SPRING_PROFILE_DEVELOPMENT);
        springApplication.setDefaultProperties(properties);
    }
}

