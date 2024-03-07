package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.EmmissionInspection;
import com.jaynius.psvm.service.EmmissionInspectionService;

@RestController
public class EmmissionInspecController {
    
    private final EmmissionInspectionService service;

    public EmmissionInspecController(EmmissionInspectionService service) {
        this.service = service;
    }

    @PostMapping(path="/addInspection")
    public ResponseEntity<EmmissionInspection> addInspection(@RequestBody EmmissionInspection newInspection){
        return service.addInspection(newInspection);
    }

    @GetMapping(path="/inspection/{inspectionId}")
    public ResponseEntity<EmmissionInspection> getInspectioById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }

    @DeleteMapping(path="/inspection/delete/{inspectionId}")
    public ResponseEntity<EmmissionInspection> deleteInspectionById(@PathVariable Long inspectionId){
        return service.deleteInspection(inspectionId);
    }

    @GetMapping(path="/inspections")
    public ResponseEntity<List<EmmissionInspection>> getAllInspection(){
        return service.getAllInspection(null);
    }

    @PostMapping(path="/updateInspecion/{inspectionId}")
    public ResponseEntity<EmmissionInspection> updateById(@RequestBody EmmissionInspection inspection,@PathVariable Long inspectionId){
        return service.updateInspectionById(inspection, inspectionId);
    }
}
