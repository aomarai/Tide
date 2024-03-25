package com.aomaraie.tide.userservice.repository;

import com.aomaraie.tide.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}