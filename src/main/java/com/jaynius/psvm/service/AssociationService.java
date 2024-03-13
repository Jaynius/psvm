package com.jaynius.psvm.service;

import java.sql.Driver;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Conductors;
import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.model.EmmissionInspection;
import com.jaynius.psvm.model.Insurance;
import com.jaynius.psvm.model.LoadCrgoInspection;
import com.jaynius.psvm.model.MechanicalInspection;
import com.jaynius.psvm.model.Offenders;
import com.jaynius.psvm.model.Owners;
import com.jaynius.psvm.model.PsVehicle;
import com.jaynius.psvm.model.Saccos;
import com.jaynius.psvm.model.SafetyInspection;
import com.jaynius.psvm.model.StructureInspection;
import com.jaynius.psvm.model.Trackers;

@Service
public interface AssociationService {
    public void assignVehiclesToOwner(PsVehicle vehicle,Owners owner,String ownerId,String vRegNo);
    public void assignDriversToVehicles(Drivers driver,String driverId,PsVehicle vehicle,String vRegNo);
    public void assignInsuranceToVehicles( Insurance insurance,String policynumber,PsVehicle vehicle,String vRegNo);
    public void assignConductorsToVehicles(Conductors conductor, String conductorId,PsVehicle vehicle,String vRegNo);
    // public void assignVehiclesToSaccos(String vRegno,String saccoId);
    // public void assignOffenderToOffence(Long offenderId,String driverId,String conductorId,String vRegno);
    // public void assignLoardCargoInspecToVehicle(Long inspectionId,String vRegno);
    // public void assignMechinspecToVehicle(Long inspectionId,String  vRegNo);
    // public void assignEmmissionToVehicle(Long inspectionId, String vRegNo);
    // public void assignSafetyInspection(Long inspectionId, String vRegNo);
    // public void assignStructIsnpecToVehicle(Long inspectionId,String vRegno);
    // public void assignTrackerToVehicle(String trackerId, String vRegNo);
    // public void assignUserToVehicle(String userId,String vRegNo);

}
