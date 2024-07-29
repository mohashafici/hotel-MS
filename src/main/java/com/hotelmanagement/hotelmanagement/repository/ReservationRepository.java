package com.hotelmanagement.hotelmanagement.repository;

import com.hotelmanagement.hotelmanagement.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
