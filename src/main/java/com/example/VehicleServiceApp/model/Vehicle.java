package com.example.VehicleServiceApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    @Column(nullable = false)
    private String vehicleType;

    @Column(nullable = false)
    private String ownerName;

    @Column(nullable = false)
    private int serviceYear;

    @Column(nullable = false)
    private String serviceDetails;
}
