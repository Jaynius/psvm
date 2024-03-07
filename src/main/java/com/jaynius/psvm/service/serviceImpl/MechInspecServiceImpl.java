package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.MechanicalInspection;
import com.jaynius.psvm.service.MechInspecService;

@Component
public class MechInspecServiceImpl implements MechInspecService{

    @Override
    public ResponseEntity<MechanicalInspection> addInspection(MechanicalInspection newInspection) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addInspection'");
    }

    @Override
    public ResponseEntity<MechanicalInspection> getInspectionById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInspectionById'");
    }

    @Override
    public ResponseEntity<MechanicalInspection> updateInspectionById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInspectionById'");
    }

  

    @Override
    public ResponseEntity<MechanicalInspection> deleteById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public ResponseEntity<List<MechanicalInspection>> getAllInspection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllInspection'");
    }
    
}
