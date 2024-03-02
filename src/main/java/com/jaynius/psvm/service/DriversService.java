package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Drivers;

@Service
public interface DriversService {
	public ResponseEntity<Drivers> addDriver(Drivers driver);
	public ResponseEntity<Drivers> getDriverById(String idNumber);
	public ResponseEntity<List<Drivers>> getAllDrivers();
	public ResponseEntity<Drivers> updateDriverById(String idNumber,Drivers driver);
	public ResponseEntity<Drivers> deleteById(String idNumber);

}
