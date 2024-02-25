package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Conductors;
import com.jaynius.psvm.service.ConductorsService;

@RestController
public class ConductorsController {
	@Autowired
	private ConductorsService service;

	public ConductorsController(ConductorsService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/conductors")
	public ResponseEntity<List<Conductors>> getConductors(){
		return service.findAll();
	}
	
	@PostMapping("/addConductor")
	public ResponseEntity<Conductors> addConductor(@RequestBody Conductors conductor){
		return service.addConductor(conductor);
	}
	
	@GetMapping("/conductor/{conductorNo}")
	public ResponseEntity<Conductors> getbyConductorId(@PathVariable Long conductorNo){
		return service.findById(conductorNo);
	}
	@GetMapping("/conductor/{vehicleRegistration}")
	public ResponseEntity<Conductors> getByVehicleRegistration(@PathVariable String vRegNo){
		return service.findByVehicleNumber(vRegNo);
	}
	
	@PostMapping("/conductor/{conductorNo}")
	public ResponseEntity<Conductors> updatebyConductorId(@PathVariable Long conductorNo,
			@RequestBody Conductors conductor){
		return service.updateById(conductorNo, conductor);
		
	}
	@DeleteMapping("/conductor/{conductorNo}")
	public ResponseEntity<Conductors> deleteByConductorId(@PathVariable Long conductorNo){
		return service.deleteById(conductorNo);
	}
}
