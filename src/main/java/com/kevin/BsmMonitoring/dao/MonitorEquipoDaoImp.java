package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Monitor;
import com.kevin.BsmMonitoring.model.Monitor_Equipo;

public class MonitorEquipoDaoImp implements MonitorEquipoDao {

	private Proyecto2Session session; 
	
	public MonitorEquipoDaoImp(){
		session = new Proyecto2Session(); 
	}
	public void saveMonitorEquipo(Monitor_Equipo monitorEquipo) {
		// TODO Auto-generated method stub
		
		session.getSession().persist(monitorEquipo);
		session.getSession().getTransaction().commit();
		
	}

	public void deleteMonitorEquipo(int id) {
		// TODO Auto-generated method stub
		Monitor_Equipo monitorEquipo = findById(id); 
		session.getSession().delete(monitorEquipo);
		session.getSession().getTransaction().commit();
	}

	public List<Monitor_Equipo> findAllMonitorEquipo() {
		// TODO Auto-generated method stub
		return session.getSession().createQuery("from Monitor_Equipo").list();
	}
	public Monitor_Equipo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateMonitor(Monitor_Equipo monitorEquipo) {
		// TODO Auto-generated method stub
		session.getSession().update(monitorEquipo);
		session.getSession().getTransaction().commit();
		
	}


	

}
