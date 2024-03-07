package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Owners;

@Repository
public interface OwnersRepository extends JpaRepository<Owners,String> {
    
}