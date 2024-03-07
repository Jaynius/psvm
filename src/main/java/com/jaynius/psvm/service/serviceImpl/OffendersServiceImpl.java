package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Offenders;
import com.jaynius.psvm.service.OffenderService;

@Component
public class OffendersServiceImpl implements OffenderService{

    @Override
    public ResponseEntity<Offenders> addOffender(Offenders newOffender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOffender'");
    }

    @Override
    public ResponseEntity<Offenders> getOffenderById(Long offenderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOffenderById'");
    }

    @Override
    public ResponseEntity<Offenders> updateOffenderById(Offenders offender, Long offenderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOffenderById'");
    }

    @Override
    public ResponseEntity<List<Offenders>> getAllOffenders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllOffenders'");
    }

    @Override
    public ResponseEntity<Offenders> deleteById(Long offenderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
