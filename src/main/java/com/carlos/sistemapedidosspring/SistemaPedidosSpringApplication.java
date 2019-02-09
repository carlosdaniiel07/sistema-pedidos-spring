package com.carlos.sistemapedidosspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaPedidosSpringApplication implements CommandLineRunner {
		public static void main(String[] args) {
		SpringApplication.run(SistemaPedidosSpringApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		seedDatabase();
	}
	
	// Povoa o banco com dados padrões
	private void seedDatabase() 
	{
		// you can seed your database in this method..
	}
}

