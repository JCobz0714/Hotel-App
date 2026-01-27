package com.jacobo.springboot.hotel_app.hotel_app.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Room;

public interface RoomRepository extends CrudRepository<Room, Long> {
    Optional<Room> findByRoomNumber(Long roomNumber);
}
