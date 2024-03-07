package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.MechanicalInspection;

@Repository
public interface MechInspecRepository extends JpaRepository<MechanicalInspection,Long>{
    
}
