package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.Equipo;

public class EquipoDaoImp implements EquipoDao {
	private Proyecto2Session proyecto ; 
	
	public EquipoDaoImp(){
		proyecto  = new Proyecto2Session(); 
		
	}
	public void saveEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		proyecto.getSession().persist(equipo);
		proyecto.getSession().getTransaction().commit();
	}

	public void deleteEquipo(int id) {
		// TODO Auto-generated method stub
		
		Equipo equipo = findById(id); 
		proyecto.getSession().delete(equipo);
		proyecto.getSession().getTransaction().commit();
		
		
	}

	public List<Equipo> findAllEquipos() {
		// TODO Auto-generated method stub
		return proyecto.getSession().createQuery("from Equipo" ).list();
	}

	public Equipo findById(int id) {
		// TODO Auto-generated method stub
		 Equipo equipo = proyecto.getSession().load(Equipo.class, id); 
		return equipo ;
	}

	public void updateEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().update(equipo);
		proyecto.getSession().getTransaction().commit();
		
	}

}
