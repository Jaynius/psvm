package com.jaynius.psvm.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.jaynius.psvm.model.Users;
import com.jaynius.psvm.repository.ConductorsRepository;
import com.jaynius.psvm.repository.DriversRepository;
import com.jaynius.psvm.repository.EmmissionsInspecRepository;
import com.jaynius.psvm.repository.InsuranceRepository;
import com.jaynius.psvm.repository.LcInspectionRepository;
import com.jaynius.psvm.repository.MechInspecRepository;
import com.jaynius.psvm.repository.OffendersRepository;
import com.jaynius.psvm.repository.OwnersRepository;
import com.jaynius.psvm.repository.PoliceRepository;
import com.jaynius.psvm.repository.PsVehicleRepository;
import com.jaynius.psvm.repository.SaccosRepositoiry;
import com.jaynius.psvm.repository.SafetyInspeRespository;
import com.jaynius.psvm.repository.StructureInspecRepository;
import com.jaynius.psvm.repository.TrackersRepository;
import com.jaynius.psvm.repository.UsersRepository;
import com.jaynius.psvm.service.AssociationService;

import jakarta.transaction.Transactional;

public class AssociationsServiceImpl implements AssociationService{
    @Autowired
    private final PsVehicleRepository vehicleRepository;
    @Autowired
    private final ConductorsRepository conductorRepository;

    @Autowired
    private final OwnersRepository ownersRepository;
    @Autowired
    private final DriversRepository driversRepository;
    @Autowired
    private final EmmissionsInspecRepository emmissionsInspecRepository;
    @Autowired
    private final LcInspectionRepository loadInspectionRepository;
    
    @Autowired
    private final MechInspecRepository mechInspecRepository;

    @Autowired 
    private final OffendersRepository offendersRepository;

    @Autowired
    private final PoliceRepository policeRepository;
    
    @Autowired
    private final SaccosRepositoiry saccosRepositoiry;

    @Autowired
    private final SafetyInspeRespository safetyInspeRespository;

    @Autowired
    private final  StructureInspecRepository structureInspecRepository;

    @Autowired
    private final TrackersRepository trackersRepository;

    @Autowired
    private final UsersRepository usersRepository;

    @Autowired
    private final InsuranceRepository insuranceRepository;

    public AssociationsServiceImpl (PsVehicleRepository vehicleRepository, ConductorsRepository conductorRepository,
            OwnersRepository ownersRepository, DriversRepository driversRepository,
            EmmissionsInspecRepository emmissionsInspecRepository, LcInspectionRepository loadInspectionRepository,
            MechInspecRepository mechInspecRepository, OffendersRepository offendersRepository,
            PoliceRepository policeRepository, SaccosRepositoiry saccosRepositoiry,
            SafetyInspeRespository safetyInspeRespository, StructureInspecRepository structureInspecRepository,
            TrackersRepository trackersRepository, UsersRepository usersRepository, InsuranceRepository insuranceRepository) {
        this.vehicleRepository = vehicleRepository;
        this.conductorRepository = conductorRepository;
        this.ownersRepository = ownersRepository;
        this.driversRepository = driversRepository;
        this.emmissionsInspecRepository = emmissionsInspecRepository;
        this.loadInspectionRepository = loadInspectionRepository;
        this.mechInspecRepository = mechInspecRepository;
        this.offendersRepository = offendersRepository;
        this.policeRepository = policeRepository;
        this.saccosRepositoiry = saccosRepositoiry;
        this.safetyInspeRespository = safetyInspeRespository;
        this.structureInspecRepository = structureInspecRepository;
        this.trackersRepository = trackersRepository;
        this.usersRepository = usersRepository;
        this.insuranceRepository=insuranceRepository;
    }

    @Override
    @Transactional
    public void assignVehiclesToOwner(PsVehicle vehicle, Owners owner, String ownerId, String vRegNo) {
        Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegNo);
        Optional<Owners> existingOwners=ownersRepository.findById(ownerId);
        if(existingOwners.isPresent()&&existingVehicle.isPresent()){
            Owners setOwner=existingOwners.get();
            setOwner.setVehicle((List<PsVehicle>) vehicle);
            ownersRepository.save(setOwner);
        }
        else{
            new RuntimeException("not found");
        }
    }

    @Override
    @Transactional
    public void assignDriversToVehicles(Drivers driver, String driverId, PsVehicle vehicle, String vRegNo) {
        Optional<Drivers> existingDriver=driversRepository.findById(driverId);
        Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegNo);
        if(existingDriver.isPresent()&&existingVehicle.isPresent()){
            PsVehicle setVehicle=existingVehicle.get();
            setVehicle.setDriver(driver);
            vehicleRepository.save(setVehicle);
        }
        new RuntimeException("not applicable");
    }

    @Override
    @Transactional
    public void assignInsuranceToVehicles(Insurance insurance, String policynumber, PsVehicle vehicle, String vRegNo) {
        Optional<Insurance> existingInsurance=insuranceRepository.findById(policynumber);
        Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegNo);
        if (existingInsurance.isPresent()&&existingVehicle.isPresent()) {
            Insurance setInsurance=existingInsurance.get();
            setInsurance.setVehicle(vehicle);
            insuranceRepository.save(setInsurance);
        }
        new RuntimeException("not found");

    }

    @Override
    @Transactional
    public void assignConductorsToVehicles(Conductors conductor, String conductorId, PsVehicle vehicle, String vRegNo) {
    Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegNo);
    Optional<Conductors> existingConductor=conductorRepository.findById(conductorId);
    if(existingConductor.isPresent()&&existingVehicle.isPresent()){
        PsVehicle setVehicle=existingVehicle.get();
        setVehicle.setConductor(conductor);
        vehicleRepository.save(setVehicle);
    }
    new RuntimeException("not found");
    }

    @Override
    public void assignVehiclesToSaccos(PsVehicle vehicle,String vRegno,Saccos sacco, String saccoId) {
        Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegno);
        Saccos existingSacco=saccosRepositoiry.getById(null);

    }

    @Override
    @Transactional
    public void assignOffenderToOffence(Offenders offender, Long offenderId, Drivers driver, String driverId,
            Conductors conductor, String conductorId, PsVehicle vehicle, String vRegno) {
                Optional<Offenders> existingOffender=offendersRepository.findById(offenderId);
                Optional<Drivers> existingDriver=driversRepository.findById(conductorId);
                Optional<Conductors> existingConductor=conductorRepository.findById(conductorId);
                Optional<PsVehicle> existingVehicle=vehicleRepository.findById(conductorId);
                if (existingConductor.isPresent()&&existingDriver.isPresent()&&existingOffender.isPresent()&&existingVehicle.isPresent()) {
                    Offenders setOffender=existingOffender.get();
                    setOffender.setConductor(conductor);
                    setOffender.setDriver(driver);
                    setOffender.setVehicle(vehicle);
                    offendersRepository.save(setOffender);
                }
            }

    @Override
    public void assignLoardCargoInspecToVehicle(LoadCrgoInspection inspection, Long inspectionId, PsVehicle vehicle,
            String vRegno) {
        Optional<LoadCrgoInspection> existingInspection=loadInspectionRepository.findById(inspectionId);
        Optional<PsVehicle> existingVehicle=vehicleRepository.findById(vRegno);
        if (existingInspection.isPresent()&&existingVehicle.isPresent()) {
            PsVehicle setVehicle=existingVehicle.get();
            setVehicle.setLcInspection((List<LoadCrgoInspection>) inspection);
            vehicleRepository.save(setVehicle);
            
        }
    }

    @Override
    public void assignMechinspecToVehicle(MechanicalInspection inspection, Long inspectionId, PsVehicle vehicle,
            String vRegNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignMechinspecToVehicle'");
    }

    @Override
    public void assignEmmissionToVehicle(EmmissionInspection inspection, Long inspectionId, PsVehicle vehicle,
            String vRegNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignEmmissionToVehicle'");
    }

    @Override
    public void assignSafetyInspection(SafetyInspection inspection, Long inspectionId, PsVehicle vehicle,
            String vRegNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignSafetyInspection'");
    }

    @Override
    public void assignStructIsnpecToVehicle(StructureInspection inspection, Long inspectionId, PsVehicle vehicle,
            String vRegno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignStructIsnpecToVehicle'");
    }

    @Override
    public void assignTrackerToVehicle(Trackers tracker, String trackerId, PsVehicle vehicle, String vRegNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignTrackerToVehicle'");
    }

    @Override
    public void assignUserToVehicle(Users user, String userId, PsVehicle vehicle, String vRegNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignUserToVehicle'");
    }


    
}