
package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexion {
     private static Connection con=null;
   public static Connection getConnection() 
   {
      try{
         if( con == null ){
            String url="jdbc:postgresql://localhost:5432/monitoreo";
            String us="postgres";
            String pass="22440819";
             try {
                 Class.forName("org.postgresql.Driver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
             }
            con = DriverManager.getConnection(url,us,pass);
            System.out.println("Conexion establecida");
         }
         con.close();
     }
     catch(SQLException ex){
        ex.printStackTrace();
        System.out.println("error al conectar con base de datos");
     }
     return con;
   }
}
