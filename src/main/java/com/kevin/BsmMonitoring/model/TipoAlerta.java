package com.kevin.BsmMonitoring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tipo_alerta")
public class TipoAlerta  implements Serializable{

	@Id
	@Column(name ="id_tipo_alerta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoAlerta; 
	
	@Column(name ="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy ="tipoAlerta" , cascade = CascadeType.ALL)
	private Set<Alerta> alertas ; 
	
	public TipoAlerta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoAlerta(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public int getIdTipoAlerta() {
		return idTipoAlerta;
	}

	public void setIdTipoAlerta(int idTipoAlerta) {
		this.idTipoAlerta = idTipoAlerta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	} 
	
	
	
}
