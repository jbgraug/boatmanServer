package com.graujuan.boatman;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.graujuan.boatman.service.rest.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories("com.graujuan.*")
@ComponentScan(basePackages = { "com.graujuan.*" })
@EntityScan("com.graujuan.*")
public class Application {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		// Start the Spring boot application
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner initRun(UserRepository repository) {
		return (args) -> {
			// Just to test init stuff
			// repository.save(new User("juan", "grau"));
		};
	}

}
