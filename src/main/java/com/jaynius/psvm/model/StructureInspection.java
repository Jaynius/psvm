package com.jaynius.psvm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
public class StructureInspection {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="struct_inspec_id")
	private long id;
	private boolean chassis,bodyframe;
	private LocalDate dateOfInspection;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_vehicle_registration",referencedColumnName="vehicle_registration")
	private PsVehicle vehicle;
	
	

	public PsVehicle getVehicle() {
		return vehicle;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isChassis() {
		return chassis;
	}
	public void setChassis(boolean chassis) {
		this.chassis = chassis;
	}
	public boolean isBodyframe() {
		return bodyframe;
	}
	public void setBodyframe(boolean bodyframe) {
		this.bodyframe = bodyframe;
	}
	public LocalDate getDateOfInspection() {
		return dateOfInspection;
	}
	public void setDateOfInspection(LocalDate dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}

	
	

}
