package com.jaynius.psvm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MechanicalInspection {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mech_inspec_id")
	private long id;
	private boolean engine,transmission,suspension,exhaustSystem,steeringSystem,fuelSystem,tires,wheels;
	private LocalDate dateOfInspection;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_vehicle_registration",referencedColumnName="vehicle_registration")
	private PsVehicle vehicle;
	
	
	public PsVehicle getVehicle() {
		return vehicle;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isEngine() {
		return engine;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public boolean isTransmission() {
		return transmission;
	}
	public void setTransmission(boolean transmission) {
		this.transmission = transmission;
	}
	public boolean isSuspension() {
		return suspension;
	}
	public void setSuspension(boolean suspension) {
		this.suspension = suspension;
	}
	public boolean isExhaustSystem() {
		return exhaustSystem;
	}
	public void setExhaustSystem(boolean exhaustSystem) {
		this.exhaustSystem = exhaustSystem;
	}
	public boolean isSteeringSystem() {
		return steeringSystem;
	}
	public void setSteeringSystem(boolean steeringSystem) {
		this.steeringSystem = steeringSystem;
	}
	public boolean isFuelSystem() {
		return fuelSystem;
	}
	public void setFuelSystem(boolean fuelSystem) {
		this.fuelSystem = fuelSystem;
	}
	public boolean isTires() {
		return tires;
	}
	public void setTires(boolean tires) {
		this.tires = tires;
	}
	public boolean isWheels() {
		return wheels;
	}
	public void setWheels(boolean wheels) {
		this.wheels = wheels;
	}
	public LocalDate getDateOfInspection() {
		return dateOfInspection;
	}
	public void setDateOfInspection(LocalDate dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}
	
	

}
