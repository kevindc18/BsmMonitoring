package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Monitor;

public class MonitorDaoImp implements MonitorDao {

	private Proyecto2Session proyecto ; 
	
	public MonitorDaoImp(){
		proyecto = new Proyecto2Session(); 
	}
	public void saveMonitor(Monitor monitor) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().persist(monitor);
		proyecto.getSession().getTransaction().commit();
	}

	public Monitor findById(int id) {
	
		Monitor monitor = proyecto.getSession().load(Monitor.class, id); 
		
		return monitor ;
		// TODO Auto-generated method stub
		
	}

	public List<Monitor> findAllMonitor() {
		// TODO Auto-generated method stub
		return proyecto.getSession().createQuery("from Monitor").list();
	}

	public void deleteMonitor(int id) {
		// TODO Auto-generated method stub
		
		Monitor monitor = findById(id); 
		
		proyecto.getSession().delete(monitor);
		proyecto.getSession().getTransaction().commit();
		
	}
	public void updateMonitor(Monitor monitor) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().update(monitor);
		proyecto.getSession().getTransaction().commit();
		
	}
	

}
