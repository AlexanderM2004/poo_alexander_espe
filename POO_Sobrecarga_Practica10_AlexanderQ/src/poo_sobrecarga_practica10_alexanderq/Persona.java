package poo_sobrecarga_practica10_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Persona {
    String nombre;
    int edad;
    int cedula;
    
    
    /**
     * 
     * @param nombre
     * @param edad 
     */
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(int cedula){
        this.cedula = cedula;
    }
    
    public void Jugar(){
        System.out.println("Mi nombre es: "+nombre+" voy a jugar");
    }
    
    public void Jugar(String juego){
        System.out.println("Voy  a jugar: "+juego+", me gusta mucho");
    }
    
}
