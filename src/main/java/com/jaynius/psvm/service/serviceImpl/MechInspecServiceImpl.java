package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.MechanicalInspection;
import com.jaynius.psvm.repository.MechInspecRepository;
import com.jaynius.psvm.service.MechInspecService;

@Component
public class MechInspecServiceImpl implements MechInspecService{

    @Autowired
    private final MechInspecRepository repository;
    

    public MechInspecServiceImpl(MechInspecRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<MechanicalInspection> addInspection(MechanicalInspection newInspection) {
        MechanicalInspection inspection=repository.save(newInspection);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<MechanicalInspection> getInspectionById(Long inspectionId) {
       Optional<MechanicalInspection> inspection=repository.findById(inspectionId);
       if(inspection.isPresent()){
        return new ResponseEntity<>(inspection.get(),HttpStatus.FOUND);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<MechanicalInspection> updateInspectionById(Long inspectionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInspectionById'");
    }

  

    @Override
    public ResponseEntity<MechanicalInspection> deleteById(Long inspectionId) {
        Optional<MechanicalInspection> inspection=repository.findById(inspectionId);
        if(inspection.isPresent()){
            repository.deleteById(inspectionId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<List<MechanicalInspection>> getAllInspection() {
       List<MechanicalInspection> inspections=new ArrayList<>();
       repository.findAll().forEach(inspections::add);
       if(inspections.isEmpty()){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity<>(inspections, HttpStatus.FOUND);
    }
    
}
