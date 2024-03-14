package com.jaynius.psvm.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public  class Users {
	@Id
	private String idNumber;
	private String firstName,lastName;
	private String email;
	private String contacts;

	
	@ManyToMany
	@JoinTable(
			name="vehicle_users",
			joinColumns=@JoinColumn(name="fk_id_number"),
			inverseJoinColumns =@JoinColumn(name="fk_vehicle_registration"))
	private List<PsVehicle> vehicles;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public List<PsVehicle> getVehicles() {
		return vehicles;
	}

}
