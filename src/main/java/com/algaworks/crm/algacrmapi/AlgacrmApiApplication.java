package com.algaworks.crm.algacrmapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AlgacrmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgacrmApiApplication.class, args);
	}

}
