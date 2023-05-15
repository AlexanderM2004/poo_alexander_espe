//
package poo_practica10.lab.pkg1.clases._alexanderq;

//Importar libreria
import javax.swing.JOptionPane;

public class Operaciones {
    //Declaracion de variables
    int num1;
    int num2;
    int suma, resta, multi, divi;
    
    //Generar metodos
    public void capturarmetodos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
    }
    
    public void suma(){
        suma = num1 + num2;
    }
    
    public void resta(){
        resta = num1 - num2;
    }
    
    public void multi(){
        multi = num1 * num2;
    }
    
    public void divi(){
        divi = num1/num2;
        
    }
    
    public void resulsum(){
        System.out.println("La suma de los numeros es: " + suma);
    }
    
    public void resulres(){
        System.out.println("La resta de los numeros es: " + resta);
    }
    
    public void resulmulti(){
        System.out.println("La multiplicacion de los numeros es: " + multi);
    }
    
    public void resuldiv(){
        System.out.println("La division de los numeros es: " + divi);
    }
}
