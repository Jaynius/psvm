package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.SafetyInspection;

@Service
public interface SafetyInspecService {
    public ResponseEntity<SafetyInspection> addInspection(SafetyInspection newInspection);
    public ResponseEntity<SafetyInspection> getInspectionById(Long inspectionId);
    public ResponseEntity<SafetyInspection> updateInspectionById(SafetyInspection inspection, Long inspectionId);
    public ResponseEntity<List<SafetyInspection>> getAllInspection();
    public ResponseEntity<SafetyInspection> deleteById(Long inspectionId);
}
