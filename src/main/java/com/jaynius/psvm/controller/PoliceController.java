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

import com.jaynius.psvm.model.Police;
import com.jaynius.psvm.service.PoliceService;

@RestController
public class PoliceController {

    @Autowired
    private final PoliceService service;

    public PoliceController(PoliceService service) {
        this.service = service;
    }
    
    @PostMapping(path="/police/addPolice")
    public ResponseEntity<Police> addOfficer(@RequestBody Police newPolice){
        return service.addOfiicer(newPolice);
    }

    @GetMapping(path="/police/{badgenumber}")
    public ResponseEntity<Police> getPoliceById(@PathVariable String badgeNumber){
        return service.getOfficerById(badgeNumber);
    }

    @GetMapping(path="/policeOfficers")
    public ResponseEntity<List<Police>> getAllPoliceOfficer(){
        return service.getAllOfficers();
    }

    @PostMapping(path="/police/update/{badgeNumber}")
    public ResponseEntity<Police> updateById(@RequestBody Police officer,@PathVariable String badgeNumber){
        return service.updateOfficerById(officer, badgeNumber);
    }

    @DeleteMapping(path="/police/delete/{badgeNumber}")
    public ResponseEntity<Police> deleteOfficeById(@PathVariable String badgeNumber){
        return service.deleteOfficerById(badgeNumber);
    }
}
