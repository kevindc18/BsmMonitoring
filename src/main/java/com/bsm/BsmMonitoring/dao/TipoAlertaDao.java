package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.TipoAlerta;

public interface TipoAlertaDao {

	void saveTipoAlerta(TipoAlerta tipo); 
	
	void deleteTipoAlerta(int id); 
	
	List<TipoAlerta> findAllTipoAlertas(); 
	
	TipoAlerta findById(int id ); 
	
	
}
