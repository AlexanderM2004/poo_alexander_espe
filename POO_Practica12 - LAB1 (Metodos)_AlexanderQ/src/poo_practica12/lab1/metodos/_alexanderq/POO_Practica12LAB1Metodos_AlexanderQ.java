//Metodos, Parametros y Argumentos
package poo_practica12.lab1.metodos._alexanderq;
import javax.swing.JOptionPane;
public class POO_Practica12LAB1Metodos_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion ope1 = new Operacion();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero")); 
        
        ope1.sumar(num1, num2);
        ope1.resultadosum();
        
        ope1.restar(num1, num2);
        ope1.resultadores();
        
        ope1.miltiplicar(num1, num2);
        ope1.resultadomult();
        
        ope1.dividir(num1, num2);
        ope1.resultadodiv();
        
        
        
    }
    
}
