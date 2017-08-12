package com.bsm.BsmMonitoring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="plantilla")
public class Plantilla implements Serializable  {

	@Id
	@Column(name ="id_plantilla")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlantilla; 
	
	@Column(name = "descripcion")
	private String descripcion;

	@ManyToMany(mappedBy ="plantillas")
	private Set<Monitor> monitores; 
	
	
	
	
	
	public Plantilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plantilla( String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public int getIdPlantilla() {
		return idPlantilla;
	}

	public void setIdPlantilla(int idPlantilla) {
		this.idPlantilla = idPlantilla;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Monitor> getMonitores() {
		return monitores;
	}

	public void setMonitores(Set<Monitor> monitores) {
		this.monitores = monitores;
	} 
	
	
	
}
