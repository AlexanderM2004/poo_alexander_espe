/*
 * Practica con tematica de Sobrecarga
 */
package poo_sobrecarga_practica10_alexanderq;

/**
 * @author Alexander Quizh
 */
public class POO_Sobrecarga_Practica10_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona("David Andres", 19);
        perso1.Jugar();
        
        Persona perso2 = new Persona(2134567089);
        perso2.Jugar("Parchis");
        
        
    }
    
}
