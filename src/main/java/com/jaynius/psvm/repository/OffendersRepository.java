package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Offenders;

@Repository
public interface OffendersRepository extends JpaRepository<Offenders,Long>{
    
}
