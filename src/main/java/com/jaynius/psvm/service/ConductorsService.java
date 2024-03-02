package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Conductors;

@Service
public interface ConductorsService {
	public ResponseEntity<Conductors> addConductor(Conductors conductor);
	public ResponseEntity<Conductors> updateById( String idNumber,Conductors newConductor);
	public ResponseEntity<Conductors> findById(String idNumber);
	public ResponseEntity<List<Conductors>> findAll();
	public ResponseEntity<Conductors> findByVehicleNumber(String vRegNo);
	public ResponseEntity<Conductors> deleteById(String idNumber);
}

