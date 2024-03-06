package com.jaynius.psvm.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class PsVehicle {
	@Id
	@Column(name="vehicle_registration")
	private String vRegNo;
	private String logbookNumber,chasisNumber,engineNumber,engineCapacity,
	bodyType,makeOfVehicle,caveat,color;
	private LocalDate yearOfManufacture;
	
	@OneToOne(mappedBy="vehicle")
	private Drivers driver;
	
	@OneToOne(mappedBy="vehicle")
	private Conductors conductor;
	
	@OneToMany(mappedBy="vehicle")
	private List<EmmissionInspection> emmissionsInspection;
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicle")
	private List<Insurance> insurance;
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicle")
	private List<LoadCrgoInspection> lcInspection;
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicle")
	private List<MechanicalInspection> mechInspec;
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicle")
	private List<StructureInspection> structInspec;
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicle")
	private List<SafetyInspection> safetInspection;	
	

	@ManyToMany(mappedBy="vehicles")
	private List<Users> users;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_sacco_id", referencedColumnName="sacco_id")
	private Saccos sacco;
	
	@OneToOne(mappedBy="vehicle")
	private Trackers tracker;
	
	@ManyToMany(mappedBy="vehicle")
	private List<Owners> owners;
	
//	@ManyToMany(mappedBy="vehicle_registration")
//	private List<Police> officers;
//	
	public String getvRegNo() {
		return vRegNo;
	}
	public void setvRegNo(String vRegNo) {
		this.vRegNo = vRegNo;
	}
	public String getLogbookNumber() {
		return logbookNumber;
	}
	public void setLogbookNumber(String logbookNumber) {
		this.logbookNumber = logbookNumber;
	}
	public String getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getMakeOfVehicle() {
		return makeOfVehicle;
	}
	public void setMakeOfVehicle(String makeOfVehicle) {
		this.makeOfVehicle = makeOfVehicle;
	}
	public String getCaveat() {
		return caveat;
	}
	public void setCaveat(String caveat) {
		this.caveat = caveat;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(LocalDate yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public Drivers getDriver() {
		return driver;
	}
	
	public Conductors getConductor() {
		return conductor;
	}

	
	public Trackers getTracker() {
		return tracker;
	}
	public List<EmmissionInspection> getEmmissionsInspection() {
		return emmissionsInspection;
	}
	public List<Insurance> getInsurance() {
		return insurance;
	}
	public List<LoadCrgoInspection> getLcInspection() {
		return lcInspection;
	}
	public List<MechanicalInspection> getMechInspec() {
		return mechInspec;
	}
	public List<StructureInspection> getStructInspec() {
		return structInspec;
	}
	public List<SafetyInspection> getSafetInspection() {
		return safetInspection;
	}
	public List<Users> getUsers() {
		return users;
	}
	public Saccos getSacco() {
		return sacco;
	}
	public List<Owners> getOwners() {
		return owners;
	}
	
	
	

		

}
