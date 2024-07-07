package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.services.MailService;

@Controller
public class MailController {

	@Autowired
	private MailService mailService;
	
	@GetMapping("/send-mail")
	@ResponseBody
	public String sendMail(){
		
		mailService.setTo("arbazkhan03092001@gmail.com");
		mailService.setSub("from arbaz............");
		mailService.setText("test.................");
		//mailService.sendMailUtil("arbazkhan03092001@gmail.com","This is from springboot","test mail..........");
		System.out.println("mail sent");
		return "sent................";
	}
}
