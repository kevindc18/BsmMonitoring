package com.kevin.BsmMonitoring.dao;

import java.util.List;

import com.kevin.BsmMonitoring.model.TipoAlerta;

public class TipoAlertaImp  implements TipoAlertaDao{

	private Proyecto2Session session; 
	
	public TipoAlertaImp(){
		session = new Proyecto2Session(); 
	}
	public void saveTipoAlerta(TipoAlerta tipo) {
		// TODO Auto-generated method stub
		
		session.getSession().persist(tipo);
		session.getSession().getTransaction().commit();
		
	}

	public void deleteTipoAlerta(int id) {
		// TODO Auto-generated method stub
		TipoAlerta tipo = findById(id); 
		
		session.getSession().delete(tipo);
		session.getSession().getTransaction().commit();
	}

	public List<TipoAlerta> findAllTipoAlertas() {
		// TODO Auto-generated method stub
		return  session.getSession().createQuery("from TipoAlerta").list();
	}
	public TipoAlerta findById(int id) {
		// TODO Auto-generated method stub
		
		TipoAlerta tipoAlerta = session.getSession().load(TipoAlerta.class, id); 
		return tipoAlerta;
	}

}
