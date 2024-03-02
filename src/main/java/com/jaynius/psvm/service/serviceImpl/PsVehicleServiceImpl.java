package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.PsVehicle;
import com.jaynius.psvm.repository.PsVehicleRepository;
import com.jaynius.psvm.service.PsVehicleService;

@Component
public class PsVehicleServiceImpl implements PsVehicleService{
	@Autowired
	private final PsVehicleRepository vehicleRepository;


	public PsVehicleServiceImpl(PsVehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public ResponseEntity<PsVehicle> addVehicle(PsVehicle vehicle) {
		PsVehicle newVehicle=vehicleRepository.save(vehicle);
		return new ResponseEntity<>(newVehicle,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<PsVehicle> findById(String vRegNo) {
		Optional<PsVehicle> foundVehicle=vehicleRepository.findById(vRegNo);
		if(foundVehicle.isPresent()) {
			return new ResponseEntity<>(foundVehicle.get(),HttpStatus.FOUND);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<PsVehicle> updatebyId(String vRegNo, PsVehicle vehicle) {
		Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegNo);
		if(existingVehicle.isPresent()) {
			PsVehicle updatedVehicle=existingVehicle.get();
			updatedVehicle.setBodyType(vehicle.getBodyType());
			updatedVehicle.setCaveat(vehicle.getCaveat());
			updatedVehicle.setChasisNumber(vehicle.getChasisNumber());
			updatedVehicle.setColor(vehicle.getColor());
			updatedVehicle.setEngineCapacity(vehicle.getEngineCapacity());
			updatedVehicle.setEngineNumber(vehicle.getEngineNumber());
			updatedVehicle.setLogbookNumber(vehicle.getLogbookNumber());
			updatedVehicle.setMakeOfVehicle(vehicle.getMakeOfVehicle());
			updatedVehicle.setvRegNo(vehicle.getvRegNo());
			updatedVehicle.setYearOfManufacture(vehicle.getYearOfManufacture());
			
			PsVehicle vehicleObj=vehicleRepository.save(updatedVehicle);
			return new ResponseEntity<>(vehicleObj,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	

	@Override
	public ResponseEntity<PsVehicle> deleteById(String vRegNo) {
		Optional<PsVehicle> vehicleOptional=vehicleRepository.findById(vRegNo);
		if(vehicleOptional.isPresent()) {
			vehicleRepository.deleteById(vRegNo);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<List<PsVehicle>> findAllVehicles() {
		List<PsVehicle> vehicleList=new ArrayList<>();
		vehicleRepository.findAll().forEach(vehicleList::add);
		if(vehicleList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(vehicleList,HttpStatus.FOUND);
	}

}
