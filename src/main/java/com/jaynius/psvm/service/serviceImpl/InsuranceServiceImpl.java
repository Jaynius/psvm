package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.model.Insurance;
import com.jaynius.psvm.repository.InsuranceRepository;
import com.jaynius.psvm.service.InsuranceService;

@Component
public class InsuranceServiceImpl implements InsuranceService{

    @Autowired
    private final InsuranceRepository repository;

	public InsuranceServiceImpl(InsuranceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public ResponseEntity<Insurance> addPolicy(Insurance newInsurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Insurance> getPolicyById(String policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Insurance>> getAllPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Insurance> updatePolicyId(Insurance insurance, String policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Insurance> deletePolicyId(String policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
