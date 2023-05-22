//Clase Promedio
package practica.anterior.a.prueba;

import java.util.Scanner;// importamos la liberri para capturar datos

public class Promedio {
   //Declaracion de variables 
   String nom;
   float not1;
   float not2;
   float not3;
   float prom;
   
   Scanner leer = new Scanner (System.in);
   
   public Promedio(){
     
   }
   
   public void Pedirdat(){
       System.out.println("Ingrese nombre del estudiante: ");
       nom = leer.nextLine(); //Permite ingresar caracteres
       System.out.println("---------------------------------------------------");
       do{
           System.out.println("Ingrese nota 1 del estudiante: ");
           not1 = leer.nextFloat(); //Permite ingresar numeros reales
           
           if ((not1 <0)||(not1 >=10)){
               System.out.println("Ingrese nota en un rago de 0 - 10");
           }
       }while((not1 <0)||(not1 >10));
       System.out.println("---------------------------------------------------");
       do{
           System.out.println("Ingrese nota 2 del estudiante: ");
           not2 = leer.nextFloat(); //Permite ingresar numeros reales
           
           if ((not2 <0)||(not2 >10)){
               System.out.println("Ingrese nota en un rago de 0 - 10");
           }
       }while((not2 <0)||(not2 >10));
       System.out.println("---------------------------------------------------");
       do{
           System.out.println("Ingrese nota 3 del estudiante: ");
           not3 = leer.nextFloat(); //Permite ingresar numeros reales
           
           if ((not3 <0)||(not3 >10)){
               System.out.println("Ingrese nota en un rago de 0 - 10");
           }
       }while((not3 <0)||(not3 >10));
   }
   
   public void Verificacion (){
        prom = (not1+not2+not3)/3;
        System.out.println("Alumno: "+nom);
        System.out.println("Su promedio es: "+prom);
   }
}
