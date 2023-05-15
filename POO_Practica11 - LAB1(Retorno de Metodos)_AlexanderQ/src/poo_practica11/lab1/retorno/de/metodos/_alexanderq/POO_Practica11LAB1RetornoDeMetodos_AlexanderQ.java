//Retorno de Metodos
package poo_practica11.lab1.retorno.de.metodos._alexanderq;
import javax.swing.JOptionPane;
public class POO_Practica11LAB1RetornoDeMetodos_AlexanderQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacciones op1 = new Operacciones();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero")); 
        
        op1.resulsum(op1.sumar(num1, num2));//Llamar resultado de suma
        op1.resulres(op1.restar(num1, num2));//Llamar resultado de resta
        op1.resulmulti(op1.multiplicar(num1, num2));//Llamar resultado de multiplicion
        op1.resuldiv(op1.division(num1, num2));//Llamar resultado de division
         
        
        
        
    }
    
}
