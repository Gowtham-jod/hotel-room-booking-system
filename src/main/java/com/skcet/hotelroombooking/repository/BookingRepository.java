package com.skcet.hotelroombooking.repository;

import com.skcet.hotelroombooking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}