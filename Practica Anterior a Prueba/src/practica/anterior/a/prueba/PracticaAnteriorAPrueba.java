//Programa que permite calcular promedio
package practica.anterior.a.prueba;

import java.util.Scanner;// importamos la liberri para capturar datos

public class PracticaAnteriorAPrueba {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        
        Promedio per1 = new Promedio();
        int opc = 0;
        
        do{
            System("cls");
            System.out.println("---------------------------------------------------");
            System.out.println("1: Calcular promedio");
            System.out.println("2: Salir");
            System.out.println("---------------------------------------------------");
            opc = read.nextInt();
            System.out.println("---------------------------------------------------");
            
            switch (opc){
                case 1:
                    per1.Pedirdat();
                    per1.Verificacion();
                    break;
                case 2:
                    System.out.println("Muchas Gracias ...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }
        }while(opc != 2);
    }
    
}
