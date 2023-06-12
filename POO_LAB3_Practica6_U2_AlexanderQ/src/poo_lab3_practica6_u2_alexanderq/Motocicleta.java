/*
 * 
 */
package poo_lab3_practica6_u2_alexanderq;

/*
 * @author Alexander Quizhpe
 */

public class Motocicleta extends Vehiculo{
    boolean patada;
    public Motocicleta (String placa, int numrud, boolean enced, String estad){
        super(placa,numrud,enced,estad);
    }
    
    @Override 
    
    public void encedido(){
        enced = true;
        estad = "Vehiculo encendido";
    }
    
    public void apagado(){
        enced = false;
        estad = "Vehiculo apagado";
    }
}
