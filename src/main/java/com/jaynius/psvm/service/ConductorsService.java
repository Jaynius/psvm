package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Conductors;

@Service
public interface ConductorsService {
	public ResponseEntity<Conductors> addConductor(Conductors conductor);
	public ResponseEntity<Conductors> updateById( Long conductorNo,Conductors newConductor);
	public ResponseEntity<Conductors> findById(Long conductorNo);
	public ResponseEntity<Conductors> deleteById(Long conductorNo);
	public ResponseEntity<List<Conductors>> findAll();
	public ResponseEntity<Conductors> findByVehicleNumber(String vRegNo);
}

