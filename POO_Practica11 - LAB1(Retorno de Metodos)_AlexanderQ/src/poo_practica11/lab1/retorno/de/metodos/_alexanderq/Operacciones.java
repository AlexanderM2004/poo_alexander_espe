//Clase Operaciones
package poo_practica11.lab1.retorno.de.metodos._alexanderq;
import javax.swing.JOptionPane;
public class Operacciones {

    //Realiza los procesos matematicos - Suma
    public int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
    //Realiza los procesos matematicos - Suma
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    
    //Realiza los procesos matematicos - Suma
    public int multiplicar(int num1, int num2){
        int multi = num1 * num2;
        return multi;
    }
    
    //Realiza los procesos matematicos - Suma
    public int division(int num1, int num2){
        int divi = num1/num2;
        return divi;
        
    }
    
    
    //Muestran por pantalla el resultado de los procesos relizados
    public void resulsum(int suma){
        System.out.println("La suma de los numeros es: " + suma);
    }
    
    public void resulres(int resta){
        System.out.println("La resta de los numeros es: " + resta);
    }
    
    public void resulmulti(int multi){
        System.out.println("La multiplicacion de los numeros es: " + multi);
    }
    
    public void resuldiv(int divi){
        System.out.println("La division de los numeros es: " + divi);
    }
}
