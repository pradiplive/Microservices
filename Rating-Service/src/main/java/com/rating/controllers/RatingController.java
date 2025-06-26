package com.rating.controllers;

import com.rating.entities.Rating;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // create
    @PostMapping()
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        System.out.println(rating);
        return new ResponseEntity<>(ratingService.create(rating), HttpStatus.CREATED);
    }

    //get all ratings
    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRatings(){
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    //get all ratings wrt userId
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingsWrtUserID(@PathVariable("userId") String userId){
        System.out.println(userId);
        return new ResponseEntity<>(ratingService.getRatingByUserId(userId), HttpStatus.OK);
    }

    //get all ratings wrt hotelId
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingsWrtHotelId(@PathVariable("hotelId") String hotelId){
        return new ResponseEntity<>(ratingService.getRatingByHotelId(hotelId), HttpStatus.OK);
    }
}
