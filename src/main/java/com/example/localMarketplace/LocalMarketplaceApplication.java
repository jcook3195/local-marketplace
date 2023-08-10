package com.example.localMarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class LocalMarketplaceApplication {

	public static void main(String[] args) {
		Date aDate = new Date();
//		System.out.println(aDate);

		SpringApplication.run(LocalMarketplaceApplication.class, args);
	}

}
