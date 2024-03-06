package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.EmmissionInspection;

@Repository
public interface EmmissionsInspecRepository extends JpaRepository<EmmissionInspection,Long>{

}