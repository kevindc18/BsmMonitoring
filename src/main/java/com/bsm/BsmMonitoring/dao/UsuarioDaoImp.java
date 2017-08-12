package com.bsm.BsmMonitoring.dao;

import java.util.List;

import com.bsm.BsmMonitoring.model.Usuario;

public class UsuarioDaoImp implements UsuarioDao {

	Proyecto2Session proyecto; 
	
	public UsuarioDaoImp(){
		proyecto = new Proyecto2Session(); 
	}
	public void saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().persist(usuario);
		proyecto.getSession().getTransaction().commit();
		
	}

	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		
		Usuario usuario = findById(id); 
		proyecto.getSession().delete(usuario);
		proyecto.getSession().getTransaction().commit();
	}
	
	public List<Usuario> findAllUsuario() {
		// TODO Auto-generated method stub
		return proyecto.getSession().createQuery("from Usuario" ).list();
	}

	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		
		Usuario usuario = proyecto.getSession().load(Usuario.class, id); 
		
		return  usuario ;
	}
	
	public void updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		proyecto.getSession().update(usuario);
		proyecto.getSession().getTransaction().commit();
		
	}

}
