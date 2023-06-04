/*UNIVERSIDAD DE LAS FUERZAS ARMADAS - ESPE
*NOMBRE: Quizhpe Cuzme Alexander Miguel
*NRC: 12309
*PAO: Segundo
 */
package evaluacion2_quizhpe_cuzme_alexander;

//Libreria que permite ingresar datos
import java.util.Scanner;

public class Nombres_Numeros {
    
    //Declaracion de variables
    int cant;
    float prom;
    
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    //Ingresa valores al arreglo
    public void guardarArray(float[] num){
        //Creacion de objetos para leer datos
        Scanner tecl = new Scanner(System.in);
        for(int i=0; i<num.length; i++){
            System.out.print("Numero "+(i+1)+": ");
            num[i] = tecl.nextFloat();
        }   
    }
    
    //muestra el promedio del arreglo
    public void mostrarProm(float [] num){
        float suma = 0;
        for(int i=0; i < num.length; i++){
           suma += num[i];
        }
        prom = suma/num.length;
        System.out.println("El promedio de los numeros es: " + prom);
    }
    
    //Verificacion del arreglo
    public void compararArray(float [] num){
        if (num[4]>10){
            System.out.println(num[4]+" es mayor a 10");
        }else{
            System.out.println(num[4]+" es menor a 10");
        }
    }
    
     //Ingresa nombres al arreglo
    public void guardarArrayString(String[] nombre){
        //Creacion de objetos para leer datos
        Scanner tecl = new Scanner(System.in);
        for(int i=0; i<nombre.length; i++){
            System.out.print("Nombre "+(i+1)+": ");
            nombre[i] = tecl.nextLine();
        }   
    }
}
