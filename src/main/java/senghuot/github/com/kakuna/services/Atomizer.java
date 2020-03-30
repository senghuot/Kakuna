package senghuot.github.com.kakuna.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Atomizer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "atomizer");
        SpringApplication.run(Atomizer.class, args);
    }
}
