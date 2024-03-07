package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.StructureInspection;

@Service
public interface StructInspecService {
    public ResponseEntity<StructureInspection> addInspection(StructureInspection newInspection);
    public ResponseEntity<StructureInspection> getInspectionById(Long inspectionId);
    public ResponseEntity<StructureInspection> updateInspectionById(StructureInspection inspection, Long inspectionId);
    public ResponseEntity<List<StructureInspection>> getAllInspection();
    public ResponseEntity<StructureInspection> deleteByInspectionId(Long inspectionId);
    
}
