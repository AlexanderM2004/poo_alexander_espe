/*
 *Nombre: Alexander Miguel Quizhpe Cuzme
 */
package poo_lab2_practica_u5_alexanderq;
/**
 * @author Alexander Quizhpe
 */

import java.io.*;
import java.util.*;

public class POO_LAB2_Practica_U5_AlexanderQ {
    public static void main(String[] args) throws FileNotFoundException  {
        try(BufferedReader br = new BufferedReader(new FileReader ("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Downloads\\Practica Lab2_POO\\POO_Ficheros.txt"));
            BufferedWriter bw= new BufferedWriter(new FileWriter ("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Downloads\\Practica Lab2_POO\\POO_Ficheros.txt"));){
            
            
        bw.write("Prueba de escritura de ficheros");
        bw.newLine();
        bw.write("Prueba 1");
        bw.newLine();
        
        bw.flush();
        
        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea=br.readLine();
        }
        }catch(IOException e){
                System.out.println("Error E/S. "+e);
        }
        
        
        // TODO code application logic here
    }
    
}
