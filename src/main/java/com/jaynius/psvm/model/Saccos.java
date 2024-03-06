package com.jaynius.psvm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Saccos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sacco_id")
	private Long id;
	private String saccoName,region;
	
	@JsonIgnore
	@OneToMany(mappedBy="sacco")
	private List<PsVehicle> vehicles;
	public List<PsVehicle> getVehicles() {
		return vehicles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSaccoName() {
		return saccoName;
	}
	public void setSaccoName(String saccoName) {
		this.saccoName = saccoName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	
	

}
