package com.hotel.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.service.entity.Hotel;

@Service
public interface HotelService {

	Hotel saveHotel(Hotel hotel);

    //get all hotel
    List<Hotel> getAllHotel();

    //get single hotel of given userId

    Hotel getHotel(String HotelId);
}
