package com.example.globalbus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.globalbus.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
