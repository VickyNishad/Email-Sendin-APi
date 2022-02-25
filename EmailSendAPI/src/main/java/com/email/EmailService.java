package com.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {
	
	
	@Autowired
	private JavaMailSender mailSender;
	

	public void sendmail(String toMail , String subject , String Body)
	{
		
		SimpleMailMessage email = new SimpleMailMessage();
//		email.setFrom("vickynishad07@gmail.com");
		email.setTo(toMail);
		email.setSubject(subject);
		email.setText(Body);
		
		mailSender.send(email);
	}

}
