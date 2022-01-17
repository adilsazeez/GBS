package com.example.globalbus.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.globalbus.entities.Seat;
import com.example.globalbus.entities.SeatEntity;

public interface SeatRepository extends JpaRepository<Seat, SeatEntity> {

//	@Query("select seatNo from seat where busId=:busId and status=0")
//	List findAvailableSeats(@Param("busId") Long busId);

}
