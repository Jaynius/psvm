package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.EmmissionInspection;
import com.jaynius.psvm.repository.EmmissionsInspecRepository;
import com.jaynius.psvm.service.EmmissionInspectionService;

@Component
public class EmmissionInspectionServiceImpl implements EmmissionInspectionService{

	private final EmmissionsInspecRepository repository;

	public EmmissionInspectionServiceImpl(EmmissionsInspecRepository repository) {
		this.repository = repository;
	}

	@Override
	public ResponseEntity<EmmissionInspection> addInspection(EmmissionInspection inspection) {
		EmmissionInspection newInspection=repository.save(inspection);
		return new ResponseEntity<>(newInspection,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<EmmissionInspection> getInspectionById(Long inspecionId) {
		Optional<EmmissionInspection> existingInspection=repository.findById(inspecionId);
		if(existingInspection.isPresent()){
			return new ResponseEntity<>(existingInspection.get(),HttpStatus.FOUND);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<EmmissionInspection> updateInspectionById(EmmissionInspection inspection, Long inspecionId) {
		Optional<EmmissionInspection> inspectionToUpdate=repository.findById(inspecionId);
		if(inspectionToUpdate.isPresent()){
			EmmissionInspection updatedInspection=inspectionToUpdate.get();
			updatedInspection.setDateOfInspectio(inspection.getDateOfInspectio());
			
		}
		return null;
	}

	@Override
	public ResponseEntity<List<EmmissionInspection>> getAllInspection(Long inspecionId) {
		List<EmmissionInspection> inspectionList=new ArrayList<>();
		repository.findAll().forEach(inspectionList::add);
		if(inspectionList.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(inspectionList,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<EmmissionInspection> deleteInspection(Long inspecionId) {
		Optional<EmmissionInspection> inspection=repository.findById(inspecionId);
		if(inspection.isPresent()){
			repository.deleteById(inspecionId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
