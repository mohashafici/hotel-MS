package com.hotelmanagement.hotelmanagement.repository;

import com.hotelmanagement.hotelmanagement.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
