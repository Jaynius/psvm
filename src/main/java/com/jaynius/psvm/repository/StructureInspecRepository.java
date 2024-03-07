package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.StructureInspection;

@Repository
public interface StructureInspecRepository extends JpaRepository<StructureInspection,Long>{

    

    
}
