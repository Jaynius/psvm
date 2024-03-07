package com.jaynius.psvm.service;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Owners;

@Service
public interface OwnersService {
    public ResponseEntity<Owners> addOwners(Owners newOwner);
    public ResponseEntity<Owners> getOwnersById(String idNumber);
    public ResponseEntity<Owners> updateOwnerById(Owners owner, String idNumber);
    public ResponseEntity<List<Owners>> getAllOwners();
    public ResponseEntity<Owners> deleteOwnerbyId(String idNumber);
    
}
