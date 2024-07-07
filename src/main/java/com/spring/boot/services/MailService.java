package com.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@EnableScheduling
@Service
public class MailService {

	@Autowired
    private JavaMailSender emailSender;    

	private String to;
	private String sub;
	private String text;

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}


    public void sendMailUtil(String to, String subject, String text) {
       System.out.println("test..........................");
    	SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
   
    
   @Scheduled(cron="0/1 * * * * *")
   public void mailSechulder(){
	   sendMailUtil(getTo(), getSub(), getText());
   }
    
}
