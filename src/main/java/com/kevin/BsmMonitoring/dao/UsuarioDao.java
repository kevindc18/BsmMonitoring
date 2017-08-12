package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Usuario;

public interface UsuarioDao {

	void saveUsuario(Usuario usuario); 
	
	void deleteUsuario(int id);
	
	void updateUsuario(Usuario usuario); 
	
	List<Usuario> findAllUsuario();
	
	Usuario findById(int id); 
	
	
	
}
