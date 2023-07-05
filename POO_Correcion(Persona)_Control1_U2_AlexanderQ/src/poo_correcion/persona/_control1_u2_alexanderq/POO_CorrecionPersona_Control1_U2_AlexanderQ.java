package poo_correcion.persona._control1_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_CorrecionPersona_Control1_U2_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Estudiante estu = new Estudiante(0,"",0,"","");
        Trabajador traba = new Trabajador(0,"",0,"",0,0);
        int opc;
        do{
            
            System.out.println("Seleccione su profesion");
            System.out.println("1: Trabajador");
            System.out.println("2: Estudiante");
            System.out.println("3: Mostrar nomina");
            System.out.println("4: Salir");
            System.out.println("---------------------------------------------");
            opc = tec.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("----------------TRABAJADORES-----------------");
                    System.out.print("Nombre: ");
                    tec.nextLine();
                    traba.nombre = c.nextLine() ;
                    System.out.print("Cedula: ");
                    traba.CI = tec.nextLong();
                    System.out.print("Edad: ");
                    traba.edad = tec.nextInt();
                    System.out.print("Area de trabajo: ");
                    tec.nextLine();
                    traba.Area = c.nextLine();
                    System.out.print("Años de experiencia: ");
                    traba.añosexpe = tec.nextInt();
                    System.out.print("Salario: ");
                    traba.sueldo = tec.nextFloat();
                    
                    traba.setNombre(traba.nombre);
                    traba.setCI(traba.CI);
                    traba.setEdad(traba.edad);
                    traba.setArea(traba.Area);
                    traba.setAñosexpe(traba.añosexpe);
                    traba.setSueldo(traba.sueldo);
                    break;
                case 2:
                    System.out.println("-----------------ESTUDIANTES-----------------");
                    System.out.print("Nombre: ");
                    tec.nextLine();
                    estu.nombre = c.nextLine();
                    System.out.print("Cedula: ");
                    estu.CI = tec.nextLong();
                    System.out.print("Edad: ");
                    estu.edad = tec.nextInt();
                    System.out.print("Carrera: ");
                    tec.nextLine();
                    estu.carrera = c.nextLine();
                    System.out.print("Instituto/Universidad: ");
                    estu.instituto = tec.nextLine();
                    
                    estu.setNombre(estu.nombre);
                    estu.setCI(estu.CI);
                    estu.setEdad(estu.edad);
                    estu.setCarrera(estu.carrera);
                    estu.setInstituto(estu.instituto);
                    
                    break;
                case 3:
                    System.out.println("Nomina");
                    System.out.println("TRABAJADORES");
                    System.out.println("Nombre: "+ traba.getNombre());
                    System.out.println("Cedula: " + traba.getCI());
                    System.out.println("Edad: " + traba.getEdad());
                    System.out.println("Area de trabajo: " + traba.getArea());
                    System.out.println("Años de experiencia: " + traba.getAñosexpe());
                    System.out.println("Salario: " + traba.getSueldo());
                    System.out.println("---------------------------------------------");
                    System.out.println("ESTUDIANTES");
                    System.out.println("Nombre: "+estu.getNombre());
                    System.out.println("Cedula: "+estu.getCI());
                    System.out.println("Edad: "+estu.getEdad());
                    System.out.println("Carrera: "+estu.getCarrera());
                    System.out.println("Instituto/Universidad: "+estu.getInstituto());
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("No existe la opcion ingresada, por favor vuelva a intentarlo");
                    break;
            }
        }while(opc !=4);
    }
}
