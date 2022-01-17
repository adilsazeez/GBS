package com.example.globalbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.User;
import com.example.globalbus.repos.UserRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="loginController")
public class LoginController {
	
	@Autowired
	UserRepository userRepository;
	
//	@GetMapping("/login")
//	public User loginCheck(@RequestParam("email") String email, @RequestParam("password") String password) {
//		return userRepository.findByEmail(email);
//		if(user.getPassword().equals(password)) {
//			System.out.println("Login Successful!");
//			return "/userDashboard"	;
//		}
//		System.out.println("Login not Successful!");
//	}
		@PostMapping("/login")//get user by id
	    public User GetUser(@RequestParam("email") String email, @RequestParam("password") String password) {
	        User user = userRepository.findByEmail(email);
	        if(user!=null) {
		        if(user.getPassword().equals(password)) {
					return user;
		        }
		        else {
		        	return null;
		        }
	        }
	   
	        	return null;
	      
	    }
	
	
	

}
