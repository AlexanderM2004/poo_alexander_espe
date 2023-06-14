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
        
    	//Creacion de objetos
        Vehiculo vehi = new Vehiculo();
        Vehiculo vehi1 = new Vehiculo();
        Automovil auto = new Automovil();
        Automovil auto1 = new Automovil();
        Motocicleta moto = new Motocicleta();
        Motocicleta moto1 = new Motocicleta();
        
    	vehi.encedido();
    	auto.encedido();
    	moto.encedido();
    	
    	vehi1.apagado();
    	auto1.apagado();
    	moto1.apagado();
    	
    	System.out.println("Coleccion 1");
        System.out.println(vehi.estad);
        System.out.println(auto.estad);
        System.out.println(moto.estad);
        
        System.out.println("------------------------------------------");
        
        System.out.println("Coleccion 2");
        System.out.println(vehi1.estad);
        System.out.println(auto1.estad);
        System.out.println(moto1.estad);

    }
    
}
