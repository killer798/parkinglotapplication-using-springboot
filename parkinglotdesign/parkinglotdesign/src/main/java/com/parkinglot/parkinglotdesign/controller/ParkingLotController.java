package com.parkinglot.parkinglotdesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkinglot.parkinglotdesign.entity.VehicleDTO;
import com.parkinglot.parkinglotdesign.service.ParkingService;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	@Autowired
	ParkingService parkingService;
	
	@GetMapping("/paringinfo")
	public List<VehicleDTO> getAllVehicles(){
		return parkingService.getAllVehicles();
	}
	
	@PostMapping("/park")
	public String park(VehicleDTO vehicleDTO) {
		return parkingService.park(vehicleDTO);
		
	}
	
	@DeleteMapping("/unpark")
	public String unpark(Long id) {
		return parkingService.unpark(id);
		
	}
	

}
