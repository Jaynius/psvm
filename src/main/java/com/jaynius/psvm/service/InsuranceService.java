package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Insurance;

@Service
public interface InsuranceService {
    public ResponseEntity<Insurance> addPolicy(Insurance newInsurance);
	public ResponseEntity<Insurance> getPolicyById();
	public ResponseEntity<List<Insurance>> getAllPolicy();
	public ResponseEntity<Insurance> updatePolicyId(Insurance insurance,String policyNumber);
	public ResponseEntity<Insurance> deletePolicyId(String policyNumber);

    
}
