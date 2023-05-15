//Clase Operion
package poo_practica12.lab1.metodos._alexanderq;
public class Operacion {
    //Declaracin de variables
   int suma, resta, multi, divi; 
   
   public void sumar(int num1, int num2){
       suma = num1 + num2;
   }
   
   public void restar(int num1, int num2){
       resta = num1 - num2;
   }
   
   public void miltiplicar(int num1, int num2){
       multi = num1 * num2;
   }
   public void dividir(int num1, int num2){
       divi = num1 / num2;
   }
   
   public void resultadosum(){
       System.out.println("El resultado de la suma es: "+suma);
   }
   
   public void resultadores(){
       System.out.println("El resultado de la resta es: "+resta);
   }
   
   public void resultadomult(){
       System.out.println("El resultado de la multiplicacion es: "+multi);
   }
   
   public void resultadodiv(){
       System.out.println("El resultado de la division es: "+divi);
   }
}
