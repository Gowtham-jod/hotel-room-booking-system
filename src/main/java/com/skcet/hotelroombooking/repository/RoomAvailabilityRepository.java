package com.skcet.hotelroombooking.repository;

import com.skcet.hotelroombooking.entity.RoomAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomAvailabilityRepository extends JpaRepository<RoomAvailability, Long> {
}