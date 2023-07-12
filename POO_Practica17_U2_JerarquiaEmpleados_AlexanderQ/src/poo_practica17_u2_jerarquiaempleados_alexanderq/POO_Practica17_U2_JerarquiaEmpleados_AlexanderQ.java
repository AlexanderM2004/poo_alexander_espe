package poo_practica17_u2_jerarquiaempleados_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_Practica17_U2_JerarquiaEmpleados_AlexanderQ {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Director dic = new Director("",0,"",0,0,0,200);
        Operario ope = new Operario(0,"",0,0,0,200);
        int opc;
        do{
            System.out.println("Jerarquia de empleados");
            System.out.println("1: Director");
            System.out.println("2: Operario");
            System.out.println("3: Salir");
            opc = tec.nextInt();
            switch(opc){
                case 1:
                    System.out.println("-------------------------DIRECTOR-------------------------");
                    System.out.print("Nombre: ");
                    tec.nextLine();
                    dic.nomb = tec.nextLine();
                    System.out.print("Edad: ");
                    dic.edad = tec.nextInt();
                    System.out.print("Departamento: ");
                    tec.nextLine();
                    dic.departa = tec.nextLine();
                    System.out.print("Personal: ");
                    dic.personal = tec.nextInt();
                    System.out.print("Año de ingreso: ");
                    dic.fechaingre = tec.nextInt();
                    System.out.print("Salario: ");
                    dic.salario = tec.nextDouble();
                    empleados(new Director(dic.departa, dic.personal, dic.nomb ,dic.edad, dic.fechaingre,dic.salario, dic.bono)); 
                    break;
                case 2:
                    System.out.println("-------------------------OPERADOR-------------------------");
                    System.out.print("Nombre: ");
                    tec.nextLine();
                    ope.nomb = tec.nextLine();
                    System.out.print("Edad: ");
                    ope.edad = tec.nextInt();
                    System.out.print("Nivel: ");
                    tec.nextLine();
                    ope.nivel = tec.nextInt();
                    System.out.print("Año de ingreso: ");
                    ope.fechaingre = tec.nextInt();
                    System.out.print("Salario: ");
                    ope.salario = tec.nextDouble();
                    empleados(new Operario(ope.nivel,ope.nomb,ope.edad,ope.fechaingre,ope.salario,ope.bono)); 
                    break;
                case 3:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada, vuelva a intentarlo");
                    break;
            }
        }while(opc != 3);
    }

    private static void empleados(Empleado E) {
        E.incentivar();
    }
    
}
