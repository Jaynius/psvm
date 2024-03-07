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

import com.jaynius.psvm.model.SafetyInspection;
import com.jaynius.psvm.service.SafetyInspecService;

@RestController
public class SafetyInspectionController {
    @Autowired
    private final SafetyInspecService service;

    public SafetyInspectionController(SafetyInspecService service) {
        this.service = service;
    }
    
    @PostMapping(path="/safetyInspection/addnspection")
    public ResponseEntity<SafetyInspection> addInspection(@RequestBody SafetyInspection inspection){
        return service.addInspection(inspection);
    }

    @GetMapping("/safetyInspection/{inspectionId}")
    public ResponseEntity<SafetyInspection> getInspectionById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }

    @GetMapping("/safetyInspection/inspections")
    public ResponseEntity<List<SafetyInspection>> getAllInspection(){
        return service.getAllInspection();
    }

    @PostMapping("/safetyInspection/update/{inspectionId}")
    public ResponseEntity<SafetyInspection> updateInspectionById(@RequestBody SafetyInspection inspection,@PathVariable Long inspectionId){
        return service.updateInspectionById(inspection, inspectionId);
    }
    
    @DeleteMapping("SafetyInspection/delete/{inspectionId}")
    public ResponseEntity<SafetyInspection> deleteInspectionById(@PathVariable Long inspectionId){
        return service.deleteById(inspectionId);
    }
}
