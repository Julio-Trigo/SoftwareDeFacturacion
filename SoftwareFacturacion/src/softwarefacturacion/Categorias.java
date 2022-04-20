package softwarefacturacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

public class Categorias extends Conexion{
     public DefaultComboBoxModel getvalues(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        modelo.addElement("Seleccione");
            
            try{
                Connection xion = this.getConexion();
                String sql="SELECT Nombre FROM Categorias";
                Statement st = xion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    modelo.addElement(rs.getString(1));
                }
                xion.close();
                rs.close();
            } catch(Exception e){
                System.out.println(e);
            }
        
        return modelo;
    }
}
