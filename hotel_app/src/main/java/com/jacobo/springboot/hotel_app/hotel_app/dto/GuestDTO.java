package com.jacobo.springboot.hotel_app.hotel_app.dto;

import jakarta.validation.constraints.NotBlank;

public class GuestDTO {
    @NotBlank
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
