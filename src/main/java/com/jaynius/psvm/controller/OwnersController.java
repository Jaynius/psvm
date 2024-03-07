package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Owners;
import com.jaynius.psvm.service.OwnersService;

@RestController
public class OwnersController {

    private final OwnersService service;

    public OwnersController(OwnersService service) {
        this.service = service;
    }
    
    @PostMapping(path="/owners/add")
    public ResponseEntity<Owners> addOwners(@RequestBody Owners newOwner){
        return service.addOwners(newOwner);
    }

    @GetMapping(path="/owners/owner/{ownerId}")
    public ResponseEntity<Owners> getOwnerById(@PathVariable String idNumber){
        return service.getOwnersById(idNumber);
    }

    @GetMapping(path="/owners")
    public ResponseEntity<List<Owners>> getAllOwners(){
        return service.getAllOwners();
    }

    @PostMapping(path="/owners/update/{idNumber}")
    public ResponseEntity<Owners> updateOwnerbyId(@RequestBody Owners owner, @PathVariable String idnumber){
        return service.updateOwnerById(owner, idnumber);
    }

    @DeleteMapping(path="/owners/delete/{idNumber}")
    public ResponseEntity<Owners> deleteById(@PathVariable String idNumber){
        return service.deleteOwnerbyId(idNumber);
    }
    
}
