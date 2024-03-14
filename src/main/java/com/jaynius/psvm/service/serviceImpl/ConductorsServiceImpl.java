package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Conductors;
import com.jaynius.psvm.repository.ConductorsRepository;
import com.jaynius.psvm.service.ConductorsService;

@Component
public class ConductorsServiceImpl implements ConductorsService{
	@Autowired 
	private final ConductorsRepository repo;
	
	

	public ConductorsServiceImpl(ConductorsRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public ResponseEntity<Conductors> addConductor(Conductors conductor) {
		@SuppressWarnings("null")
		Conductors savedConductor=repo.save(conductor);
		
		return new ResponseEntity<>(savedConductor,HttpStatus.CREATED);
	}

	@SuppressWarnings("null")
	@Override
	public ResponseEntity<Conductors> updateById(String idNumber, Conductors newConductor) {
		Optional<Conductors> existingConductor=repo.findById(idNumber);
			if(existingConductor.isPresent()) {
			Conductors	updatedConductor=existingConductor.get();
			updatedConductor.setContacts(newConductor.getContacts());
			updatedConductor.setDob(newConductor.getDob());
			updatedConductor.setFirstName(newConductor.getFirstName());
			updatedConductor.setSecondName(newConductor.getSecondName());
			updatedConductor.setIdNumber(newConductor.getIdNumber());
			updatedConductor.setPicture(newConductor.getPicture());
			
			Conductors conductorObj=repo.save(updatedConductor);
			return new ResponseEntity<>(conductorObj,HttpStatus.OK);
			
			
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
		
		
		
	
	}

	@SuppressWarnings("null")
	@Override
	public ResponseEntity<Conductors> findById(String idNumber) {
		// TODO Auto-generated method stub
		Optional<Conductors> conductor=repo.findById(idNumber);
		if(conductor.isPresent()) {
			return new ResponseEntity<>(conductor.get(),HttpStatus.FOUND);
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@SuppressWarnings("null")
	@Override
	public ResponseEntity<Conductors> deleteById(String idNumber) {
		 Optional<Conductors> conductorOptional = repo.findById(idNumber);
	        if (conductorOptional.isPresent()) {
	            repo.deleteById(idNumber);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	        } else {
	            return new ResponseEntity<>( HttpStatus.NOT_FOUND); 
	        }
	
	}

	@Override
	public ResponseEntity<List<Conductors>> findAll() {
		List<Conductors>conductorList=new ArrayList<>();
		repo.findAll().forEach(conductorList::add);
		if(conductorList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(conductorList,HttpStatus.FOUND);
		}
		
	}

	@Override
	public ResponseEntity<Conductors> findByVehicleNumber(String vRegNo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
