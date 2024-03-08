package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Police;
import com.jaynius.psvm.repository.PoliceRepository;
import com.jaynius.psvm.service.PoliceService;

@Component
public class PoliceServiceImpl implements PoliceService{

    @Autowired
    private final PoliceRepository repository;
    

    public PoliceServiceImpl(PoliceRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Police> addOfiicer(Police newOfficer) {
        Police police=repository.save(newOfficer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Police> getOfficerById(String badgeNumber) {
       Optional<Police> police=repository.findById(badgeNumber);
       if(police.isPresent()){
        return new ResponseEntity<>(police.get(),HttpStatus.FOUND);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Police> updateOfficerById(Police officer, String badgeNumber) {
        Optional<Police> existingPolice=repository.findById(badgeNumber);
        if(existingPolice.isPresent()){
            Police updatedPolice=existingPolice.get();
            updatedPolice.setFirstName(officer.getFirstName());
            updatedPolice.setLastName(officer.getLastName());
            updatedPolice.setIdNumber(officer.getIdNumber());
            updatedPolice.setRank(officer.getRank());
            updatedPolice.setPost(officer.getPost());
            updatedPolice.setPicture(officer.getPicture());
            Police policeObj=repository.save(updatedPolice);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @Override
    public ResponseEntity<List<Police>> getAllOfficers() {
        List<Police> policeList=new ArrayList<>();
        repository.findAll().forEach(policeList::add);
        if(policeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policeList,HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Police> deleteOfficerById(String badgeNumber) {
       Optional<Police> police=repository.findById(badgeNumber);
       if(police.isPresent()){
        repository.deleteById(badgeNumber);
        return new ResponseEntity<>(HttpStatus.OK);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
