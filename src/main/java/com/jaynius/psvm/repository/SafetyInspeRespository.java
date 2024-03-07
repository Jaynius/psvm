package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.SafetyInspection;

@Repository
public interface SafetyInspeRespository extends JpaRepository<SafetyInspection,Long> {
    
}
