package com.primova.primova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimovaApplication.class, args);
		System.out.print("Rodou");
	}

}
