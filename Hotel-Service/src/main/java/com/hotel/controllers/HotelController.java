package com.hotel.controllers;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    // add hotel
    @PostMapping()
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotelObj){
        return new ResponseEntity<>(hotelService.create(hotelObj), HttpStatus.CREATED);
    }
    
    @GetMapping("/{hotelId}")
    public ResponseEntity<Optional<Hotel>> getHotelById(@PathVariable("hotelId") String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(hotelId));
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }
}
