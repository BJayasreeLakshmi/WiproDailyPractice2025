package com.wipro.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig {
	
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(
				auth->auth
				.requestMatchers("/greet")
				.permitAll()
				.anyRequest()
				.authenticated())		 	 
	            .formLogin(withDefaults());
		return http.build();	
	}
	@Bean
	UserDetailsService user()
	{
		UserDetails user=User.withUsername("jay")
				.password(encodePassword().encode("pass")).build();
		UserDetails user1=User.withUsername("jayasree")
				.password(encodePassword().encode("pass")).build();
		  return new InMemoryUserDetailsManager(user,user1);
	}
	@Bean
	PasswordEncoder encodePassword()
	{
		return new BCryptPasswordEncoder();
	}

}
