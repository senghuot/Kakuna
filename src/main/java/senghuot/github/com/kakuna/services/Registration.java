package senghuot.github.com.kakuna.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Registration {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "registration");
        SpringApplication.run(Registration.class, args);
    }
}
