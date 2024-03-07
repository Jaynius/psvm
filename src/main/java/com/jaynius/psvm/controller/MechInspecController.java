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

import com.jaynius.psvm.model.MechanicalInspection;
import com.jaynius.psvm.service.MechInspecService;

@RestController
public class MechInspecController {
    
    @Autowired
    private final MechInspecService service;

    public MechInspecController(MechInspecService service) {
        this.service = service;
    }
    
    @PostMapping(path="/mechnicalInspecion/addInspection")
    public ResponseEntity<MechanicalInspection> addInspection(@RequestBody MechanicalInspection newInspection){
        return service.addInspection(newInspection);
    }

    @GetMapping(path="/mechanicalInspection/inspection/{inspectionId}")
    public ResponseEntity<MechanicalInspection> getInspectionById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }

    @PostMapping(path="/MechanicalInspection/update/{inspectionId}")
    public ResponseEntity<MechanicalInspection> updateInspectionbyId(@PathVariable Long inspectionId){
        return service.updateInspectionById(inspectionId);
    }

    @GetMapping(path="/mechanicalInspection/inspections")
    public ResponseEntity<List<MechanicalInspection>> getAllInspection(){
        return service.getAllInspection();
    }

    @DeleteMapping(path="/delete/MechanicalInspection/{inspectionId}")
    public ResponseEntity<MechanicalInspection> deleteInspectionById(@PathVariable Long inspectionId){
        return service.deleteById(inspectionId);
    }
}
