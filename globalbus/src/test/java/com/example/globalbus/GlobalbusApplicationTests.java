package com.example.globalbus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.globalbus.entities.User;
import com.example.globalbus.repos.UserRepository;


@SpringBootTest
class GlobalbusApplicationTests {

	
	@Autowired
	private UserRepository repo;
	
//	@Test
//	void insertUserTesing() {
//		User user = new User();
//		user.setFirstName("Adil");
//		user.setLastName("Azeez");
//		user.setId(1001);
//		user.setEmail("adil@gmail.com");
//		user.setPassword("adil");
//		repo.save(user);
//	}

	@Test
	void removeUserTesing() {
		User user = repo.findById((1l)).get();
		repo.delete(user);
	}

}
