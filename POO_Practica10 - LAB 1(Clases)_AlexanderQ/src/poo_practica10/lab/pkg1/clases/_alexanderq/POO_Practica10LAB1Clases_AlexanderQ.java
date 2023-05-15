//Creacion de clases, atributos y metodos
package poo_practica10.lab.pkg1.clases._alexanderq;

public class POO_Practica10LAB1Clases_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de objeto
        Operaciones opera1 = new Operaciones();
        Operaciones opera2 = new Operaciones();
        Operaciones opera3 = new Operaciones();
        Operaciones opera4 = new Operaciones();
        
        //Llamar a metodos - suma
        opera1.capturarmetodos();
        opera1.suma();
        opera1.resulsum();

        //Llamar a metodos - resta
        opera2.capturarmetodos();
        opera2.resta();
        opera2.resulres();
        
        //Llamar a metodos - Multiplicacion
        opera3.capturarmetodos();
        opera3.multi();
        opera3.resulmulti();
        
        //Llamar a metodos - Divicion
        opera4.capturarmetodos();
        opera4.divi();
        opera4.resuldiv();
    }
    
}
