package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Plantilla;

public interface PlantillaDao {

	void savePlantilla(Plantilla plantilla); 
	
	void deletePlantilla(int id ); 
	
	List<Plantilla> findAllPlantillas(); 
	
	Plantilla findById(int id); 
	
	void updatePlantilla(Plantilla plantilla); 
	
}
