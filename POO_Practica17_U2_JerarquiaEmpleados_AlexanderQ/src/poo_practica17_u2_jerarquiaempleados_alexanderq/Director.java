package poo_practica17_u2_jerarquiaempleados_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Director extends Empleado{
    public String departa;
    public int personal;

    public Director(String departa, int personal, String nomb, int edad, int fechaingre, double salario, double bono) {
        super(nomb, edad, fechaingre, salario, bono);
        this.departa = departa;
        this.personal = personal;
    }

    @Override
    public void incentivar() {
        int años = 2023 - fechaingre;
        int mes = años * 12;
        if(mes >= 30){
            if(personal >= 20){
                double salact = salario + (bono *2);
                System.out.println("Meses trabajando: "+mes);
                System.out.println("Bono: "+bono*2);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }else{
                double salact = salario + bono;
                System.out.println("Meses trabajando: "+mes);
                System.out.println("Bono: "+bono);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }
        }else{
            if(personal >= 20){
                double salact = salario + bono;
                System.out.println("Meses trabajando: "+mes);
                System.out.println("Bono: "+bono);
                System.out.println("El salario con bonificacion es de: "+salact+" $");
            }else{
                System.out.println("Meses trabajando: "+mes);
                System.out.println("El salario sin bonificacion es de: "+salario+" $");
            }
        }
        System.out.println("----------------------------------------------------------");
    }
}
