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
}
