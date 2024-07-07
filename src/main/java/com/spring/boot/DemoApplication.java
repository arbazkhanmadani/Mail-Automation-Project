package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.services.MailService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		MailService emailService = context.getBean(MailService.class);
		
	}

}
