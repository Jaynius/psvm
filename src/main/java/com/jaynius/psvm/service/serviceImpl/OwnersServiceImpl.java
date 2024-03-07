package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Owners;
import com.jaynius.psvm.service.OwnersService;

@Component
public class OwnersServiceImpl implements OwnersService {

    @Override
    public ResponseEntity<Owners> addOwners(Owners newOwner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOwners'");
    }

    @Override
    public ResponseEntity<Owners> getOwnersById(String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOwnersById'");
    }

    @Override
    public ResponseEntity<Owners> updateOwnerById(Owners owner, String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOwnerById'");
    }

    @Override
    public ResponseEntity<List<Owners>> getAllOwners() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllOwners'");
    }

    @Override
    public ResponseEntity<Owners> deleteOwnerbyId(String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOwnerbyId'");
    }
    
}
