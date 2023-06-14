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
  
    public void setNumrud(int ruedas){
        numrud = ruedas;
    }
    
    public void encedido(){
        enced = true;
        estad = "Auto encendido";
    }
    
    public void apagado(){
        enced = false;
        estad = "Auto apagado";
    }
}
