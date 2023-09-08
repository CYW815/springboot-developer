package me.cyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootDeveloperApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeveloperApplication.class, args);
	}

}
