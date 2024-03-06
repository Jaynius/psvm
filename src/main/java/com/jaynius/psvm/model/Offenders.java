package com.jaynius.psvm.model;

import java.sql.Driver;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Offenders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="booking_id")
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_vehicle_Registration")
	private PsVehicle vehicle;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_driver_id")
	private Drivers driver;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_Conductor_id")
	private Conductors conductor;
	private String offence;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public PsVehicle getVehicle() {
		return vehicle;
	}
	
	public Drivers getDriver() {
		return driver;
	}
	
	public Conductors getConductor() {
		return conductor;
	}
	
	
	public String getOffence() {
		return offence;
	}
	public void setOffence(String offence) {
		this.offence = offence;
	}
	

}
