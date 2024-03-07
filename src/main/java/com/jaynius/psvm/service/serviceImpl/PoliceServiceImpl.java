package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Police;
import com.jaynius.psvm.service.PoliceService;

@Component
public class PoliceServiceImpl implements PoliceService{

    @Override
    public ResponseEntity<Police> addOfiicer(Police newOfficer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOfiicer'");
    }

    @Override
    public ResponseEntity<Police> getOfficerById(String badgeNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOfficerById'");
    }

    @Override
    public ResponseEntity<Police> updateOfficerById(Police officer, String badgeNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOfficerById'");
    }

    @Override
    public ResponseEntity<List<Police>> getAllOfficers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllOfficers'");
    }

    @Override
    public ResponseEntity<Police> deleteOfficerById(String badgeNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOfficerById'");
    }
    
}
