package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.SafetyInspection;
import com.jaynius.psvm.repository.SafetyInspeRespository;
import com.jaynius.psvm.service.SafetyInspecService;

@Component
public class SafetyInspecServiceImpl implements SafetyInspecService {

    @Autowired
    private final SafetyInspeRespository respository;

    
    public SafetyInspecServiceImpl(SafetyInspeRespository respository) {
        this.respository = respository;
    }

    @SuppressWarnings("null")
    @Override
    public ResponseEntity<SafetyInspection> addInspection(SafetyInspection newInspection) {
      respository.save(newInspection);
      return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<SafetyInspection> getInspectionById(Long inspectionId) {
       @SuppressWarnings("null")
    Optional<SafetyInspection> inspection=respository.findById(inspectionId);
       if(inspection.isPresent()){
        return new ResponseEntity<>(inspection.get(),HttpStatus.FOUND);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<SafetyInspection> updateInspectionById(SafetyInspection inspection, Long inspectionId) {
        Optional<SafetyInspection> existingInspection=respository.findById(inspectionId);
        if(existingInspection.isPresent()){
            SafetyInspection updatedInspection=existingInspection.get();
        }
        return null;
    }

    @Override
    public ResponseEntity<List<SafetyInspection>> getAllInspection() {
        List<SafetyInspection> inspections=new ArrayList<>();
        respository.findAll().forEach(inspections::add);
        if(inspections.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(inspections,HttpStatus.FOUND);
    }

    @SuppressWarnings("null")
    @Override
    public ResponseEntity<SafetyInspection> deleteById(Long inspectionId) {
        Optional<SafetyInspection> inspection=respository.findById(inspectionId);
        if(inspection.isPresent()){
            respository.deleteById(inspectionId);
        }
            
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
