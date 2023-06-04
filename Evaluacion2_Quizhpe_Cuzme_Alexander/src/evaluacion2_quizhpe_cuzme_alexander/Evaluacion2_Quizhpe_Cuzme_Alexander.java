/*UNIVERSIDAD DE LAS FUERZAS ARMADAS - ESPE
*NOMBRE: Quizhpe Cuzme Alexander Miguel
*NRC: 12309
*PAO: Segundo
 */
package evaluacion2_quizhpe_cuzme_alexander;

//Importamos librerias para leer datos
import java.util.Scanner;

public class Evaluacion2_Quizhpe_Cuzme_Alexander {
    public static void main(String[] args) {
        
        //Declracion de variables
        int cant = 0, can = 0;
        int opc;
        boolean band = false;
        boolean marc = false;
        
        //Creacion de objetos para leer datos
        Scanner tecla = new Scanner(System.in);
        //Creacion de los arreglos
        float[] num = null;
        String[] nombre = null;
        
        //Creacion de objetos para una mejor gestion de los datos
        Nombres_Numeros num1 = new Nombres_Numeros();
        Nombres_Numeros num2 = new Nombres_Numeros();
        
        do{
            System.out.println("------------------------------ ARREGLOS ------------------------------");
            System.out.println("1: INGRESAR NUMEROS");
            System.out.println("2: MOSTRAR PROMEDIO DE NUMEROS INGRESADOS");
            System.out.println("3: VERIFICACION DE ARRAY (Posicion 5 mayor a 10)");
            System.out.println("4: INGRESAR NOMBRES");
            System.out.println("5: CANTIDAD DE NOMBRES");
            System.out.println("6: SALIR ");
            System.out.println("----------------------------------------------------------------------");
            opc = tecla.nextInt(); //Permite seleccionar cualquiera de las opciones propuestas
            System.out.println("----------------------------------------------------------------------");
            
            switch (opc){
                case 1:
                    band = true;
                    System.out.print("Ingrese cantidad de numeros a registrar: ");
                    cant = tecla.nextInt();
                    num1.setCant(cant);
                    num = new float[cant];
                    num1.guardarArray(num);//Paso de parametros para ingresar arreglos
                    break;

                case 2:
                    if(band){
                        num1.mostrarProm(num); //metodo para mostrar promedio
                    }else{
                        System.out.println("Ingrese Primero los numeros");
                    }
                    break;
                    
                case 3:
                    if(band){
                        if(num1.getCant()>4){
                            num1.compararArray(num); //metodo para mostrar promedio
                        }else{
                            System.out.println("Debe ingresar como minimo 5 numeros");
                        } 
                    }else{
                        System.out.println("Ingrese Primero los numeros");
                    }
                    break;
                    
                case 4: 
                    marc = true;
                    System.out.print("Ingrese cantidad de nombres a registrar: ");
                    cant = tecla.nextInt();
                    num2.setCant(cant);
                    nombre = new String[cant];//Permite ingresar nombres al Arreglo
                    num2.guardarArrayString(nombre);//Paso de parametros para ingresar arreglos
                    break;
                    
                case 5:
                    if(marc){
                        System.out.println("La cantidad de nombres ingresados es: "+num2.getCant()); //metodo para mostrar promedio
                    }else{
                        System.out.println("Ingrese Primero los numeros");
                    }
                    break;
                    
                case 6:
                    System.out.println("Gracias por su confianza ... Vuelva Pronto");
                    break;
                    
                default:
                    System.out.println("No existe la opcion correcta, vuelva a intentarlo");
                    break;
            }
        }while(opc !=6);
    }
}
