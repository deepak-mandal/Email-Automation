package io.github.deepakmandal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void sendMessageWithAttachment(String to) throws MessagingException {
		String subject = "Query regarding technical opportunity - Deepak, Software Engineer | IIT Guwahati";
		String text = "Dear sir/ma'am,<br/><br/>" + "Please find enclosed my Resume for your reference.<br/><br/>"
				+ "I'm Deepak, and currently working as a Software Engineer (Java full-stack Developer) at CGI. I have significant experties in Angular(TypeScript), Spring Boot(Java), SQL(Oracle DBMS)."
				+ "<ul><li>Experiences: 2+ years</li>" + "<li>Education: B.Tech., IIT Guwahati; 2017-2021</li></ul>"
				+ "Please let me know, if there is any relevant opportunity. Thank you.<br/><br/>"
				+ "Thanks and regards,<br/>"
				+ "<b>Deepak Kumar Mandal</b> | Software Engineer | B.Tech. - Indian Institute of Technology Guwahati<br/>"
				+ "dkmiitg@gmail.com | +91-7764933459";
		String pathToAttachment = "C:\\Users\\dkmii\\Desktop\\py\\Email-Automation-with-Python\\Deepak-Resume.pdf";
		MimeMessage message = emailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setFrom("dkmiitg@gmail.com");
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(text, true);

		FileSystemResource file = new FileSystemResource(new File(pathToAttachment));
		helper.addAttachment(file.getFilename(), file);

		emailSender.send(message);
		System.out.printf("message sent to %s successfully..!!\n", to);
	}
}
