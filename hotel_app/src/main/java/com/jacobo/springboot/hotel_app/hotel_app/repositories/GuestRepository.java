package com.jacobo.springboot.hotel_app.hotel_app.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long> {
    Optional<Guest> findByFullName(String fullName);
}
