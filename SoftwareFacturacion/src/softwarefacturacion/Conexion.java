package softwarefacturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion(){
        
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=Sfw_Facturacion;"
                + "user=prueba;"
                + "password=prueba;";
        
        try{
            Connection xion = DriverManager.getConnection(conexionUrl);
            return xion;
        } catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
    
}
