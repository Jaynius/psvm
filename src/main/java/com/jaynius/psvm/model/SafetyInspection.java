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
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class SafetyInspection {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="safety_inspec_id")
	private long id;
	private boolean seatBelts,airBags,brakeSystem,lights,mirrors,windshield,windows,wipers;
	private LocalDate dateOfInspection;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_vehicle_registration",referencedColumnName="vehicle_registration")
	private PsVehicle vehicle;
	public long getId() {
		return id;
	}
	public PsVehicle getVehicle() {
		return vehicle;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isSeatBelts() {
		return seatBelts;
	}
	public void setSeatBelts(boolean seatBelts) {
		this.seatBelts = seatBelts;
	}
	public boolean isAirBags() {
		return airBags;
	}
	public void setAirBags(boolean airBags) {
		this.airBags = airBags;
	}
	public boolean isBrakeSystem() {
		return brakeSystem;
	}
	public void setBrakeSystem(boolean brakeSystem) {
		this.brakeSystem = brakeSystem;
	}
	public boolean isLights() {
		return lights;
	}
	public void setLights(boolean lights) {
		this.lights = lights;
	}
	public boolean isMirrors() {
		return mirrors;
	}
	public void setMirrors(boolean mirrors) {
		this.mirrors = mirrors;
	}
	public boolean isWindshield() {
		return windshield;
	}
	public void setWindshield(boolean windshield) {
		this.windshield = windshield;
	}
	public boolean isWindows() {
		return windows;
	}
	public void setWindows(boolean windows) {
		this.windows = windows;
	}
	public boolean isWipers() {
		return wipers;
	}
	public void setWipers(boolean wipers) {
		this.wipers = wipers;
	}
	public LocalDate getDateOfInspection() {
		return dateOfInspection;
	}
	public void setDateOfInspection(LocalDate dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}
	
	
}
