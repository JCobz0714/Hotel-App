package com.jacobo.springboot.hotel_app.hotel_app.services;

import java.util.List;

import com.jacobo.springboot.hotel_app.hotel_app.dto.GuestDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Guest;

public interface GuestService {
    List<Guest> findAll();

    Guest save(GuestDTO guestDTO);

    boolean existsById(Long id);
}
