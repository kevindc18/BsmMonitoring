package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Plantilla;

public class PlantillaDaoImp implements PlantillaDao{

	private Proyecto2Session session; 
	
	public PlantillaDaoImp(){
		session = new Proyecto2Session(); 
	}
	
	
	public void savePlantilla(Plantilla plantilla) {
		// TODO Auto-generated method stub
		
		session.getSession().persist(plantilla);
		session.getSession().getTransaction().commit();
		
	}

	public void deletePlantilla(int id) {
		// TODO Auto-generated method stub
		Plantilla plantilla = findById(id); 
		
		if(plantilla != null){
			session.getSession().delete(plantilla);
			session.getSession().getTransaction().commit();
		}
	}

	public List<Plantilla> findAllPlantillas() {
		// TODO Auto-generated method stub
		return session.getSession().createQuery("from Plantilla").list();
	}

	public Plantilla findById(int id ) {
		// TODO Auto-generated method stub
		
		Plantilla plantilla = session.getSession().load(Plantilla.class, id) ;
		
		return plantilla;
	}
	public void updatePlantilla(Plantilla plantilla) {
		// TODO Auto-generated method stub
		
		session.getSession().update(plantilla);
		session.getSession().getTransaction().commit();		
	}

}
