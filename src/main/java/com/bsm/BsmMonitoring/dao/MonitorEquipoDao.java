package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Monitor;
import com.bsm.BsmMonitoring.model.Monitor_Equipo;

public interface MonitorEquipoDao {

	void saveMonitorEquipo(Monitor_Equipo monitorEquipo); 
	
	void deleteMonitorEquipo(int id);
	
	List<Monitor_Equipo> findAllMonitorEquipo(); 
	
	Monitor_Equipo findById(int id ); 
	
	void updateMonitor(Monitor_Equipo monitorEquipo); 
}
