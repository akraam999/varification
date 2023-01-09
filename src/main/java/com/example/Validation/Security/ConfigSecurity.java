package com.example.Validation.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ConfigSecurity extends WebSecurityConfigurerAdapter{

	
	@Override
	public void configure(HttpSecurity http ) throws Exception{
		http.csrf().disable()
		.authorizeRequests().antMatchers("/get_users","/add_user").permitAll();
	}
}
