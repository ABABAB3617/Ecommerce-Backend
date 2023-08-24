package com.ecommercen.ecommercebackend;

import com.ecommercen.ecommercebackend.model.Customer;
import com.ecommercen.ecommercebackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  EcommerceBackendApplication {


	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}


}
