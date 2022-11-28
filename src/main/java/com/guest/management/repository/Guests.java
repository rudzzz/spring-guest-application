package com.guest.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guest.management.model.Guest;

public interface Guests extends JpaRepository<Guest, Long>{

}
