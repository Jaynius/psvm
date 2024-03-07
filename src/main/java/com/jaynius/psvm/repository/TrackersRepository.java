package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Trackers;

@Repository
public interface TrackersRepository extends JpaRepository<Trackers,String>{
    
}
