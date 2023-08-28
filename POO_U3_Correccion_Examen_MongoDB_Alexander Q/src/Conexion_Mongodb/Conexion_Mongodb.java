package Conexion_Mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Quizhpe
 */
public class Conexion_Mongodb {
     public MongoClient conectar(){
        MongoClient Conexion;
        MongoClient mongo = null;
        String servidor = "localhost";
        int puerto = 27017;
            try{
                mongo = new MongoClient(servidor,puerto);
                List<String> NombresDB = mongo.getDatabaseNames();
                JOptionPane.showMessageDialog(null, "Conexion Completada con MongoDB");
                return mongo;
            }catch(MongoException ME){
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos de MongoDB - " + ME.toString());
            }
        return mongo;
    }
}
