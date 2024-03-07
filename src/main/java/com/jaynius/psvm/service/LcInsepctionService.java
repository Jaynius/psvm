package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.LoadCrgoInspection;

@Service
public interface LcInsepctionService {
    public ResponseEntity<LoadCrgoInspection> addInspection(LoadCrgoInspection newInspection);
	public ResponseEntity<LoadCrgoInspection> getInspectionById(Long inspecionId);
	public ResponseEntity<LoadCrgoInspection> updateInspectionById(LoadCrgoInspection inspection,Long inspecionId);
	public ResponseEntity<List<LoadCrgoInspection>> getAllInspection(Long inspecionId);
	public ResponseEntity<LoadCrgoInspection> deleteInspection(Long inspecionId);
    
}
