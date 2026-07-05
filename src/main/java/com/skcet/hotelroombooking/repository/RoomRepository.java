package com.skcet.hotelroombooking.repository;

import com.skcet.hotelroombooking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}