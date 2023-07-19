package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe 
 */


//Importar la libreria que permita ingresar informacion mediante el teclado
import java.util.*;
import Carrera.*;
import Personal.*;

public class POO_GestionHorarios_Practica9_U2_AlexanderQ {
    public static void main(String[] args) {
        //Creacion de Objetos
        Scanner tecla = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        
        //Creacion de arreglos para almacenar la informacion en memoria cache
        String[] mate1 = new String[10];
        String[] doce1 = new String[10];
        String[] hora1 = new String[10];
        String[] mate2 = new String[10];
        String[] doce2 = new String[10];
        String[] hora2 = new String[10];
        String[] mate3 = new String[10];
        String[] doce3 = new String[10];
        String[] hora3 = new String[10];
        
        //Creacion de objetos
        LAB1 lab1 = new LAB1(null, 0, null);
        LAB2 lab2 = new LAB2(null, 0, null);
        LAB3 lab3 = new LAB3(null, 0, null);
        Alumno alu = new Alumno(null, 0, 0, 0);
        EncargadoLab docencar1 = new EncargadoLab(null, 0, 0, null);
        EncargadoLab docencar2 = new EncargadoLab(null, 0, 0, null);
        EncargadoLab docencar3 = new EncargadoLab(null, 0, 0, null);
        Profesor profe = new Profesor(null, 0, null, 0);
        
        //Declaracion de variables
        int opc,op, cant = 0;
        int cantLab = 0, cantLab2 = 0,cantLab3 =0 ;
        boolean marc = false, band = true, Labo1 = false, Labo2 = false, Labo3 = false;
        boolean lab_1 = false, lab_2=false, lab_3=false, marcador =false;
        
        do{
        	//Menu de opciones 
            System.out.println("---------JUNTOS POR LA EDUCACIÓN TECNOLÓGICA SUPERIOR--------");
            System.out.println(" 1: Reservar Laboratorios");
            System.out.println(" 2: Ver horario de laboratorios");
            System.out.println(" 3: Ver reservas de laboratorios");
            System.out.println(" 4: Ingresar informacion de laboratorios");
            System.out.println(" 5: Salir");
            System.out.println("-------------------------------------------------------------");
            opc = tecla.nextInt(); // lectura para menu de opciones
            
            switch (opc){
                case 1:
                    if(marcador ==true){
                        System.out.println("Reservar Laboratorio");
                        System.out.println("1: Lab. " + lab1.getNomb());
                        System.out.println("2: Lab. " + lab2.getNomb());
                        System.out.println("3: Lab. " + lab3.getNomb());
                        op = tecla.nextInt();
                        switch (op){
                            case 1:
                                if(Labo1 == true){
                                    lab_1 = true;
                                    System.out.println("Lab. " + lab1.getNomb());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("Capacidad: " + lab1.getCapa());
                                    System.out.println("Equipos del laboratorio: " + lab1.getEqui());
                                    System.out.println("Encargado de Laboratorio: " + docencar1.getNombre());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("¿Cuántos laboratorios desea registrar?: ");
                                    cantLab = tecla.nextInt();
                                    for(int i = 0; i < cantLab; i++){
                                        System.out.println("-------------------------------------------------------------");
                                        System.out.print("Materia: ");
                                        mate1[i] = tecla.nextLine();
                                        System.out.print("Docente: ");
                                        doce1[i] = tecla.nextLine();
                                        profe.datodedoce(); //paso de parametros a la clase profesor
                                        System.out.print("Hora (Texto): ");
                                        hora1[i] = tecla.nextLine();
                                        System.out.print("Cantidad de Estudiantes a asistir: ");
                                        cant = tecla.nextInt();
                                        System.out.println("Registro de estudiantes: ");
                                        alu.registroEstu(cant);//paso de parametros a la clase alumno
                                        System.out.println("-------------------------------------------------------------");
                                        lab1.Horarios(band);
                                    }
                                }else{
                                    System.out.println("NOTA: Primero Ingrese informacion del laboratorio 1");
                                }
                                break;
                            case 2:
                                if(Labo2 == true){
                                    lab_2 = true;
                                    System.out.println("Lab. " + lab2.getNomb());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("Capacidad: " + lab2.getCapa());
                                    System.out.println("Equipos del laboratorio: " + lab2.getEqui());
                                    System.out.println("Encargado de Laboratorio: " + docencar2.getNombre());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("¿Cuántos laboratorios desea registrar?: ");
                                    cantLab2 = tecla.nextInt();
                                    for(int i = 0; i < cantLab2; i++){
                                        System.out.println("-------------------------------------------------------------");
                                        System.out.print("Materia: ");
                                        mate2[i]=tecla.nextLine();
                                        System.out.print("Docente: ");
                                        doce2[i] = tecla.nextLine();
                                        profe.datodedoce(); //paso de parametros a la clase profesor
                                        System.out.print("Hora (Texto): ");
                                        hora2[i] = tecla.nextLine();
                                        System.out.print("Cantidad de Estudiantes a asistir: ");
                                        cant = tecla.nextInt();
                                        System.out.println("Registro de estudiantes: ");
                                        alu.registroEstu(cant); //paso de parametros a la clase alumno
                                        System.out.println("-------------------------------------------------------------");
                                        lab2.Horarios(band);
                                    }
                                }else{
                                    System.out.println("NOTA: Primero Ingrese informacion del laboratorio 2");
                                }
                                break;
                            case 3:
                                if(Labo3 == true){
                                    lab_3 = true;
                                    System.out.println("Lab. " + lab3.getNomb());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("Capacidad: " + lab3.getCapa());
                                    System.out.println("Equipos del laboratorio: " + lab3.getEqui());
                                    System.out.println("Encargado de Laboratorio: " + docencar3.getNombre());
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.println("¿Cuántos laboratorios desea registrar?: ");
                                    cantLab3 = tecla.nextInt();
                                    for(int i = 0; i < cantLab3; i++){
                                        System.out.println("-------------------------------------------------------------");
                                        System.out.print("Materia: ");
                                        mate3[i]=tecla.nextLine();
                                        System.out.print("Docente: ");
                                        doce3[i] = tecla.nextLine();
                                        profe.datodedoce(); //paso de parametros a la clase profesor
                                        System.out.print("Hora (Texto): ");
                                        hora3[i] = tecla.nextLine();
                                        System.out.print("Cantidad de Estudiantes a asistir: ");
                                        cant = tecla.nextInt();
                                        System.out.println("Registro de estudiantes: ");
                                        alu.registroEstu(cant); //paso de parametros a la clase alumno
                                        System.out.println("-------------------------------------------------------------");
                                        lab3.Horarios(band);
                                    }
                                }else{
                                    System.out.println("NOTA: Primero Ingrese informacion del laboratorio 3");
                                } 
                                break;
                            default:
                                System.out.println("No existe el laboratorio seleccionado");
                                break;
                        } 
                    }else{
                        System.out.println("Primero Ingrese informacion de los laboratorios");
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------------");
                    lab1.Horarios(marc);
                    System.out.println("-------------------------------------------------------------");
                    lab2.Horarios(marc);
                    System.out.println("-------------------------------------------------------------");
                    lab3.Horarios(marc);
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ver reservas de laboratorios");
                    if(lab_1 == true){
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Lab. "+lab1.getNomb());
                        for(int i = 0; i<cantLab; i++){
                            System.out.println("Materia: "+ mate1[i]);
                            System.out.println("Docente: "+ doce1[i]);
                            System.out.println("Hora (Texto): "+ hora1[i]);
                            System.out.println("Registro de estudiantes: ");
                            alu.mostrarregistroEstu(cant); //paso de parametros a la  clase alumnos para mostrar registro de alumnos
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                   
                    if(lab_2 == true){
                        System.out.println("Lab."+lab2.getNomb());
                        for(int i = 0; i<cantLab2; i++){
                            System.out.println("Materia: "+ mate2[i]);
                            System.out.println("Docente: "+ doce2[i]);
                            System.out.println("Hora (Texto): "+ hora2[i]);
                            alu.mostrarregistroEstu(cant); //paso de parametros a la  clase alumnos para mostrar registro de alumnos
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                    
                    if(lab_3 == true){
                        System.out.println("Lab. "+lab3.getNomb());
                        for(int i = 0; i<cantLab3; i++){
                            System.out.println("Materia: "+ mate3[i]);
                            System.out.println("Docente: "+ doce3[i]);
                            System.out.println("Hora (Texto): "+ hora3[i]);
                            alu.mostrarregistroEstu(cant); //paso de parametros a la  clase alumnos para mostrar registro de alumnos
                            System.out.println("-------------------------------------------------------------");
                        }
                    }
                    break;
                case 4:
                    marcador = true;
                    System.out.println("Ingresar Informacion de Laboratorios");
                    System.out.println("1: Laboratorio 1");
                    System.out.println("2: Laboratorio 2");
                    System.out.println("3: Laboratorio 3");
                    op = tecla.nextInt();
                    
                    switch (op){
                        case 1:
                            Labo1 = true; //Control para acceder a reservar laboratorio caso contrario no permitira ingresar 
                            System.out.println("Laboratorio 1");
                            System.out.print("Nombre del Laboratorio: ");     
                            tecla.nextLine(); 
                            lab1.nomb = e.nextLine(); 
                            System.out.print("Capacidad: ");
                            lab1.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio: ");
                            tecla.nextLine();
                            lab1.equi = e.nextLine();
                            System.out.println("Encargado de Laboratorio: ");
                            docencar1.datodeencar();
                            
                            //Metodo Set
                            lab1.setNomb(lab1.nomb);
                            lab1.setCapa(lab1.capa);
                            lab1.setEqui(lab1.equi);
                            break;
                        case 2:
                            Labo2 = true; //Control para acceder a reservar laboratorio caso contrario no permitira ingresar 
                            System.out.println("Laboratorio 2");
                            System.out.print("Nombre del Laboratorio: ");
                            tecla.nextLine();
                            lab2.nomb = e.nextLine(); 
                            System.out.print("Capacidad: ");
                            lab2.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio: ");
                            tecla.nextLine();
                            lab2.equi  = e.nextLine(); 
                            System.out.println("Encargado de Laboratorio: ");
                            docencar2.datodeencar();
                            
                            //Metodo Set
                            lab2.setNomb(lab2.nomb);
                            lab2.setCapa(lab2.capa);
                            lab2.setEqui(lab2.equi);
                            break;
                        case 3:
                            Labo3 = true; //Control para acceder a reservar laboratorio caso contrario no permitira ingresar 
                            System.out.println("Laboratorio 3");
                            System.out.print("Nombre del Laboratorio: ");
                            tecla.nextLine();
                            lab3.nomb = e.nextLine();
                            System.out.print("Capacidad: ");
                            lab3.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio: ");
                            tecla.nextLine();
                            lab3.equi = e.nextLine(); 
                            System.out.println("Encargado de Laboratorio: ");
                            docencar3.datodeencar();
                            
                            //Metodo Set
                            lab3.setNomb(lab3.nomb);
                            lab3.setCapa(lab3.capa);
                            lab3.setEqui(lab3.equi);
                            break;
                        default:
                            System.out.println("No existe el laboratorio seleccionado");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Muchas gracias por utilizar nuestro sistema .... Saliendo...");
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada, por favor vuelva a intentarlo");
                    break;
            }
        }while (opc != 5); 
    }
}
