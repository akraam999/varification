package com.example.Validation.Exception;




public class PasswordNotValid extends RuntimeException{
    String message;
	
	public PasswordNotValid(String message) {
		super();
		this.message=message;
	}
	public PasswordNotValid() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
