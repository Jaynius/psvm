package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.PsVehicle;

@Service
public interface PsVehicleService {
	public ResponseEntity<PsVehicle> addVehicle(PsVehicle vehicle);
	public ResponseEntity<PsVehicle> findById(String vRegNo);
	public ResponseEntity<PsVehicle> updatebyId(String vRegNo, PsVehicle vehicle);
	public ResponseEntity<List<PsVehicle>> findAllVehicles();
	public ResponseEntity<PsVehicle> deleteById(String vRegNo);

}
