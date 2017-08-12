package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Alerta;

public class AlertaDaoImp implements AlertasDao{
	
	private Proyecto2Session proyecto; 

	public AlertaDaoImp(){
		proyecto = new Proyecto2Session(); 
		
	}
	public void saveAlerta(Alerta alerta) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().persist(alerta);
		proyecto.getSession().getTransaction().commit();
		
	}

	public void deleteAlerta(int id) {
		// TODO Auto-generated method stub
		
		Alerta alerta = findById(id); 
		proyecto.getSession().delete(alerta);
		proyecto.getSession().getTransaction().commit();
	}

	public Alerta findById(int id) {
		// TODO Auto-generated method stub
		Alerta alerta = proyecto.getSession().load(Alerta.class, id); 
		return alerta;
	}

	public List<Alerta> findAllAlerta() {
		// TODO Auto-generated method stub
		return proyecto.getSession().createQuery("from Alerta" ).list();
	}
	public void updateAlerta(Alerta alerta) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().update(alerta);
		proyecto.getSession().getTransaction().commit();
		
	}

}
