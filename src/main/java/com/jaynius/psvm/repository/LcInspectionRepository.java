package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaynius.psvm.model.LoadCrgoInspection;

public interface LcInspectionRepository extends JpaRepository<LoadCrgoInspection,Long> {
    
}
