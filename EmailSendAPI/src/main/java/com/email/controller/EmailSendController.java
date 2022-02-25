package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.EmailService;
import com.email.sender.Email;

@RestController
public class EmailSendController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendmail")
	public String SendEmail(@RequestBody Email email)
	{
		System.out.println(email);
		this.emailService.sendmail(email.getTo(), email.getSubject(), email.getMessage());
		return "email send sucessfull...";
	}

}
