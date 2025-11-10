package com.example.VehicleServiceApp.service.impl;

import com.example.VehicleServiceApp.model.Vehicle;
import com.example.VehicleServiceApp.repository.VehicleRepository;
import com.example.VehicleServiceApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getVehiclesByYear(int serviceYear) {
        return vehicleRepository.findByServiceYear(serviceYear);
    }

    @Override
    public String getVehicleTypeById(Long serviceId) {
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }

    @Override
    public void deleteVehiclesByYear(int serviceYear) {
        vehicleRepository.deleteByServiceYear(serviceYear);
    }
}
