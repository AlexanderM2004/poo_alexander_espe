/*
 * 
 */
package poo_lab3_practica6_u2_alexanderq;

/*
 * @author Alexander Quizhpe
 */

public class Motocicleta extends Vehiculo{
    boolean patada;
 
    @Override 
    
    public void encedido(){
        enced = true;
        estad = "Motocicleta encendida";
    }
    
    public void apagado(){
        enced = false;
        estad = "MOtocicleta apagada";
    }
}
