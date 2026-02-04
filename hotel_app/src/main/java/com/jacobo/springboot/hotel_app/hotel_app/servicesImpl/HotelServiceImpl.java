package com.jacobo.springboot.hotel_app.hotel_app.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacobo.springboot.hotel_app.hotel_app.dto.HotelDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Hotel;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Room;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.HotelRepository;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.RoomRepository;
import com.jacobo.springboot.hotel_app.hotel_app.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository repository;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Hotel> findAll() {
        return (List<Hotel>) repository.findAll();
    }

    @Override
    public Hotel save(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        List<Room> rooms = new ArrayList<>();

        hotel.setHotelName(hotelDTO.getHotelName());

        Hotel savedHotel = repository.save(hotel);

        for(Long roomNumber : hotelDTO.getRoomNumbers()){
            Room room = new Room();
            
            room.setRoomNumber(roomNumber);
            room.setHotel(savedHotel);

            rooms.add(room);

            roomRepository.save(room);
        }

        hotel.setRooms(rooms);

        return repository.save(hotel);
    }

}
