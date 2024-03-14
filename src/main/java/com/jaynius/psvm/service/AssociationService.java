package com.jaynius.psvm.service;

import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Conductors;
import com.jaynius.psvm.model.Drivers;
import com.jaynius.psvm.model.EmmissionInspection;
import com.jaynius.psvm.model.Insurance;
import com.jaynius.psvm.model.LoadCrgoInspection;
import com.jaynius.psvm.model.MechanicalInspection;
import com.jaynius.psvm.model.Offenders;
import com.jaynius.psvm.model.Owners;
import com.jaynius.psvm.model.Police;
import com.jaynius.psvm.model.PsVehicle;
import com.jaynius.psvm.model.Saccos;
import com.jaynius.psvm.model.SafetyInspection;
import com.jaynius.psvm.model.StructureInspection;
import com.jaynius.psvm.model.Trackers;
import com.jaynius.psvm.model.Users;

@Service
public interface AssociationService {
    public void assignVehiclesToOwner(PsVehicle vehicle,Owners owner,String ownerId,String vRegNo);
    public void assignDriversToVehicles(Drivers driver,String driverId,PsVehicle vehicle,String vRegNo);
    public void assignInsuranceToVehicles( Insurance insurance,String policynumber,PsVehicle vehicle,String vRegNo);
    public void assignConductorsToVehicles(Conductors conductor, String conductorId,PsVehicle vehicle,String vRegNo);
    public void assignVehiclesToSaccos(PsVehicle vehicle,String vRegno,Saccos sacco,Long saccoId);
    public void assignOffenderToOffence(Offenders offender,Long offenderId,Drivers driver ,String driverId,Conductors conductor,String conductorId,PsVehicle vehicle,String vRegno);
    public void assignLoardCargoInspecToVehicle(LoadCrgoInspection inspection, Long inspectionId,PsVehicle vehicle,String vRegno);
    public void assignMechinspecToVehicle(MechanicalInspection inspection,Long inspectionId,PsVehicle vehicle,String  vRegNo);
    public void assignEmmissionToVehicle(EmmissionInspection inspection,Long inspectionId, PsVehicle vehicle,String vRegNo);
    public void assignSafetyInspection(SafetyInspection inspection,Long inspectionId,PsVehicle vehicle, String vRegNo);
    public void assignStructIsnpecToVehicle(StructureInspection inspection,Long inspectionId,PsVehicle vehicle,String vRegno);
    public void assignTrackerToVehicle(Trackers tracker,String trackerId, PsVehicle vehicle,String vRegNo);
    public void assignUserToVehicle(Users user,String userId,PsVehicle vehicle,String vRegNo);
    public void assignPoliceToVehicle(Police police,String badgeNumber,PsVehicle vehicle,String vRegNo);

}
