package Recursos.Conexion;
import java.sql.*;
import javax.swing.*;
public class ConexionAccess {
    Connection c=null;
    Statement st=null;
    ResultSet rs=null;

    public ConexionAccess(){
        try {
            String rutaDb="https://github.com/StephTeno/SistemaContable/blob/80063a04506939eb7480ed533aa6c9f5f16c95de/BaseDeDatos.accdb";
            String url="jdbx:ucanaccess://"+rutaDb;
            c=DriverManager.getConnection(url);
            st=c.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado a la Base de Datos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la Base de Datos"+e);
            System.exit(0);
        }
    }
}
