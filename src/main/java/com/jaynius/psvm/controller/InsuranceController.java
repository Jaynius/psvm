package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Insurance;
import com.jaynius.psvm.service.InsuranceService;

@RestController
public class InsuranceController {
    private final InsuranceService service;

    public InsuranceController(InsuranceService service) {
        this.service = service;
    }

    @PostMapping(path="/addPolicy")
    public ResponseEntity<Insurance> addPolicy(@RequestBody Insurance newPolicy){
        return service.addPolicy(newPolicy);
    }

    @GetMapping(path="/policy/{policyNumber}")
    public ResponseEntity<Insurance> getPolicyById(@PathVariable String policyNumber){
        return service.getPolicyById();
        
    }
    
    @GetMapping(path="/policies")
    public ResponseEntity<List<Insurance>> getAllPolicies(){
        return service.getAllPolicy();
    }

    @PostMapping(path="/policy/{policyNumber}")
    public ResponseEntity<Insurance> updatePolicyById(@RequestBody Insurance policy,@PathVariable String policyNumber){
        return service.updatePolicyId(policy, policyNumber);
    }

    @DeleteMapping(path="/delete/policy/{policynumber}")
    public ResponseEntity<Insurance> deletePolicyById(@PathVariable String policyNumber){
        return service.deletePolicyId(policyNumber);
    }
    
}
