package com.jaynius.psvm.model;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drivers {
	@Id
	private String idNumber;
	private String firstName,secondName;
	private Date dob;
	private Blob picture;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PsVehicle vehicle;
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	public PsVehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(PsVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	}

