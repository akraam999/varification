package com.example.Validation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Validation.Entity.User;
import com.example.Validation.Exception.EmailNotValid;
import com.example.Validation.Exception.PasswordNotValid;
import com.example.Validation.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository rep;
	
	
	public User add_user(User user) {
		if(!user.getEmail().matches(".+@.+\\.[a-z]+")) {
			throw new EmailNotValid("l'email que vous avez entrez est non valide !");
		}
		if(user.getPassword().length()<10) {
			throw new PasswordNotValid("le mot de passe que vous avez entré est incorrect ! ");
		}
		return rep.save(user);
	}
	
	public List<User> get_all(){
		List<User> all_users = rep.findAll();
		List<User> ageSup18 = (List<User>) all_users.stream().filter(u->u.getAge()>18);
		return ageSup18;
	}
}
