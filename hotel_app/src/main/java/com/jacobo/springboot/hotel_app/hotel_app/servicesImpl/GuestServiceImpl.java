package com.jacobo.springboot.hotel_app.hotel_app.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jacobo.springboot.hotel_app.hotel_app.dto.GuestDTO;
import com.jacobo.springboot.hotel_app.hotel_app.entities.Guest;
import com.jacobo.springboot.hotel_app.hotel_app.repositories.GuestRepository;
import com.jacobo.springboot.hotel_app.hotel_app.services.GuestService;

public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> findAll() {
        return (List<Guest>) repository.findAll();
    }

    @Override
    public Guest save(GuestDTO guestDTO) {
        Guest guest = new Guest();

        guest.setFullName(guestDTO.getFullName());

        return repository.save(guest);
    }

}
