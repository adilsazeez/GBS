package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.RegisterUserRequest;
import com.example.globalbus.entities.User;
import com.example.globalbus.repos.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserRepository userRepository;
	
//	public User registerUser(RegisterUserRequest request) {
//		System.out.println(request);
//		User user = new User();
//		user.setFirstName(request.getFirstName());
//		user.setLastName(request.getLastName());
//		user.setEmail(request.getEmail());
//		user.setPassword(request.getPassword());
//		System.out.println(user);
//		User savedUser = userRepository.save(user);
//		return savedUser;
//		
//		
//	
//	}
	public void registerUser(User user) {

		userRepository.save(user);
		

		
	
	}


	
}
