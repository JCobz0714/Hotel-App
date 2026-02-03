package com.jacobo.springboot.hotel_app.hotel_app.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jacobo.springboot.hotel_app.hotel_app.dto.BookingDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Booking;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Guest;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Room;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.BookingRepository;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.GuestRepository;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.RoomRepository;
import com.jacobo.springboot.hotel_app.hotel_app.services.BookingService;

public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository repository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public List<Booking> findAll() {
        return (List<Booking>) repository.findAll();
    }

    @Override
    public List<Booking> findByGuestId(Long guestId) {
        return repository.findByGuestId(guestId);
    }

    @Override
    public Booking save(BookingDTO bookingDTO) {
        Room room = roomRepository.findByRoomNumber(bookingDTO.getRoomNumber()).orElseThrow(() -> new RuntimeException("Room not found"));

        List<Room> rooms = new ArrayList<>();

        rooms.add(room);

        Guest guest = guestRepository.findByFullName(bookingDTO.getGuestName()).orElseThrow(() -> new RuntimeException("Guest not found"));

        Booking booking = new Booking();

        booking.setCheckInDate(bookingDTO.getCheckInDate());
        booking.setCheckOutDate(bookingDTO.getCheckOutDate());
        booking.setRooms(rooms);
        booking.setGuest(guest);

        return repository.save(booking);
    }

}
