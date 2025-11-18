package com.example.VehicleServiceApp.repository;

import com.example.VehicleServiceApp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    // Question 1: Find all vehicles by year
    List<Vehicle> findByServiceYear(int serviceYear);

    // Question 2: Find specific vehicle type by Service ID using custom Query
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :id")
    String findVehicleTypeByServiceId(@Param("id") Long serviceId);

    // Question 3: Delete all records by year
    @Transactional
    void deleteByServiceYear(int serviceYear);
}