package com.user.service.externalservices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.service.entity.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

	@GetMapping("/ratings/users/{userId}")
	List<Rating> getRatingsByUser(@PathVariable("userId") String userId);
	
	@PostMapping("/ratings")
    public ResponseEntity<Rating> create(@RequestBody Rating rating);
}
