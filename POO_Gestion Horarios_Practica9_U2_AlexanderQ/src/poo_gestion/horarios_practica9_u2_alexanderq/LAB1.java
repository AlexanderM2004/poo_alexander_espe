package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class LAB1 extends Laboratorio{
    Scanner tecl = new Scanner (System.in);
    boolean uno = false, dos = false, tres = false, cua = false, cinco = false, seis = false, siete = false; 
    boolean ocho = false, nue = false;
    String espacio;

    public LAB1(String nomb, int capa, String equi, String resplab, String espacio) {
        super(nomb, capa, equi, resplab);
        this.espacio = espacio;
    }

    public void Horarios(boolean marc) {
        System.out.println("Horarios del laboratorio 1 disponibles");
        if(uno == false){
            System.out.println("1: 07:00 - 08:00");
        }
        
        if(dos == false){
            System.out.println("2: 08:00 - 09:00");
        }
        
        if(tres == false){
            System.out.println("3: 09:00 - 10:00");
        }
        
        if(cua == false){
            System.out.println("4: 10:00 - 11:00");
        }
        
        if(cinco == false){
            System.out.println("5: 11:00 - 12:00");
        }
        
        if(seis == false){
            System.out.println("6: 12:00 - 13:00");
        }
        
        if(siete == false){
            System.out.println("7: 13:00 - 14:00");
        }
        
        if(ocho == false){
            System.out.println("8: 14:00 - 15:00");
        }
        
        if(nue == false){
            System.out.println("9: 15:00 - 16:00");
        }
        
        if(marc ==false){
            
        }else{
            System.out.println("Hora a reservar: ");
            int hora = tecl.nextInt();

            switch(hora){
                case 1: 
                    uno = true;
                    break;
                case 2: 
                    dos = true;
                    break;
                case 3: 
                    tres = true;
                    break;
                case 4: 
                    cua = true;
                    break;
                case 5: 
                    cinco = true;
                    break;
                case 6: 
                    seis = true;
                    break;
                case 7: 
                    siete = true;
                    break;
                case 8: 
                    ocho = true;
                    break;
                case 9: 
                    nue = true;
                    break;
            }
        }   
    }
}
