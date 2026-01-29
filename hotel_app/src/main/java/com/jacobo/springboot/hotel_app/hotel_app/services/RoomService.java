package com.jacobo.springboot.hotel_app.hotel_app.services;

import java.util.List;

import com.jacobo.springboot.hotel_app.hotel_app.dto.RoomDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Room;

public interface RoomService {
    List<Room> findAll();

    Room save(RoomDTO roomDTO);
}
