package com.hotel.service.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String>{

}
