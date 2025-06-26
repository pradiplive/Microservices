package com.hotel.service;

import com.hotel.entities.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    //create hotel
    Hotel create(Hotel hotel);

    // get all
    List<Hotel> getAllHotels();

    //get hotel by id
    Optional<Hotel> getHotelById(String id);


}
