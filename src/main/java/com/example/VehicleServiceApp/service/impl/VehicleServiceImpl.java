package com.example.VehicleServiceApp.service.impl;

import com.example.VehicleServiceApp.model.Vehicle;
import com.example.VehicleServiceApp.repository.VehicleRepository;
import com.example.VehicleServiceApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return Objects.requireNonNull(vehicleRepository.save(vehicle), "Vehicle cannot be null after save");
    }
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getVehiclesByYear(int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    @Override
    public String getVehicleTypeById(Long id) {
        return vehicleRepository.findVehicleTypeByServiceId(id);
    }

    @Override
    @Transactional
    public void deleteVehiclesByYear(int year) {
        vehicleRepository.deleteByServiceYear(year);
    }
]