package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Historial;

public class HistorialDaoImp implements HistorialDao {

	private Proyecto2Session session; 
	public HistorialDaoImp(){
		
		session = new Proyecto2Session(); 
		
	}
	public void saveHistorial(Historial historial) {
		// TODO Auto-generated method stub
		session.getSession().persist(historial);
		session.getSession().getTransaction().commit();
	}

	public Historial findById(int id) {
		// TODO Auto-generated method stub
		
		Historial historia = session.getSession().load(Historial.class, id);
		return historia; 
		
		
	}

	public List<Historial> findAllHistorial() {
		// TODO Auto-generated method stub
		return session.getSession().createQuery("from Historial" ).list();
	}

	public void deleteHistorial(int id) {
		// TODO Auto-generated method stub
		
		Historial historia = findById(id); 
		session.getSession().delete(historia);
		session.getSession().getTransaction().commit();
	}
	public void updateHistorial(Historial historial) {
		// TODO Auto-generated method stub
		
		session.getSession().update(historial);
		session.getSession().getTransaction().commit();
		
	}

}
