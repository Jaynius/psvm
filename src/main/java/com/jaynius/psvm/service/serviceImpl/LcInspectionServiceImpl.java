package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.LoadCrgoInspection;
import com.jaynius.psvm.repository.LcInspectionRepository;
import com.jaynius.psvm.service.LcInsepctionService;

@Component
public class LcInspectionServiceImpl implements LcInsepctionService {

    @Autowired
    private final LcInspectionRepository repository;
    
    public LcInspectionServiceImpl(LcInspectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<LoadCrgoInspection> addInspection(LoadCrgoInspection newInspection) {
        LoadCrgoInspection inspection=repository.save(newInspection);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<LoadCrgoInspection> getInspectionById(Long inspecionId) {
        Optional<LoadCrgoInspection> inspection=repository.findById(inspecionId);
        if(inspection.isPresent()){
            return new ResponseEntity<>(inspection.get(),HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<LoadCrgoInspection> updateInspectionById(LoadCrgoInspection inspection, Long inspecionId) {
        Optional<LoadCrgoInspection> existingInspection=repository.findById(inspecionId);
        if(existingInspection.isPresent()){
            LoadCrgoInspection updatedInspection=existingInspection.get();
            
        }
        return null;
    }

    @Override
    public ResponseEntity<List<LoadCrgoInspection>> getAllInspection(Long inspecionId) {
        List<LoadCrgoInspection> inspections=new ArrayList<>();
        repository.findAll().forEach(inspections::add);
        if(inspections.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(inspections,HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<LoadCrgoInspection> deleteInspection(Long inspecionId) {
        Optional<LoadCrgoInspection> inspection=repository.findById(inspecionId);
        if(inspection.isPresent()){
            repository.deleteById(inspecionId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       
    }
    
}
