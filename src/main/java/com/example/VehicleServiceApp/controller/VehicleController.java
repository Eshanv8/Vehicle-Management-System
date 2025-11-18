package com.example.VehicleServiceApp.controller;

import com.example.VehicleServiceApp.model.Vehicle;
import com.example.VehicleServiceApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService; // Connects to Service, not Repository directly

    // 1. Get by Year
    @GetMapping("/by-year/{year}")
    public ResponseEntity<List<Vehicle>> getVehiclesByYear(@PathVariable int year) {
        List<Vehicle> vehicles = vehicleService.getVehiclesByYear(year);
        if (vehicles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicles);
    }

    // 2. Get Type by ID
    @GetMapping("/type/{id}")
    public ResponseEntity<String> getVehicleType(@PathVariable Long id) {
        String type = vehicleService.getVehicleTypeById(id);
        if (type == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(type);
    }

    // 3. Delete by Year
    @DeleteMapping("/by-year/{year}")
    public ResponseEntity<String> deleteVehiclesByYear(@PathVariable int year) {
        vehicleService.deleteVehiclesByYear(year);
        return ResponseEntity.ok("All records for year " + year + " have been deleted.");
    }
}