package com.email.sender;


/**
 * 
 * @author 33000014
 *
 */
public class Email {
	
	private String to;
	private String subject;
	private String message;
	public Email(String to, String subject, String message) {
		super();
		this.to = to;
		this.subject = subject;
		this.message = message;
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
