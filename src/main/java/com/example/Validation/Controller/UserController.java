package com.example.Validation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Validation.Entity.User;
import com.example.Validation.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/get_users")
	public ResponseEntity<?> get_users(){
		return new ResponseEntity<>(service.get_all(),HttpStatus.ACCEPTED);
	}
	@PostMapping("/add_user")
	public ResponseEntity<?> add_user(@RequestBody User user){
		return new ResponseEntity<>(service.add_user(user),HttpStatus.ACCEPTED);
	}
}
