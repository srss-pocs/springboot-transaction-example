package com.example.jpa.dto;

import com.example.jpa.entity.PassengerInfo;
import com.example.jpa.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;

	private PaymentInfo paymentInfo;
}
