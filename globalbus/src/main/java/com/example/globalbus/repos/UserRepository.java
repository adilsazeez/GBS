package com.example.globalbus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.globalbus.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
