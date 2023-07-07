package com.hotel.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entity.Hotel;
import com.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	 @Autowired
	    private HotelService hotelService;

	    

	    //create
	    @PostMapping
	    public ResponseEntity<Hotel> createUser(@RequestBody Hotel Hotel) {
	        Hotel user1 = hotelService.saveHotel(Hotel);
	        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	    }

	    //single Hotel get


	    @GetMapping("/{hotelId}")
	    public ResponseEntity<Hotel> getSingleUser(@PathVariable String hotelId) {

	        Hotel Hotel = hotelService.getHotel(hotelId);
	        return ResponseEntity.ok(Hotel);
	    }

	    
	    @GetMapping
	    public ResponseEntity<List<Hotel>> getAllUser() {
	        List<Hotel> allUser = hotelService.getAllHotel();
	        return ResponseEntity.ok(allUser);
	    }
	
}
