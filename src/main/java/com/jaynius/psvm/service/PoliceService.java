package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Police;

@Service
public interface PoliceService {
    public ResponseEntity<Police> addOfiicer(Police newOfficer);
    public ResponseEntity<Police> getOfficerById(String badgeNumber);
    public ResponseEntity<Police> updateOfficerById(Police officer,String badgeNumber);
    public ResponseEntity<List<Police>> getAllOfficers();
    public ResponseEntity<Police> deleteOfficerById(String badgeNumber);
    
}
