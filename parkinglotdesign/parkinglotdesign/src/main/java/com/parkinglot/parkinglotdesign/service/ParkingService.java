package com.parkinglot.parkinglotdesign.service;

import java.util.List;

import com.parkinglot.parkinglotdesign.entity.VehicleDTO;


public interface ParkingService {
	List<VehicleDTO> getAllVehicles();
	String park(VehicleDTO vehicleDTO);
	String unpark(Long id);

}
