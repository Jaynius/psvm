package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Owners;
import com.jaynius.psvm.repository.OwnersRepository;
import com.jaynius.psvm.service.OwnersService;

@Component
public class OwnersServiceImpl implements OwnersService {

    @Autowired
    private final OwnersRepository repository;
    

    public OwnersServiceImpl(OwnersRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Owners> addOwners(Owners newOwner) {
       Owners owner=repository.save(newOwner);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Owners> getOwnersById(String idNumber) {
        Optional<Owners> owner=repository.findById(idNumber);
        if(owner.isPresent()){
            return new ResponseEntity<>(owner.get(),HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Owners> updateOwnerById(Owners owner, String idNumber) {
        Optional<Owners> existingOwner=repository.findById(idNumber);
        if(existingOwner.isPresent()){
            Owners updatedOwner=existingOwner.get();
        }
        return null;
    }

    @Override
    public ResponseEntity<List<Owners>> getAllOwners() {
      List<Owners> ownerList=new ArrayList<>();
      repository.findAll().forEach(ownerList::add);
      if(ownerList.isEmpty()){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(ownerList,HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Owners> deleteOwnerbyId(String idNumber) {
        Optional<Owners> existingOwner=repository.findById(idNumber);
        if(existingOwner.isPresent()){
            repository.deleteById(idNumber);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
