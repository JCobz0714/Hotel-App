package com.jacobo.springboot.hotel_app.hotel_app.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
    Optional<Hotel> findByHotelName(String hotelName);
}
