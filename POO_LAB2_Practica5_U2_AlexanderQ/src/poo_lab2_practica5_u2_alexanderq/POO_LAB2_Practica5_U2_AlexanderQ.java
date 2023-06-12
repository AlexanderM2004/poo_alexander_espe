/*
 * Lectura y Escritura de Ficheros
 */
package poo_lab2_practica5_u2_alexanderq;

/**
 *
 * @author ESPE
 */

import java.io.*;
import java.util.*;

//Sirven para leer y escribir datos en archivos conm extencion csv (tipos Excel) 
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class POO_LAB2_Practica5_U2_AlexanderQ {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de una arreglo que guarde los datos de la clase
        List<Persona> persona = new ArrayList<Persona>();
        
        /**Ingreso manual de datos al arreglo antes creado
        * persona: es el nombre de la 
        * Persona: Es la libreria creada en este proyecto
        */
        persona.add(new Persona("aaal", "444444", "asdas@gmail.com"));
        persona.add(new Persona("aaa2", "555555", "asdas@hotmail.com"));
        persona.add(new Persona("aaa3", "666666", "asdas@yahoo.com"));
        persona.add(new Persona("aaa4", "777777", "asdas@outlook.com"));
        
        ExportarCSV(persona);
        
        ImportarCSV();
    }
    
     public static void ExportarCSV(List<Persona> persona) {
        String salidaArchivo = "Persona1.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoPersona = new File(salidaArchivo);
            archivoPersona.delete();
        }
        
        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            // Datos para identificar las columnas
            salidaCSV.write("Nombre");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            // Recorremos la lista y lo insertamos en el archivo
            for(Persona user : persona) {
                salidaCSV.write(user.getNomb());
                salidaCSV.write(user.getTelef());
                salidaCSV.write(user.getMail());
                
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportarCSV() {
        try{
            List<Persona> persona = new ArrayList<Persona>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerPersona = new CsvReader("Persona.csv");
            leerPersona.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerPersona.readRecord()) {
                String nombre = leerPersona.get(0);
                String telefono = leerPersona.get(1);
                String email = leerPersona.get(2);
                
                persona.add(new Persona(nombre, telefono, email)); // Añade la informacion a la lista
            }
            
            leerPersona.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
            for(Persona user : persona) {
                System.out.println(user.getNomb()+ " , "
                    + user.getTelef()+ " , "
                    + user.getMail());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
       }
   }
}
