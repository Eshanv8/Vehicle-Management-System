package com.example.VehicleServiceApp.service;

import com.example.VehicleServiceApp.model.Vehicle;
import com.example.VehicleServiceApp.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    // Logic for Question 1
    public List<Vehicle> getVehiclesByYear(int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    // Logic for Question 2
    public String getVehicleTypeById(Long id) {
        return vehicleRepository.findVehicleTypeByServiceId(id);
    }

    // Logic for Question 3
    public void deleteVehiclesByYear(int year) {
        vehicleRepository.deleteByServiceYear(year);
    }
}