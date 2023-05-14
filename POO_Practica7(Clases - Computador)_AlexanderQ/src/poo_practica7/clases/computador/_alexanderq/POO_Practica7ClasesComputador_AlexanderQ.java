//Creacion de Clase Computador
package poo_practica7.clases.computador._alexanderq;
public class POO_Practica7ClasesComputador_AlexanderQ {
    public static void main(String[] args) {
        // Comando para llamar a la clase que se desea utilizar
        //Creacion de los objetos
        Computador compu1 = new Computador ();
        Computador compu2 = new Computador ();
        
        //Objeto 1
        compu1.marca = "MSI";
        compu1.proces = "Core i9 13th";
        compu1.SO = "Windows 11 Pro";
        compu1.almace = 500;
        compu1.año = 2020;
        
        //Objeto 2
        compu2.marca = "Hp";
        compu2.proces = "Ryzen 7";
        compu2.SO = "Windows 10 Home";
        compu2.almace = 1;
        compu2.año = 2020;
        
        //Mostrar Objetos por pantalla
        System.out.println("---------------Computadoras---------------");
        System.out.print("Marca: ");
        System.out.println(compu1.marca);
        System.out.print("Procesador: ");
        System.out.println(compu1.proces);
        System.out.print("Sistema Operativo: ");
        System.out.println(compu1.SO);
        System.out.print("Almacenamiento: ");
        System.out.print(compu1.almace);
        System.out.println(" Gb");
        System.out.print("Año: ");
        System.out.println(compu1.año);
        
        System.out.println(" "); //Espacio para separar objetos
        
        System.out.print("Marca: ");
        System.out.println(compu2.marca);
        System.out.print("Procesador: ");
        System.out.println(compu2.proces);
        System.out.print("Sistema Operativo: ");
        System.out.println(compu2.SO);
        System.out.print("Almacenamiento: ");
        System.out.print(compu2.almace);
        System.out.println(" Tb");
        System.out.print("Año: ");
        System.out.println(compu2.año);
    }
    
}
