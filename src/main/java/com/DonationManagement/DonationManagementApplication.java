package com.DonationManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationManagementApplication.class, args);
		System.out.println("Donation is up now!");
	}

}
