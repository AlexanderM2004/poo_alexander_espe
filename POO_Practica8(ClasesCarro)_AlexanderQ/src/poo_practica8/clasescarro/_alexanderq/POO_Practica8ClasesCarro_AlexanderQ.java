//Creacion de Clase Carro
package poo_practica8.clasescarro._alexanderq;
public class POO_Practica8ClasesCarro_AlexanderQ {
    public static void main(String[] args) {
        //Comando para llamar a la clase que se desea utilizar
        //Creacion de los objetos
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        
        //Objeto 1
        car1.marca = "Kia";
        car1.año = 2010;
        car1.color = "Rojo";
        car1.Km = 246080;
        car1.motor = (float) 1.6;
        
        //Objeto 2
        car2.marca = "Hyundai";
        car2.año = 2023;
        car2.color = "Plomo";
        car2.Km = 0;
        car2.motor = (float) 1.6;
        
        //Mostrar Objetos por pantalla
        System.out.println("---------------Concencionaria---------------");
        System.out.print("Marca: ");
        System.out.println(car1.marca);
        System.out.print("Año: ");
        System.out.println(car1.año);
        System.out.print("Color: ");
        System.out.println(car1.color);
        System.out.print("Kilometraje: ");
        System.out.print(car1.Km);
        System.out.println(" Km");
        System.out.print("Motor: ");
        System.out.println(car1.motor);
        
        System.out.println(" "); //Espacio para separar objetos
        
        System.out.print("Marca: ");
        System.out.println(car2.marca);
        System.out.print("Año: ");
        System.out.println(car2.año);
        System.out.print("Color: ");
        System.out.println(car2.color);
        System.out.print("Kilometraje: ");
        System.out.print(car2.Km);
        System.out.println(" Km");
        System.out.print("Motor: ");
        System.out.println(car2.motor);
    }
    
}
