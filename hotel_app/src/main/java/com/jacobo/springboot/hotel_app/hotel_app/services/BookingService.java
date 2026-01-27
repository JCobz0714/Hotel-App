package com.jacobo.springboot.hotel_app.hotel_app.services;

import java.util.List;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Booking;

public interface BookingService {
    List<Booking> findAll();
}
