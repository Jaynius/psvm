package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.MechanicalInspection;

@Service
public interface MechInspecService {
    public ResponseEntity<MechanicalInspection> addInspection(MechanicalInspection newInspection);
    public ResponseEntity<MechanicalInspection> getInspectionById(Long inspectionId);
    public ResponseEntity<MechanicalInspection> updateInspectionById(Long inspectionId);
    public ResponseEntity<List<MechanicalInspection>> getAllInspection();
    public ResponseEntity<MechanicalInspection> deleteById(Long inspectionId);
    
}
