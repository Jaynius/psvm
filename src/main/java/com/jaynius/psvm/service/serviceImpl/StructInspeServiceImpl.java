package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.StructureInspection;
import com.jaynius.psvm.service.StructInspecService;

@Component
public class StructInspeServiceImpl implements StructInspecService {

    @Override
    public ResponseEntity<StructureInspection> addInspection(StructureInspection newInspection) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addInspection'");
    }

    @Override
    public ResponseEntity<StructureInspection> getInspectionById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInspectionById'");
    }

    @Override
    public ResponseEntity<StructureInspection> updateInspectionById(StructureInspection inspection, Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInspectionById'");
    }

    @Override
    public ResponseEntity<List<StructureInspection>> getAllInspection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllInspection'");
    }

    @Override
    public ResponseEntity<StructureInspection> deleteByInspectionId(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByInspectionId'");
    }
    
}
