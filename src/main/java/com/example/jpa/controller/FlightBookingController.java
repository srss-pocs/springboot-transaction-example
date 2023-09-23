package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.FlightBookingAcknowledgement;
import com.example.jpa.dto.FlightBookingRequest;
import com.example.jpa.service.FlightBookingService;

@RestController
public class FlightBookingController {

	@Autowired
	private FlightBookingService service;

	@PostMapping("/api/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return service.bookFlightTicket(request);
	}

}
