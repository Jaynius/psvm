package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.PsVehicle;

@Repository
public interface PsVehicleRepository extends JpaRepository<PsVehicle,String> {

}
