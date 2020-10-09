package com.parkinglot.parkinglotdesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkinglot.parkinglotdesign.entity.VehicleDTO;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long> {

}
