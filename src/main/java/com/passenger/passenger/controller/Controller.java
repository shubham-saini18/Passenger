package com.passenger.passenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.passenger.model.Passenger;
import com.passenger.passenger.service.PasService;

@RestController
public class Controller {
@Autowired
private PasService p;
@GetMapping("/passenger")
public List<Passenger> getPassengerList(){
	return this.p.getPessenger();
}
}
