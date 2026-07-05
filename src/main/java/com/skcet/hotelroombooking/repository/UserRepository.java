package com.skcet.hotelroombooking.repository;

import com.skcet.hotelroombooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}