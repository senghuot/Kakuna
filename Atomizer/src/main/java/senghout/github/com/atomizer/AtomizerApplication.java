package senghout.github.com.atomizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AtomizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtomizerApplication.class, args);
	}

}
