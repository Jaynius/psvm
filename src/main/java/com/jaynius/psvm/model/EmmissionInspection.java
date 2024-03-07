package com.jaynius.psvm.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmmissionInspection {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emmissions_inspec_id")
	private long id;
	private boolean exhaustControl,exhaustEmmissions;
	private LocalDate dateOfInspectio;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_vehicle_registration", referencedColumnName="vehicle_registration")
	private PsVehicle vehicle;

	public boolean isExhaustControl() {
		return exhaustControl;
	}

	public void setExhaustControl(boolean exhaustControl) {
		this.exhaustControl = exhaustControl;
	}

	public boolean isExhaustEmmissions() {
		return exhaustEmmissions;
	}

	public void setExhaustEmmissions(boolean exhaustEmmissions) {
		this.exhaustEmmissions = exhaustEmmissions;
	}

	public LocalDate getDateOfInspectio() {
		return dateOfInspectio;
	}

	public void setDateOfInspectio(LocalDate dateOfInspectio) {
		this.dateOfInspectio = dateOfInspectio;
	}

	public long getId() {
		return id;
	}

	public PsVehicle getVehicle() {
		return vehicle;
	}

	
	

}
