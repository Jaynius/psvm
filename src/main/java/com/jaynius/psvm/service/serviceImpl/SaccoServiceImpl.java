package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Saccos;
import com.jaynius.psvm.service.SaccosService;

@Component
public class SaccoServiceImpl implements SaccosService{

    @Override
    public ResponseEntity<Saccos> addSacco(Saccos newSacco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSacco'");
    }

    @Override
    public ResponseEntity<Saccos> getSaccoById(Long saccoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSaccoById'");
    }

    @Override
    public ResponseEntity<Saccos> updateSaccoById(Saccos sacco, Long saccoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSaccoById'");
    }

    @Override
    public ResponseEntity<List<Saccos>> getAllSaccos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllSaccos'");
    }

    @Override
    public ResponseEntity<Saccos> deleteSaccoById(Long saccoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSaccoById'");
    }
    
}
