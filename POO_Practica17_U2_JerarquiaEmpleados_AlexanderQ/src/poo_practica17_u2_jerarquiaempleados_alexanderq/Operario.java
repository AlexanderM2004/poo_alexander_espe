package poo_practica17_u2_jerarquiaempleados_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class Operario extends Empleado {
    Scanner tecl = new Scanner(System.in);
    float nivel;

    public Operario(float nivel, String nomb, int edad, int fechaingre, double salario, double bono) {
        super(nomb, edad, fechaingre, salario, bono);
        this.nivel = nivel;
    }
    
    @Override
    public void incentivar() {
        int años = 2023 - fechaingre;
        if(años >=2){
            if((nivel >=1)&&(nivel < 5)){
                float nve = nivel + 1;
                nivel = nve;
                System.out.println("Nivel actualizado por tener mas de 2 años trabajando: " + nivel);
            }
        }
        if(años >= 30){
            if(nivel >= 2){
                double salact = salario + (bono *2);
                System.out.println("Años trabajando: "+años);
                System.out.println("Bono: "+bono*2);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }else{
                double salact = salario + bono;
                System.out.println("Años trabajando: "+años);
                System.out.println("Bono: "+bono);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }
        }else{
            if(nivel >= 2){
                double salact = salario + bono;
                System.out.println("Años trabajando: "+años);
                System.out.println("Bono: "+bono);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }else{
                System.out.println("Años trabajando: "+años);
                System.out.println("El salario sin bonificacion es de: "+salario+" $");
            }
        }
        
         System.out.println("----------------------------------------------------------");
    }
}
