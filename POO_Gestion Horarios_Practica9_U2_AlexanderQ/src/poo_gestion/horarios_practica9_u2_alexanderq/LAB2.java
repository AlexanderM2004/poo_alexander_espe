package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */
import java.util.*;
public class LAB2 extends Laboratorio{
    Scanner tecl = new Scanner (System.in);
    String espa;
    boolean un = false, doss = false, tre = false, cu = false, cinc = false, sei = false, sie = false; 
    boolean och = false, nu = false;
    
    public LAB2(String nomb, int capa, String equi, String resplab, String espa) {
        super(nomb, capa, equi, resplab);
        this.espa = espa;
    }

    public void Horarios(boolean marc) {
        System.out.println("Horarios del laboratorio 2 disponibles");
        if(un == false){
            System.out.println("1: 07:00 - 08:00");
        }
        
        if(doss == false){
            System.out.println("2: 08:00 - 09:00");
        }
        
        if(tre == false){
            System.out.println("3: 09:00 - 10:00");
        }
        
        if(cu == false){
            System.out.println("4: 10:00 - 11:00");
        }
        
        if(cinc == false){
            System.out.println("5: 11:00 - 12:00");
        }
        
        if(sei == false){
            System.out.println("6: 12:00 - 13:00");
        }
        
        if(sie == false){
            System.out.println("7: 13:00 - 14:00");
        }
        
        if(och == false){
            System.out.println("8: 14:00 - 15:00");
        }
        
        if(nu == false){
            System.out.println("9: 15:00 - 16:00");
        }
        
        if(marc ==false){
             
        }else{
            System.out.println("Hora a reservar: ");
            int hora = tecl.nextInt();

            switch(hora){
                case 1: 
                    un = true;
                    break;
                case 2: 
                    doss = true;
                    break;
                case 3: 
                    tre = true;
                    break;
                case 4: 
                    cu = true;
                    break;
                case 5: 
                    cinc = true;
                    break;
                case 6: 
                    sei = true;
                    break;
                case 7: 
                    sie = true;
                    break;
                case 8: 
                    och = true;
                    break;
                case 9: 
                    nu = true;
                    break;
            }
        }   
    }
    
}
