package com.theorganisation.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "telefoon")
public class Telefoon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long telefoonNummer;
	
	@OneToOne(mappedBy = "phone", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonBackReference
	private Employee employee;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTelefoonNummer() {
		return telefoonNummer;
	}

	public void setTelefoonNummer(long telefoonNummer) {
		this.telefoonNummer = telefoonNummer;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
}
