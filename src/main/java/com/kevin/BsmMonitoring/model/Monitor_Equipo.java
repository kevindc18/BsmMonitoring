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
@Table(name ="monitor_equipo")
public class Monitor_Equipo  implements Serializable {
	
	@Id
	@Column(name = "id_monitor_equipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMonitorEquipo; 
	
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name ="id_monitor")
	private Monitor monitor; 
	
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name ="id_equipo")
	private Equipo equipo; 
	
	@Column(name ="frecuencia ")
	private String frecuencia;
	
	public Monitor_Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monitor_Equipo( Monitor monitor, Equipo equipo , String frecuencia) {
		super();
		this.frecuencia = frecuencia;
		this.monitor = monitor;
		this.equipo = equipo;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	} 
	
	
	
	
	
}
