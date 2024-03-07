package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.model.Insurance;
import com.jaynius.psvm.service.InsuranceService;

public class InsuranceServiceImpl implements InsuranceService{

    @Override
    public ResponseEntity<Insurance> addPolicy(Insurance newInsurance) {
        
        throw new UnsupportedOperationException("Unimplemented method 'addPolicy'");
    }

    @Override
    public ResponseEntity<Insurance> getPolicyById(Long policyNumber) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getPolicyById'");
    }

    @Override
    public ResponseEntity<List<Insurance>> getAllPolicy() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllPolicy'");
    }

    @Override
    public ResponseEntity<Drivers> updatePolicyId(String idNumber, Drivers driver) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updatePolicyId'");
    }

    @Override
    public ResponseEntity<Drivers> deletePolicyId(Long policyNumber) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deletePolicyId'");
    }
    
}
