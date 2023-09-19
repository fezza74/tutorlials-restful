package com.gfd.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				title = "Tutorial API", 
				version = "1.0", 
				description = "App to manage tutorials", 
				contact = @Contact(
						name = "Fezza Gianni",
						email = "fezza.gianni@aesys.tech"
						)
				),
		servers = @Server(
					description = "Server Locale",
					url = "http://localhost:8080"
				)
)
@SpringBootApplication
public class TutorialsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TutorialsApplication.class, args);
	}
}
