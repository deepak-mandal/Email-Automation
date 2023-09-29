package io.github.deepakmandal;

import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class EmailAppApplication {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailAppApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() throws MessagingException {
		Instant start = Instant.now();
		String[] emailArr = { "dkm.iitg@gmail.com", 
				"deepa170122014@alumni.iitg.ac.in", 
				"deepakkumar.mandal@cgi.com", 
				};

		int noOfEmailSent =0;
		for (String toEmail : emailArr) {
			try {
				emailService.sendMessageWithAttachment(toEmail);
				noOfEmailSent++;
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		Instant end = Instant.now();
		System.out.println("total no. of message sent = "+noOfEmailSent);
		System.out.println("Time taken to send "+ noOfEmailSent +" emails is "+Duration.between(start, end));
	}

}
