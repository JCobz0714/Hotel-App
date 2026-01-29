package com.jacobo.springboot.hotel_app.hotel_app.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jacobo.springboot.hotel_app.hotel_app.dto.RoomDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Hotel;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Room;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.HotelRepository;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.RoomRepository;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.RoomService;

public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository repository;

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Room> findAll() {
        return (List<Room>) repository.findAll();
    }

    @Override
    public Room save(RoomDTO roomDTO){
        Hotel hotel = hotelRepository.findByHotelName(roomDTO.getHotelName()).orElseThrow(() -> new RuntimeException("Hotel not found"));

        Room room = new Room();

        room.setRoomNumber(roomDTO.getRoomNumber());
        room.setHotel(hotel);

        return repository.save(room);
    }
}
