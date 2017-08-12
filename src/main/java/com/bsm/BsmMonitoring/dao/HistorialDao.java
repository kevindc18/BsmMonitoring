package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Historial;

public interface HistorialDao {

	void saveHistorial(Historial historial); 
	
	Historial findById( int id ); 
	
	List<Historial> findAllHistorial(); 
	
	void deleteHistorial(int id ); 
	
	void updateHistorial(Historial historial); 
}
