package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.service.DriversService;

@RestController
public class DriversController {
	private final DriversService service;

	public DriversController(DriversService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(path="/addDriver")
	public ResponseEntity<Drivers> addDriver(@RequestBody Drivers driver){
		return service.addDriver(driver);
	}
	@GetMapping(path="/driver{idNumber")
	public ResponseEntity<Drivers> getDriverbyId(@PathVariable String idNumber){
		return service.getDriverById(idNumber);
	}
	@GetMapping(path="/drivers")
	public ResponseEntity<List<Drivers>> getallDrivers(){
		return service.getAllDrivers();
	}
	@PostMapping(path="/driver/{idNumber}")
	public ResponseEntity<Drivers> updateById(@PathVariable String idNumber,@RequestBody Drivers driver){
		return service.updateDriverById(idNumber, driver);
	}
	@DeleteMapping(path="/driver/delete/{idNumber}")
	public ResponseEntity<Drivers> deleteDriver(@PathVariable String idNumber){
		return service.deleteById(idNumber);
	}
}
