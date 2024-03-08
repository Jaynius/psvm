package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Offenders;
import com.jaynius.psvm.repository.OffendersRepository;
import com.jaynius.psvm.service.OffenderService;

@Component
public class OffendersServiceImpl implements OffenderService{
    @Autowired
    private final OffendersRepository repository;
    

    public OffendersServiceImpl(OffendersRepository repository) {
        this.repository = repository;
    }
    @Override
    public ResponseEntity<Offenders> addOffender(Offenders newOffender) {
        Offenders offender=repository.save(newOffender);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Offenders> getOffenderById(Long offenderId) {
       Optional<Offenders> offender=repository.findById(offenderId);
       if(offender.isPresent()){
        return new ResponseEntity<>(offender.get(),HttpStatus.FOUND);
        
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}

    @Override
    public ResponseEntity<Offenders> updateOffenderById(Offenders offender, Long offenderId) {
        Optional<Offenders> existingOffender=repository.findById(offenderId);
        if(existingOffender.isPresent()){
            Offenders updatedOffender=existingOffender.get();
            updatedOffender.setDriver(offender.getDriver());
            updatedOffender.setConductor(offender.getConductor());
            updatedOffender.setVehicle(offender.getVehicle());
            updatedOffender.setOffence(offender.getOffence());
            Offenders offenderObj=repository.save(updatedOffender);
            return new ResponseEntity<>(HttpStatus.OK);
            
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @Override
    public ResponseEntity<List<Offenders>> getAllOffenders() {
       List<Offenders> offenderList=new ArrayList<>();
       repository.findAll().forEach(offenderList::add);
       if(offenderList.isEmpty()){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity<>(offenderList, HttpStatus.FOUND);

    }


    @Override
    public ResponseEntity<Offenders> deleteById(Long offenderId) {
    Optional<Offenders> offender=repository.findById(offenderId);
    if(offender.isPresent()){
        repository.deleteById(offenderId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    
}
