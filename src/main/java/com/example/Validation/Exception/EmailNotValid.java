package com.example.Validation.Exception;

public class EmailNotValid extends RuntimeException {

	
	private String message; 
	
	public EmailNotValid(String message) {
		super();
		this.message=message;
		
	}
	public EmailNotValid() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
