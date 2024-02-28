package com.jaynius.psvm.model;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Conductors {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long conductorNo;
	private String idNumber,firstName,secondName ,contacts;
	private Date dob;
	private Blob picture;
	public Conductors() {
		super();
	}
	public Conductors(String idNumber, String firstName, String secondName, String contacts, Date dob, Blob picture) {
		super();
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.secondName = secondName;
		this.contacts = contacts;
		this.dob = dob;
		this.picture = picture;
	}
	public Long getConductorNo() {
		return conductorNo;
	}
	public void setConductorNo(Long conductorNo) {
		this.conductorNo = conductorNo;
	}
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
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
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
	
	
	
}
