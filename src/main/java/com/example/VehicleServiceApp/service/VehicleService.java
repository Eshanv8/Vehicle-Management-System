package com.example.VehicleServiceApp.service;

import com.example.VehicleServiceApp.model.Vehicle;
import java.util.List;

public interface VehicleService {
    // Just method signatures here. No code logic.
    
    Vehicle saveVehicle(Vehicle vehicle); // You had this in your errors
    
    List<Vehicle> getAllVehicles();       // You had this in your errors
    
    List<Vehicle> getVehiclesByYear(int year);
    
    String getVehicleTypeById(Long id);
    
    void deleteVehiclesByYear(int year);
}