package com.graujuan.boatman.service.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.graujuan.boatman.business.Boat;
import com.graujuan.boatman.business.Equipment;
import com.graujuan.boatman.business.User;
import com.graujuan.boatman.service.rest.repository.BoatRepository;
import com.graujuan.boatman.service.rest.repository.EquipmentRepository;
import com.graujuan.boatman.service.rest.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Exposes a root "/" service to show a welcome message 
 */

@RestController
public class APIChekController {
	
	//Just in case we need to access users info in the future
	@Autowired
	UserRepository repository;

	// Root API entry point
	@RequestMapping("/")
	public String index() {
		return "Boatman API";
	}
}