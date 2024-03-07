package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Offenders;

@Service
public interface OffenderService {
    public ResponseEntity<Offenders> addOffender(Offenders newOffender);
    public ResponseEntity<Offenders> getOffenderById(Long offenderId);
    public ResponseEntity<Offenders> updateOffenderById(Offenders offender,Long offenderId);
    public ResponseEntity<List<Offenders>> getAllOffenders();
    public ResponseEntity<Offenders> deleteById(Long offenderId);
    
}
