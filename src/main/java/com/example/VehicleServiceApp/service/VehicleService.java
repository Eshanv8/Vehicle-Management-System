package com.example.VehicleServiceApp.service;

import com.example.VehicleServiceApp.model.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    List<Vehicle> getVehiclesByYear(int serviceYear);
    String getVehicleTypeById(Long serviceId);
    void deleteVehiclesByYear(int serviceYear);
}
