package com.example.VehicleServiceApp.repository;

import com.example.VehicleServiceApp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    // 1️⃣ Get all vehicles by service year
    List<Vehicle> findByServiceYear(int serviceYear);

    // 2️⃣ Get vehicle type by service ID (only one column)
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(@Param("serviceId")Long serviceId);

    // 3️⃣ Delete all by service year
    void deleteByServiceYear(int serviceYear);
}
