package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.LoadCrgoInspection;

@Repository
public interface LcInspectionRepository extends JpaRepository<LoadCrgoInspection,Long> {
    
}
