package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.EmmissionInspection;

@Service
public interface EmmissionInspectionService {
	
	public ResponseEntity<EmmissionInspection> addInspection(EmmissionInspection inspection);
	public ResponseEntity<EmmissionInspection> getInspectionById(Long inspecionId);
	public ResponseEntity<EmmissionInspection> updateInspectionById(EmmissionInspection inspection,Long inspecionId);
	public ResponseEntity<List<EmmissionInspection>> getAllInspection(Long inspecionId);
	public ResponseEntity<EmmissionInspection> deleteInspection(Long inspecionId);
	
}
