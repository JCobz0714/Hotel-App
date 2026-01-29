package com.jacobo.springboot.hotel_app.hotel_app.services;

import java.util.List;

import com.jacobo.springboot.hotel_app.hotel_app.dto.HotelDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Hotel;

public interface HotelService {
    List<Hotel> findAll();

    Hotel save(HotelDTO hotelDTO);
}
