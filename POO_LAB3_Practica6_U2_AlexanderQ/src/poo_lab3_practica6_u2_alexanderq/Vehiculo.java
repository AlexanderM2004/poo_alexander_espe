/*
 * Clase que va a heredar 
 */
package poo_lab3_practica6_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */
public class Vehiculo {
    
    String placa;
    int numrud;
    boolean enced;
    String estad;
    
    public Vehiculo(String placa, int numrud, boolean enced, String estad){
        this.enced = enced;
        this.estad = estad;
        this.numrud = numrud;
        this.placa = placa;
    }
  
    public void setNumrud(){
        
    }
    
    public void encedido(){
        enced = true;
        estad = "Vehiculo encendido";
    }
    
    public void apagado(){
        enced = false;
        estad = "Vehiculo apagado";
    }
}
