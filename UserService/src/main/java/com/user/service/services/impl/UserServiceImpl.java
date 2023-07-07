package com.user.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.entity.Hotel;
import com.user.service.entity.Rating;
import com.user.service.entity.User;
import com.user.service.externalservices.HotelService;
import com.user.service.externalservices.RatingService;
import com.user.service.repos.UserRepository;
import com.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private RatingService ratingService;
	
	@Override
	public User saveUser(User user) {
		
		String randomUserId = UUID.randomUUID().toString();
        user.setId(randomUserId);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		User user = userRepo.findById(userId).get();
		List<Rating> ratingList = ratingService.getRatingsByUser(userId);
		user.setRatings(ratingList);
		ratingList.stream().forEach(rating ->
		{
			Hotel hotel = hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
		});
		return user;
	}

}
