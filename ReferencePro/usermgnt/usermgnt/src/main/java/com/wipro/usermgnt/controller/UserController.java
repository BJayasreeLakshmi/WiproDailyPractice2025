package com.wipro.usermgnt.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.usermgnt.dto.Token;
import com.wipro.usermgnt.entity.User;
import com.wipro.usermgnt.service.UserService;

@RestController
@RequestMapping("/user")
 
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping
	List<User> findAll()
	{
		System.out.println("user-findAll--");
		return userService.findAll();
	}
	@GetMapping("/{id}")
	User findById(@PathVariable int id)
	{
		return userService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		 userService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody User user)
	{
		userService.save(user);
		
	}
	
	@PutMapping
	void update(@RequestBody User user)
	{
		userService.save(user);
		
	}
	
	@PostMapping("/login")
	Token login(@RequestBody User user)
	{
		return userService.login(user);
		 
	}

}






//import java.util.List;
//
//import com.wipro.usermgnt.dto.Token;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.wipro.usermgnt.entity.User;
//import com.wipro.usermgnt.service.UserService;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    UserService userServie;
//
//    @GetMapping
//    List<User> findAll() {
//        return userServie.findAll();
//    }
//
//    @GetMapping("/{id}")
//    User findById(@PathVariable int id) {
//        return userServie.findById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    void deleteById(@PathVariable int id) {
//        userServie.deleteById(id);
//    }
//
//    @PostMapping
//    void save(@RequestBody User user) {
//        userServie.save(user);
//    }
//
//    @PutMapping
//    void update(@RequestBody User user) {
//        userServie.save(user);
//    }
//
//    @PostMapping("/login")
//    public Token login(@RequestBody User user) {
//        Token token = userServie.login(user);
//        if (token != null) {
//            System.out.println("Generated token: " + token.getToken());
//            return token;
//        }
//        throw new RuntimeException("Invalid credentials");
//    }
//}
