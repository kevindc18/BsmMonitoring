package com.kevin.BsmMonitoring.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name ="equipo")
public class Equipo implements Serializable {

	@Id
	@Column(name ="id_equipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipo; 
	
	@Column(name ="nombre")
	private String nombre ; 
	
	@Column(name ="ip")
	private String ip; 
	
	@ManyToMany( mappedBy ="equipos")
	private Set<Usuario> usuarios = new HashSet(); 
	
	@OneToMany(mappedBy ="equipo"  , cascade = CascadeType.ALL)
	private Set<Historial> historial;  
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="id_equipo")
	private Set<Monitor_Equipo> monitorEquipos; 
	
	
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Equipo(String nombre, String ip) {
		super();
		this.nombre = nombre;
		this.ip = ip;
	}


	public int getIdEquipo() {
		return idEquipo;
	}


	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public Set<Historial> getHistorial() {
		return historial;
	}


	public void setHistorial(Set<Historial> historial) {
		this.historial = historial;
	}



	
	
	
	
	
}
