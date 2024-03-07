package com.jaynius.psvm.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.MechanicalInspection;

@Service
public interface MechInspecService {
    public ResponseEntity<MechanicalInspection> addInspection(MechanicalInspection newInspection);
    public ResponseEntity<MechanicalInspection> getInspectionById(Long inspectionId);
    public ResponseEntity<MechanicalInspection> updateInspectionById(Long inspectionId);
    public ResponseEntity<MechanicalInspection> getAllInspectio();
    public ResponseEntity<MechanicalInspection> deleteById(Long inspectionId);
    
}
