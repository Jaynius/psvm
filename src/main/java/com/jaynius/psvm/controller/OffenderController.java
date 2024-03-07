package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Offenders;
import com.jaynius.psvm.service.OffenderService;

@RestController
public class OffenderController {
    private final OffenderService service;

    public OffenderController(OffenderService service) {
        this.service = service;
    }
    
    @PostMapping(path="/offender/addOffender")
    public ResponseEntity<Offenders> addOffender(@RequestBody Offenders newOffender){
        return service.addOffender(newOffender);
    }

    @GetMapping(path="/offender/{OffenderId}")
    public ResponseEntity<Offenders> getOffenderById(@PathVariable Long bookingId){
        return service.getOffenderById(bookingId);
    }

    @GetMapping(path="/offenders")
    public ResponseEntity<List<Offenders>> getAllOffender(){
        return service.getAllOffenders();
    }

    @PostMapping(path="/offender/update/{offenderId}")
    public ResponseEntity<Offenders> updateOffenderById(@RequestBody Offenders offender, @PathVariable Long offenderId){
        return service.updateOffenderById(offender, offenderId);
    }

    @PostMapping(path="/offender/delete/{offenderId}")
    public ResponseEntity<Offenders> deleteOffenderbyId(@PathVariable Long offenderId){
        return service.deleteById(offenderId);
    }
}
