package poo_ficheros_practica15_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.io.*;

public class Archivo {

    public static void crearArchivo(String nombArchivo){
        File Archivo = new File(nombArchivo);
        try{
            PrintWriter salida = new PrintWriter(Archivo);
            salida.close();
            System.out.println("Se creo el archivo correctamente");
            
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombArchivo, String contenido){
        File Archivo = new File(nombArchivo);
        
        try{
            PrintWriter salida = new PrintWriter(Archivo);
            salida.println("Contenido");
            salida.close();
            System.out.println("Se creo el archivo correctamente");
            System.out.println("Ya se guardo la informacion");
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombArchivo, String contenido) throws IOException{
        File Archivo = new File(nombArchivo);
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader( Archivo));
            String lectura = entrada.readLine();
            
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            System.out.println("Se creo el archivo correctamente");
            
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void eliminarArchivo(String nombArchivo, String contenido){
        File Archivo = new File(nombArchivo);
        System.out.println(Archivo.exists());
        Archivo.delete();
        System.out.println("Archivo eliminado");    
    }
}
