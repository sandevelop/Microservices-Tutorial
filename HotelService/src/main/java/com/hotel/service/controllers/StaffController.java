package com.hotel.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class StaffController {

	@GetMapping
	public String justToConfigMultipleURL()
	{
		return "Just to config multiple Url in yml file for a microservice. (Check Hotel config service in API gateway.)";
	}
}
