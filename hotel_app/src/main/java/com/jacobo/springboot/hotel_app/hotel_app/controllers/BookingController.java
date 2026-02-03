package com.jacobo.springboot.hotel_app.hotel_app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Booking;
import com.jacobo.springboot.hotel_app.hotel_app.services.BookingService;
import com.jacobo.springboot.hotel_app.hotel_app.services.GuestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService service;

    @Autowired
    private GuestService guestService;

    @GetMapping()
    public List<Booking> bookings(@RequestParam String param) {
        return (List<Booking>) service.findAll();
    }
    

    @GetMapping("/{guest_id}")
    public List<Booking> guestBookings(@PathVariable Long guestId) {
        boolean guest = guestService.existsById(guestId);

        if(!guest || service.findByGuestId(guestId).isEmpty()) return List.of();

        return service.findByGuestId(guestId);
    }
    
    @GetMapping("/{guest_id/{booking_id}")
    public String getBooking() {
        return new String();
    }
}
