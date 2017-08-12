package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Equipo;

public interface EquipoDao {

	void saveEquipo(Equipo equipo);
	
	void deleteEquipo(int id); 
	
	List<Equipo> findAllEquipos(); 
	
	Equipo findById(int id);
	
	void updateEquipo(Equipo equipo); 
	
}
