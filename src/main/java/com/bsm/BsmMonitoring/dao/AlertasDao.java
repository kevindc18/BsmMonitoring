package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Alerta;

public interface AlertasDao {

	void saveAlerta(Alerta alerta); 
	
	void deleteAlerta(int id );
	
	Alerta findById(int id); 
	
	List<Alerta> findAllAlerta();
	
	void updateAlerta(Alerta alerta); 
	
	
	
}
