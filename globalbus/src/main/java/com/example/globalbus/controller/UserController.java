package com.example.globalbus.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalbus.entities.User;
import com.example.globalbus.repos.UserRepository;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class UserController {
	

	
//	UserService service;
//	
//	@PostMapping("/addUser")
//	public User addUser(@RequestBody RegisterUserRequest request) {
//		
//		User user = service.registerUser(request);
//		return user;
//		
//	}
	
	@Autowired
	UserRepository userRepository;
	

	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
//		service.registerUser(user);
		return userRepository.save(user);
//		System.out.println(user);
	
		
	}
	
	@GetMapping("/getUsers")
    public List<User> GetUsers() {
        return userRepository.findAll();
    }
	
	 @GetMapping("/edit/{id}")//get user by id
	    public User GetUser(@PathVariable Long id) {
	        return userRepository.findById(id).orElse(null);
	    }
	 @PutMapping("/addUser")
	    public User PutUser(@RequestBody User user) {
	        User oldUser = userRepository.findById(user.getId()).orElse(null);
	        oldUser.setFirstName(user.getFirstName());
	        oldUser.setLastName(user.getLastName());
	        oldUser.setEmail(user.getEmail());
	        oldUser.setPassword(user.getPassword());
	        return userRepository.save(oldUser);
	    }
	 @DeleteMapping("/deleteUser/{id}")
	    public Long DeleteUser(@PathVariable Long id) {
	        userRepository.deleteById(id);
	        return id;
	    }
	 
	
	

}
