package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

//
//Importacion de librerias para la intrada de texto
import java.util.*;

public class LAB3 extends Laboratorio{
	//Declaracion de variables
    Scanner tecl = new Scanner (System.in);
    boolean u = false, d = false, t = false, c = false, ci = false, se = false, si = false; 
    boolean o = false, n = false;
    
    //Constructor de la clase padre 
    public LAB3(String nomb, int capa, String equi) {
        super(nomb, capa, equi);
    }
    
    //Sobreescritura del metodo Horarios, el cual pertenece a la clase Padre Laboratorio
    @Override
    public void Horarios(boolean marc) {
        System.out.println("Horarios del laboratorio 3 disponibles");
        if(u == false){
            System.out.println("1: 07:00 - 08:00");
        }
        
        if(d == false){
            System.out.println("2: 08:00 - 09:00");
        }
        
        if(t == false){
            System.out.println("3: 09:00 - 10:00");
        }
        
        if(c == false){
            System.out.println("4: 10:00 - 11:00");
        }
        
        if(ci == false){
            System.out.println("5: 11:00 - 12:00");
        }
        
        if(se == false){
            System.out.println("6: 12:00 - 13:00");
        }
        
        if(si == false){
            System.out.println("7: 13:00 - 14:00");
        }
        
        if(o == false){
            System.out.println("8: 14:00 - 15:00");
        }
        
        if(n == false){
            System.out.println("9: 15:00 - 16:00");
        }
        
        if(marc ==false){
             
         
                    si = true;
                    break;
                case 8: 
                    o = true;
                    break;
                case 9: 
                    n = true;
                    break;
            }
        }   
    }
}
