package com.example.VehicleServiceApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_service")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private String vehicleType; // e.g., Car, Van
    private int serviceYear;    // e.g., 2023
    private String ownerName;   // e.g., Kamal

    // --- Constructors ---
    public Vehicle() {
    }

    public Vehicle(String vehicleType, int serviceYear, String ownerName) {
        this.vehicleType = vehicleType;
        this.serviceYear = serviceYear;
        this.ownerName = ownerName;
    }

    // --- Getters and Setters ---
    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getServiceYear() {
        return serviceYear;
    }

    public void setServiceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}