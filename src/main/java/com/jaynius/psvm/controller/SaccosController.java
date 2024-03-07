package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Saccos;
import com.jaynius.psvm.service.SaccosService;

@RestController
public class SaccosController {
    
    private final SaccosService service;

    public SaccosController(SaccosService service) {
        this.service = service;
    }
    
    @PostMapping(path="/saccos/addSacco")
    public ResponseEntity<Saccos> addSaccos(@RequestBody Saccos sacco){
        return service.addSacco(sacco);
    }

    @GetMapping(path="/saccos/{saccoId}")
    public ResponseEntity<Saccos> getSaccoById(@PathVariable Long saccoId){
        return service.getSaccoById(saccoId);
    }

    @GetMapping(path="/saccos")
    public ResponseEntity<List<Saccos>> getAllSaccos(){
        return service.getAllSaccos();
    }

    @PostMapping(path="/saccos/update/{saccoId}")
    public ResponseEntity<Saccos> updateSaccoById(@RequestBody Saccos sacco,@PathVariable Long saccoId){
        return service.updateSaccoById(sacco, saccoId);
    }

    
}
