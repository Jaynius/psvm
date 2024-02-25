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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Conductors {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long conductorNo;
	private String idNumber,firstName,secondName ,contacts;
	private Date dob;
	private Blob picture;
	
	
}
