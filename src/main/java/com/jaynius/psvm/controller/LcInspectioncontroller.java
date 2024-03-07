package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.LoadCrgoInspection;
import com.jaynius.psvm.service.LcInsepctionService;

@RestController
public class LcInspectioncontroller {

    @Autowired
    private final LcInsepctionService service;

    public LcInspectioncontroller(LcInsepctionService service) {
        this.service = service;
    }
    
    @PostMapping(path="/addLoadCargoInspection")
    public ResponseEntity<LoadCrgoInspection> addInspection(LoadCrgoInspection newInspection){
        return service.addInspection(newInspection);
    }

    @GetMapping(path="/loarCargoInspection/{insepctionId}")
    public ResponseEntity<LoadCrgoInspection> getInspectionById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }

    @GetMapping(path="/loadCargoInspections")
    public ResponseEntity<List<LoadCrgoInspection>> getAllInspections(){
        return service.getAllInspection(null);
    }

    @PostMapping(path="/update/loadCargoInspection/{inspection}")
    public ResponseEntity<LoadCrgoInspection> updateInspectionById(@RequestBody LoadCrgoInspection inspection,@PathVariable Long inspectionId){
        return service.updateInspectionById(inspection, inspectionId);
    }
    
    @DeleteMapping(path="/delete/{inspectionId}")
    public ResponseEntity<LoadCrgoInspection> deleteById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }
}
