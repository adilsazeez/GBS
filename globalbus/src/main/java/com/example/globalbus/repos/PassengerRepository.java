package com.example.globalbus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.globalbus.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
