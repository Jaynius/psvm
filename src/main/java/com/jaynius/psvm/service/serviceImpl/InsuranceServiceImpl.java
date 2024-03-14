package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

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

	@SuppressWarnings("null")
	@Override
	public ResponseEntity<Insurance> addPolicy(Insurance newInsurance) {
		repository.save(newInsurance);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}


	@Override
	public ResponseEntity<List<Insurance>> getAllPolicy() {
		List<Insurance> insuranceList=new ArrayList<>();
		repository.findAll().forEach(insuranceList::add);
		if(insuranceList.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(insuranceList,HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<Insurance> updatePolicyId(Insurance insurance, String policyNumber) {
		@SuppressWarnings("null")
		Optional<Insurance> existInsurance=repository.findById(policyNumber);
		if(existInsurance.isPresent()){
			Insurance updatedInsurance=existInsurance.get();
			updatedInsurance.setPolicyNumber(insurance.getPolicyNumber());
			updatedInsurance.setProvider(insurance.getProvider());
			updatedInsurance.setExpiry(insurance.getExpiry());
			updatedInsurance.setVehicle(insurance.getVehicle());
			repository.save(updatedInsurance);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@SuppressWarnings("null")
	@Override
	public ResponseEntity<Insurance> deletePolicyId(String policyNumber) {
		Optional<Insurance> insurance=repository.findById(policyNumber);
		if(insurance.isPresent()){
			repository.deleteById(policyNumber);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@Override
	public ResponseEntity<Insurance> getPolicyById() {
	return null;
	}

    
}
