package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Conductors;

@Repository
public interface ConductorsRepository extends JpaRepository<Conductors,String>{

}
