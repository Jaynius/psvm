package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Police;

@Repository
public interface PoliceRepository extends JpaRepository<Police,String>{
    
}
