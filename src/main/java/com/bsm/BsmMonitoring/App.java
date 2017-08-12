package com.bsm.BsmMonitoring;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bsm.BsmMonitoring.dao.AlertaDaoImp;
import com.bsm.BsmMonitoring.dao.EquipoDaoImp;
import com.bsm.BsmMonitoring.dao.HistorialDaoImp;
import com.bsm.BsmMonitoring.dao.MonitorDaoImp;
import com.bsm.BsmMonitoring.dao.MonitorEquipoDaoImp;
import com.bsm.BsmMonitoring.dao.PlantillaDaoImp;
import com.bsm.BsmMonitoring.dao.TipoAlertaImp;
import com.bsm.BsmMonitoring.dao.UsuarioDaoImp;
import com.bsm.BsmMonitoring.model.Alerta;
import com.bsm.BsmMonitoring.model.Equipo;
import com.bsm.BsmMonitoring.model.Historial;
import com.bsm.BsmMonitoring.model.Monitor;
import com.bsm.BsmMonitoring.model.Monitor_Equipo;
import com.bsm.BsmMonitoring.model.Plantilla;
import com.bsm.BsmMonitoring.model.TipoAlerta;
import com.bsm.BsmMonitoring.model.Usuario;
import com.bsm.BsmMonitoring.views.Ventana_principal1;


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
