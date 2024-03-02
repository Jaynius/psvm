package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.PsVehicle;
import com.jaynius.psvm.service.PsVehicleService;

@RestController
public class PsVehicleController {
	private final PsVehicleService service;

	public PsVehicleController(PsVehicleService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(path="/addVehicle")
	public ResponseEntity<PsVehicle> addVehicle(@RequestBody PsVehicle vehicle){
		return service.addVehicle(vehicle);
	}
	@GetMapping(path="/vehicle/{registrationNumber}")
	public ResponseEntity<PsVehicle> getVehicleByRegistration(@PathVariable String vRegNo){
		return service.findById(vRegNo);
	}
	@GetMapping(path="/vehicles")
	public ResponseEntity<List<PsVehicle>> getAllVehicles(){
		return service.findAllVehicles();
	}
	@PostMapping(path="/vehicle/update/{registrationNumber}")
	public ResponseEntity<PsVehicle> updateById(@PathVariable String vRegNo,@RequestBody PsVehicle vehicle){
		return service.updatebyId(vRegNo, vehicle);
	}
	@DeleteMapping(path="/vehicle/delete/{RegistrationNumber}")
	public ResponseEntity<PsVehicle> deleteById(@PathVariable String vRegNo){
		return service.deleteById(vRegNo);
		
	}
	

}
