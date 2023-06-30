package poo_cuentab_practica12_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */
import java.util.*;

public class POO_CuentaB_Practica12_U2_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla = new Scanner(System.in);
        float cant = 0;
        int opc = 0;
        CuentaLimitante cuent = new CuentaLimitante("Alexander",100, 230400799);
        do{
            System.out.println("1: Depositar");
            System.out.println("2: Retirar");
            System.out.println("3: Salir");
            opc = tecla.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("----------------------------DEPOSITO----------------------------");
                    System.out.print("Ingrese monto: ");
                    cant = tecla.nextFloat();
                    cuent.deposito(cant);
                    break;
                case 2:
                    System.out.println("-----------------------------RETIRO-----------------------------");
                    System.out.print("Ingrese monto: ");
                    cant = tecla.nextFloat();
                    cuent.retiro(cant);
                    break;
                case 3:
                     System.out.println("Muchas gracia por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada");
                    break;
            }
        }while(opc != 3);
    }
    
}
