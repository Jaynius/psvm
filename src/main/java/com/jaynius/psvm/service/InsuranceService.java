package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.model.Insurance;

@Service
public interface InsuranceService {
    public ResponseEntity<Insurance> addPolicy(Insurance newInsurance);
	public ResponseEntity<Insurance> getPolicyById(Long policyNumber);
	public ResponseEntity<List<Insurance>> getAllPolicy();
	public ResponseEntity<Drivers> updatePolicyId(String idNumber,Drivers driver);
	public ResponseEntity<Drivers> deletePolicyId(Long policyNumber);

    
}
