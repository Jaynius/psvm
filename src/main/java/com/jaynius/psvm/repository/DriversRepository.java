package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Drivers;

@Repository
public interface DriversRepository extends JpaRepository<Drivers,String>{

}
