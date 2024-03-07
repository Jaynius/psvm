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

import com.jaynius.psvm.model.StructureInspection;
import com.jaynius.psvm.service.StructInspecService;

@RestController
public class StructInspecController {
    @Autowired
    private final StructInspecService service;

    public StructInspecController(StructInspecService service) {
        this.service = service;
    }
    
    @PostMapping("/structureInspection/addInspection")
    public ResponseEntity<StructureInspection> addInspection(@RequestBody StructureInspection inspection){
        return service.addInspection(inspection);
    }

    @GetMapping("/StructureInspection/{inspectionId}")
    public ResponseEntity<StructureInspection> getInspectionById(@PathVariable Long inspectionId){
        return service.getInspectionById(inspectionId);
    }

    @GetMapping("/structureInspections")
    public ResponseEntity<List<StructureInspection>> getAllInspections(){
        return service.getAllInspection();
    }

    @PostMapping("/structureInspections/update/{inspectionId}")
    public ResponseEntity<StructureInspection> updateInspectionById(@RequestBody StructureInspection inspection, @PathVariable Long inspectionId){
        return service.updateInspectionById(inspection, inspectionId);
    }

    @DeleteMapping("structureInspection/delete/{inspectionId}")
    public ResponseEntity<StructureInspection> deleteInspectionById(@PathVariable Long inspectionId){
        return service.deleteByInspectionId(inspectionId);
    }
}
