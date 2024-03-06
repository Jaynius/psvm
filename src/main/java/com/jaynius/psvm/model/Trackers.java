package com.jaynius.psvm.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class Trackers {
	@Id
	private String serialNumber;
	private double longitude,lattitude,speed;
	private LocalTime timestamp;
	
	@OneToOne(fetch=FetchType.EAGER)
	private PsVehicle vehicle;
	
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public LocalTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalTime timestamp) {
		this.timestamp = timestamp;
	}
	public PsVehicle getVehicle() {
		return vehicle;
	}
	
	

}
