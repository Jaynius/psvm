package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jaynius.psvm.model.SafetyInspection;
import com.jaynius.psvm.service.SafetyInspecService;

public class SafetyInspecServiceImpl implements SafetyInspecService {

    @Override
    public ResponseEntity<SafetyInspection> addInspection(SafetyInspection newInspection) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addInspection'");
    }

    @Override
    public ResponseEntity<SafetyInspection> getInspectionById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInspectionById'");
    }

    @Override
    public ResponseEntity<SafetyInspection> updateInspectionById(SafetyInspection inspection, Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInspectionById'");
    }

    @Override
    public ResponseEntity<List<SafetyInspection>> getAllInspection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllInspection'");
    }

    @Override
    public ResponseEntity<SafetyInspection> deleteById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
