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
@Table(name ="alertas")
public class Alerta implements Serializable {
	@Id
	@Column(name ="id_alerta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlerta; 
	
	@Column(name ="descripcion")
	private String descripcion; 
	
	@Column(name ="sentencia")
	private String sentencia ;
	
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name = "id_monitor")
	private Monitor monitor; 
	
	@ManyToOne()
	@JoinColumn(name ="id_tipo_alerta")
	private TipoAlerta tipoAlerta; 
	

	
	public Alerta(String descripcion, String sentencia, Monitor monitor , TipoAlerta tipoAlerta) {
		super();
		this.descripcion = descripcion;
		this.sentencia = sentencia;
		this.monitor = monitor;
		this.tipoAlerta = tipoAlerta; 
	}

	public int getIdAlerta() {
		return idAlerta;
	}

	public void setIdAlerta(int idAlerta) {
		this.idAlerta = idAlerta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSentencia() {
		return sentencia;
	}

	public void setSentencia(String sentencia) {
		this.sentencia = sentencia;
	}
	
	
	
	
	
}
