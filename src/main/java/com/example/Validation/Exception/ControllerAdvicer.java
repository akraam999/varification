package com.example.Validation.Exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvicer extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EmailNotValid.class)
	public ResponseEntity<?> EmailNotValid(EmailNotValid ex , WebRequest req){
		Map<String,Object> body = new HashMap<>();
		body.put("message ",ex.getMessage());
		body.put("Timestamp", new Date());
		return new ResponseEntity<>(body,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(PasswordNotValid.class)
	public ResponseEntity<?> PasswordNotValid(PasswordNotValid ex, WebRequest req){
		Map<String,Object> body = new HashMap<>();
		body.put("message", ex.getMessage());
		body.put("Timestamp", new Date());
		return new ResponseEntity<>(body,HttpStatus.BAD_REQUEST);
		
	}

}
