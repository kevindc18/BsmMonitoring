package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Monitor;

public interface MonitorDao {

	void saveMonitor(Monitor monitor ); 
	
	Monitor findById(int id ); 
	
	List<Monitor > findAllMonitor(); 
	
	void deleteMonitor(int id); 
	
	void updateMonitor(Monitor monitor);

	
}
