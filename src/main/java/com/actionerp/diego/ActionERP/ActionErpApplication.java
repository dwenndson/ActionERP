package com.actionerp.diego.ActionERP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActionErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionErpApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("=====================");
			System.out.println("=====Funcionando=====");
			System.out.println("=====================");
		};
	}

}
