package Controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Quizhpe
 */

public class Conexion {
    private static final String drive = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:msql://localhost:3306/poo_estudiantes";
    
    Connection conectar = null;

    public Connection conexion(){
        try{
            Class.forName(drive);
            conectar = (Connection)DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion"+e.getMessage());
        }
    return conectar;
    }
}