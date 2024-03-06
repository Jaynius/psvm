package com.jaynius.psvm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Insurance {
	@Id
	@Column(name="policy_number")
	private String policyNumber;
	private String provider;
	private LocalDate expiry;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="vehicle_registration",referencedColumnName="vehicle_registration")
	private PsVehicle vehicle;
	
	public PsVehicle getVehicle() {
		return vehicle;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	

	
}
