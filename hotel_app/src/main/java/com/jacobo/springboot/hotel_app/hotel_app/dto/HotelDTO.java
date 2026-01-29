package com.jacobo.springboot.hotel_app.hotel_app.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class HotelDTO {
    @NotBlank
    private String hotelName;

    @NotNull
    private List<Long> roomNumbers;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Long> getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(List<Long> roomNumbers) {
        this.roomNumbers = roomNumbers;
    }
}
