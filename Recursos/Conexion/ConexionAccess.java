package Recursos.Conexion;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class ConexionAccess {
    Connection c=null;
    Statement st=null;
    ResultSet rs=null;

    public ConexionAccess(){
        try {
            String rutaDb="C:\\Users\\steph\\OneDrive\\Documentos\\GitHub\\SistemaContable\\BaseDeDatos.accdb";
            String url="";
            c=DriverManager.getConnection(url);
            st=c.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Conectar con la Base de Datos"+e);
            System.exit(0);
        }
    }
}
