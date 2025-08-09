package com.wipro.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.user.entity.User;
import com.wipro.user.servie.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	
	 @PostMapping
	    public User create(@RequestBody User user) {
	        return userService.createUser(user);
	    }
	 
	 @PutMapping("/{id}")
	    public User update(@PathVariable int id, @RequestBody User user) {
	        return userService.updateUser(id, user);
	    }
	 
	 @DeleteMapping("/{id}")
	    public void delete(@PathVariable int id) {
	        userService.deleteUser(id);
	    }
	 
	 
	 @GetMapping("/{id}")
	    public User getOne(@PathVariable int id) {
	        return userService.getUser(id);
	    }
	 
	 @GetMapping
	    public List<User> getAll() {
	        return userService.getAllUsers();
	    }
	 
	 

}
