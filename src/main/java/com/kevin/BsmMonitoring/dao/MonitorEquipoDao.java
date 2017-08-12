package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Monitor;
import com.kevin.BsmMonitoring.model.Monitor_Equipo;

public interface MonitorEquipoDao {

	void saveMonitorEquipo(Monitor_Equipo monitorEquipo); 
	
	void deleteMonitorEquipo(int id);
	
	List<Monitor_Equipo> findAllMonitorEquipo(); 
	
	Monitor_Equipo findById(int id ); 
	
	void updateMonitor(Monitor_Equipo monitorEquipo); 
}
