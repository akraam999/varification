package com.example.Validation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_client; 
	@Column(name="email")
	private String email; 
	@Column(name="password")
	private String password;
	@Column(name="ville")
	private String ville;
	@Column(name="age")
	private int age;
	public User(Long id_client, String email, String password, String ville, int age) {
		super();
		this.id_client = id_client;
		this.email = email;
		this.password = password;
		this.ville = ville;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_user) {
		this.id_client = id_client;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
}
