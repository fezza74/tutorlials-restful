package com.gfd.tutorials;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.gfd.tutorials.repository.IUserRepository;


@SpringBootApplication
public class TutorialsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TutorialsApplication.class, args);
	}
}
