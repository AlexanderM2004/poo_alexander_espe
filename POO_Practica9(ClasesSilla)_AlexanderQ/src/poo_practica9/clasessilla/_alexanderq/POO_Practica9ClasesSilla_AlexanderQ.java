//Creacion de Clase Silla
package poo_practica9.clasessilla._alexanderq;
public class POO_Practica9ClasesSilla_AlexanderQ {
    public static void main(String[] args) {
        //Comando para llamar a la clase que se desea utilizar
        //Creacion de los objetos
        Silla silla1 = new Silla();
        Silla silla2 = new Silla();
        
        //Objeto 1
        silla1.color = "Negro";
        silla1.tama = "Mediano";
        silla1.patas = 3;
        silla1.material = "Madera";
        silla1.tapi = "Tela";
        
        //Objeto 2
        silla2.color = "Cafe";
        silla2.tama = "Grande";
        silla2.patas = 4;
        silla2.material = "Metal";
        silla2.tapi = "Cuero";
        
        //Mostrar Objetos por pantalla
        System.out.println("---------------Muebles---------------");
        System.out.print("Color: ");
        System.out.println(silla1.color);
        System.out.print("Tamaño: ");
        System.out.println(silla1.tama);
        System.out.print("Cantidad de patas: ");
        System.out.println(silla1.patas);
        System.out.print("Material: ");
        System.out.println(silla1.material);
        System.out.print("Tapizado: ");
        System.out.println(silla1.tapi);
        
        System.out.println(" "); //Espacio para separar objetos
        
        System.out.print("Color: ");
        System.out.println(silla2.color);
        System.out.print("Tamaño: ");
        System.out.println(silla2.tama);
        System.out.print("Cantidad de patas: ");
        System.out.println(silla2.patas);
        System.out.print("Material: ");
        System.out.println(silla2.material);
        System.out.print("Tapizado: ");
        System.out.println(silla2.tapi);
    }
    
}
