package com.kevin.BsmMonitoring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="historial")
public class Historial implements Serializable{
	
	@Id
	@Column(name ="id_historial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idHistorial ; 
	
	@Column(name ="ram")
	private int ram ; 
	
	@Column(name ="cpu")
	private String cpu; 
	
	@Column(name ="disco")
	private int disco; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="id_equipo")
	private Equipo equipo;

	
	
	public Historial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historial(int ram, String cpu, int disco, Equipo equipo) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.disco = disco;
		this.equipo = equipo;
	}

	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getDisco() {
		return disco;
	}

	public void setDisco(int disco) {
		this.disco = disco;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	} 
	
	
	
	
	
	

}
