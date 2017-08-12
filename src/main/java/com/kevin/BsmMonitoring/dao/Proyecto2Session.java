package com.kevin.BsmMonitoring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Proyecto2Session {
	
	private Session session; 
	

	public Proyecto2Session() {
		
		// TODO Auto-generated constructor stub
	
        Configuration configuration = new Configuration(); 
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
	}
	
	
		public Session getSession(){
		
				return session;

		}
	
	
}
