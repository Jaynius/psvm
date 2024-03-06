package com.jaynius.psvm.model;

import java.sql.Blob;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Owners  {
	@Id
	@Column(name="owner_idnumber")
	private String idNumber;
	private String logBookNummber ,firstName,lastName;
	private Blob picture;
	
	@ManyToMany
	@JoinTable(
			name="vehicle_owners",
			joinColumns=@JoinColumn(name="owner_idnumber"),
			inverseJoinColumns=@JoinColumn(name="vehicle_registration"))
	private List<PsVehicle> vehicle;
	
	public List<PsVehicle> getVehicle() {
		return vehicle;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getLogBookNummber() {
		return logBookNummber;
	}
	public void setLogBookNummber(String logBookNummber) {
		this.logBookNummber = logBookNummber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	
	
}
