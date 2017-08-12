
package com.bsm.BsmMonitoring.views;

import static com.bsm.BsmMonitoring.views.Host.txtnombre_host;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.edisoncor.gui.textField.TextFieldRectBackground;


public class Host_modulo  {
 DefaultTableModel modelo = new DefaultTableModel();
 
 // valores a la tabla de los host
   public void mostrar_tabla(JTable tabla){
      modelo.addColumn("Nombre");
      modelo.addColumn("IP");
      modelo.addColumn("Estado");
      modelo.addColumn("Descripcion");
      
      tabla.setModel(modelo);
    }
    
   
 //creando los host
   
     public void creacion_host(JTree host,TextFieldRectBackground nombre){
        
        
     DefaultTreeModel modelo = (DefaultTreeModel) host.getModel(); 
     DefaultMutableTreeNode root=(DefaultMutableTreeNode) modelo.getRoot();
       if(!txtnombre_host.getText().trim().equals("")) {
           
       root.add(new DefaultMutableTreeNode(txtnombre_host.getText()));
       modelo.reload();
       
       }else {
       System.out.println("error");
       }
     }
}
