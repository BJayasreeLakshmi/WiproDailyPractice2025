package com.wipro.usermgnt.service;

import java.util.List;

import com.wipro.usermgnt.entity.User;



public interface UserService {

	List<User> findAll();
	User findById(int id);
	void save(User user);
	void deleteById(int id);
	String login(User user);
	
}