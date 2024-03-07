package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.repository.DriversRepository;
import com.jaynius.psvm.service.DriversService;

@Component
public class DriversServiceImpl implements DriversService {
	private final DriversRepository repository;
	

	public DriversServiceImpl(DriversRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public ResponseEntity<Drivers> addDriver(Drivers driver) {
		@SuppressWarnings("null")
		Drivers newDriver=repository.save(driver);
		return new ResponseEntity<>(newDriver,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Drivers> getDriverById(String idNumber) {
		@SuppressWarnings("null")
		Optional<Drivers> driver=repository.findById(idNumber);
		if(driver.isPresent()) {
			return new ResponseEntity<>(driver.get(),HttpStatus.FOUND);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<List<Drivers>> getAllDrivers() {
	List<Drivers> driverList=new ArrayList<>();
	repository.findAll().forEach(driverList::add);
	if(driverList.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
		return new ResponseEntity<>(driverList,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Drivers> updateDriverById(String idNumber, Drivers driver) {
		Optional<Drivers> existingDriver=repository.findById(idNumber);
		if(existingDriver.isPresent()) {
			Drivers updatedDriver=existingDriver.get();
			updatedDriver.setIdNumber(driver.getIdNumber());
			updatedDriver.setFirstName(driver.getFirstName());
			updatedDriver.setSecondName(driver.getSecondName());
			updatedDriver.setDob(driver.getDob());
			updatedDriver.setPicture(driver.getPicture());
			updatedDriver.setVehicle(driver.getVehicle());
			
			Drivers driverObj=repository.save(updatedDriver);
			return new ResponseEntity<>(updatedDriver,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<Drivers> deleteById(String idNumber) {
		Optional<Drivers> driver=repository.findById(idNumber);
		if(driver.isPresent()) {
			repository.deleteById(idNumber);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	

}
