package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.EmmissionInspection;
import com.jaynius.psvm.service.EmmissionInspectionService;

@Component
public class EmmissionInspectionServiceImpl implements EmmissionInspectionService{

	@Override
	public ResponseEntity<EmmissionInspection> addInspection(EmmissionInspection inspection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<EmmissionInspection> getInspectionById(Long inspecionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<EmmissionInspection> updateInspectionById(EmmissionInspection inspection, Long inspecionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<EmmissionInspection>> getAllInspection(Long inspecionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<EmmissionInspection> deleteInspection(Long inspecionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
