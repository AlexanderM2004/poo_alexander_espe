 /*
 * Herencia de clases
 */
package poo_lab3_practica6_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */
    
public class POO_LAB3_Practica6_U2_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo vehi = new Vehiculo("JAA2889", 8, true, "nuevo");
        Automovil auto = new Automovil("JAA289", 4,false,"carro");
        Motocicleta moto = new Motocicleta("", 2,true, "seminuevo");
        
        System.out.println(vehi.estad);
        System.out.println(auto.estad);
        System.out.println(moto.estad);

    }
    
}
