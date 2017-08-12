package com.kevin.BsmMonitoring;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kevin.BsmMonitoring.dao.AlertaDaoImp;
import com.kevin.BsmMonitoring.dao.EquipoDaoImp;
import com.kevin.BsmMonitoring.dao.HistorialDaoImp;
import com.kevin.BsmMonitoring.dao.MonitorDaoImp;
import com.kevin.BsmMonitoring.dao.MonitorEquipoDaoImp;
import com.kevin.BsmMonitoring.dao.PlantillaDaoImp;
import com.kevin.BsmMonitoring.dao.TipoAlertaImp;
import com.kevin.BsmMonitoring.dao.UsuarioDaoImp;
import com.kevin.BsmMonitoring.model.Alerta;
import com.kevin.BsmMonitoring.model.Equipo;
import com.kevin.BsmMonitoring.model.Historial;
import com.kevin.BsmMonitoring.model.Monitor;
import com.kevin.BsmMonitoring.model.Monitor_Equipo;
import com.kevin.BsmMonitoring.model.Plantilla;
import com.kevin.BsmMonitoring.model.TipoAlerta;
import com.kevin.BsmMonitoring.model.Usuario;
import com.kevin.BsmMonitoring.views.Ventana_principal1;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  
    	/*
    	EquipoDaoImp equipoImp = new EquipoDaoImp(); 
    	MonitorDaoImp monitorImp = new MonitorDaoImp(); 
    	MonitorEquipoDaoImp monitorEquipoImp = new MonitorEquipoDaoImp(); 
    	
    	
    	Monitor monitor = monitorImp.findById(0); 
    	Equipo equipo = equipoImp.findById(8);
    	
    	//monitorImp.saveMonitor(monitor);
    	Monitor_Equipo monitorEquipo = new Monitor_Equipo(monitor , equipo , "frecuencia 1 "); 
    	monitorEquipoImp.saveMonitorEquipo(monitorEquipo);
    	
    	*/
    	
    	/*
    	MonitorDaoImp monitorImp = new MonitorDaoImp(); 
    	
    	Monitor monitor = new Monitor("metrica " , "nombre"); 
    	    	
    	monitorImp.saveMonitor(monitor);
        

*/
     
        Ventana_principal1 ventana = new Ventana_principal1();
        ventana.setVisible(true);
        
        
    
    	
    	
    	
    
       

       
    }
}
