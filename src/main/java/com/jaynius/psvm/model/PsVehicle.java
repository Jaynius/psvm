package com.jaynius.psvm.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PsVehicle {
	@Id
	private String vRegNo;
	private String logbookNumber,chasisNumber,engineNumber,engineCapacity,
	bodyType,makeOfVehicle,caveat,color;
	private LocalDate yearOfManufacture;
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

		

}
