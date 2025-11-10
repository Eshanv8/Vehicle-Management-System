package com.example.VehicleServiceApp.controller;

import com.example.VehicleServiceApp.model.Vehicle;
import com.example.VehicleServiceApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // Create vehicle
    @PostMapping
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    // Get all vehicles
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    // 1️⃣ Get vehicles by service year
    @GetMapping("/year/{year}")
    public List<Vehicle> getVehiclesByYear(@PathVariable int year) {
        return vehicleService.getVehiclesByYear(year);
    }

    // 2️⃣ Get only vehicle type by service ID
    @GetMapping("/type/{id}")
    public String getVehicleType(@PathVariable Long id) {
        return vehicleService.getVehicleTypeById(id);
    }

    // 3️⃣ Delete vehicles by year
    @DeleteMapping("/year/{year}")
    public ResponseEntity<String> deleteVehiclesByYear(@PathVariable int year) {
        vehicleService.deleteVehiclesByYear(year);
        return ResponseEntity.ok("All vehicles from year " + year + " deleted successfully.");
    }
}
