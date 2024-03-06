package com.jaynius.psvm.model;

import java.sql.Blob;
import java.util.List;

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
public class Police {
	@Id
	private String badgeNumber;
	private String firstName,lastName, idNumber,rank,post;
	
	@ManyToMany
	@JoinTable(
			name="police_vehicle",
			joinColumns=@JoinColumn(name="fk_badge_number"),
			inverseJoinColumns=@JoinColumn(name="fk_vehicle_registration"))
	private List<PsVehicle> vehicles;
	

	public List<PsVehicle> getVehicles() {
		return vehicles;
	}
	
	private Blob picture;
	public String getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
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
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	
	

}
