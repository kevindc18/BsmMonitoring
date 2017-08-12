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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")
public class Usuario implements Serializable {
	
	@Id 
	@Column(name ="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario; 
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="apellido")
	private String apellido; 
	
	@Column(name ="cedula")
	private String cedula; 
	
	@Column(name ="username")
	private String username; 
	
	@Column(name ="password")
	private String password;

	@Column(name ="perfil")
	private int perfil; 
	
	@ManyToMany()
	@JoinTable(name = "usuario_equipo" , joinColumns = {@JoinColumn(name ="id_usuario"
	)} , inverseJoinColumns= {@JoinColumn(name="id_equipo")})
	private Set<Equipo> equipos = new HashSet(); 
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Usuario( String nombre, String apellido, String cedula, String username, String password, int perfil) {
		super();
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.username = username;
		this.password = password;
		this.perfil = perfil;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getPerfil() {
		return perfil;
	}


	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Set<Equipo> getEquipos() {
		return equipos;
	}


	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	} 
	
	
	
	
}
