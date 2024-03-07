package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Saccos;
import com.jaynius.psvm.repository.SaccosRepositoiry;
import com.jaynius.psvm.service.SaccosService;

@Component
public class SaccoServiceImpl implements SaccosService{
    @Autowired
    private final SaccosRepositoiry repository;
    

    public SaccoServiceImpl(SaccosRepositoiry repository) {
        this.repository = repository;
    }



    @Override
    public ResponseEntity<Saccos> addSacco(Saccos newSacco) {
        Saccos sacco=repository.save(newSacco);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



    @Override
    public ResponseEntity<Saccos> getSaccoById(Long saccoId) {
        Optional<Saccos> sacco=repository.findById(saccoId);
        if(sacco.isPresent()){
            return new ResponseEntity<>(sacco.get(),HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Saccos> updateSaccoById(Saccos sacco, Long saccoId) {
        Optional<Saccos> existingSacco=repository.findById(saccoId);
        if(existingSacco.isPresent()){
            Saccos updatedSacco=existingSacco.get();
            updatedSacco.setSaccoName(sacco.getSaccoName());
            updatedSacco.setRegion(sacco.getRegion());

            Saccos saccoObj=repository.save(updatedSacco);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<List<Saccos>> getAllSaccos() {
        List<Saccos> saccoList=new ArrayList<>();
        repository.findAll().forEach(saccoList::add);
        if(saccoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(saccoList,HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Saccos> deleteSaccoById(Long saccoId) {
        Optional<Saccos> sacco=repository.findById(saccoId);
        if(sacco.isPresent()){
            repository.deleteById(saccoId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
