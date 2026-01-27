package com.jacobo.springboot.hotel_app.hotel_app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jacobo.springboot.hotel_app.hotel_app.entities.Booking;
import java.util.List;
import java.sql.Date;



public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findByCheckInDate(Date checkInDate);
}
