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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="monitor")
public class Monitor implements Serializable {

	@Id
	@Column(name ="id_monitor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idMonitor ; 
	
	@Column(name ="metrica")
	private String metrica;
	
	@Column(name ="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="monitor" , cascade = CascadeType.ALL)
	private Set<Alerta> alerta; 
	
	@OneToMany()
	@JoinColumn(name ="id_monitor")
	private Set<Monitor_Equipo> monitorEquipos; 
	
	@ManyToMany()
	@JoinTable(name ="monitor_plantilla" , joinColumns ={@JoinColumn(name ="id_monitor")}, 
	inverseJoinColumns = {@JoinColumn(name ="id_plantilla")})
	private Set<Plantilla> plantillas = new HashSet(); 
	
	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monitor( String metrica, String nombre) {
		super();
		this.metrica = metrica;
		this.nombre = nombre;
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}
	public String getMetrica() {
		return metrica;
	}
	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Alerta> getAlertas() {
		return alerta;
	}
	public void setAlertas(Set<Alerta> alerta) {
		this.alerta = alerta;
	}
	public Set<Plantilla> getPlantillas() {
		return plantillas;
	}
	public void setPlantillas(Set<Plantilla> plantillas) {
		this.plantillas = plantillas;
	} 
	
	
}
