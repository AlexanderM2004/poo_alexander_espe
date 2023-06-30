package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_GestionHorarios_Practica9_U2_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion de Objetos
        Scanner tecla = new Scanner(System.in);
        LAB1 lab1 = new LAB1("", 0, "", "", "");
        LAB2 lab2 = new LAB2("", 0, "", "", "");
        LAB3 lab3 = new LAB3("", 0, "", "", "");
        Asignatura asig = new Asignatura("", "", "");
        Asignatura asig1 = new Asignatura("", "", "");
        Asignatura asig2= new Asignatura("", "", "");
        
        //Declaracion de variables
        int opc = 0, op;
        int cantLab = 0;
        boolean marc = false, band = true, marcador = false;
        
        do{
            System.out.println("---------JUNTOS POR LA EDUCACIÓN TECNOLÓGICA SUPERIOR--------");
            System.out.println(" 1: Reservar Laboratorios");
            System.out.println(" 2: Ver horario de laboratorios");
            System.out.println(" 3: Ver reservar de laboratorios");
            System.out.println(" 4: Ingresar informacion de laboratorios");
            System.out.println(" 5: Salir");
            System.out.println("-------------------------------------------------------------");
            opc = tecla.nextInt();
            
            switch (opc){
                case 1:
                    if (marcador == true){
                        System.out.println("Reservar Laboratorio");
                        System.out.println("1: Lab. Fisica/Matematica");
                        System.out.println("2: Lab. Informatica");
                        System.out.println("3: Lab. Quimica/Biologia");
                        op = tecla.nextInt();
                        switch (op){
                            case 1:
                                System.out.println("Lab. Fisica/Matematica");
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("Nombre del Laboratorio: " + lab1.getNomb());
                                System.out.print("Capacidad: " + lab1.getCapa());
                                System.out.print("Equipos del laboratorio: " + lab1.getEqui());
                                System.out.println("Encargado de Laboratorio: " + lab1.getResplab());
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("¿Cuántos laboratorios desea ingresar? ");
                                cantLab = tecla.nextInt();
                                for(int i = 0; i < cantLab; i++){
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.print("Materia: ");
                                    asig.asigna = tecla.nextLine();
                                    asig.setAsigna(asig.asigna);
                                    System.out.print("Docente: ");
                                    asig.doc = tecla.nextLine();
                                    asig.setDoc(asig.doc);
                                    System.out.println("Hora (Texto): ");
                                    asig.horario = tecla.nextLine();
                                    asig.setHorario(asig.horario);
                                    System.out.println("-------------------------------------------------------------");
                                    lab1.Horarios(band);
                                }
                                break;
                            case 2:
                                System.out.println("Lab. Informatica");
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("Nombre del Laboratorio: " + lab2.getNomb());
                                System.out.print("Capacidad: " + lab2.getCapa());
                                System.out.print("Equipos del laboratorio: " + lab2.getEqui());
                                System.out.println("Encargado de Laboratorio: " + lab2.getResplab());
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("¿Cuántos laboratorios desea ingresar? ");
                                cantLab = tecla.nextInt();
                                for(int i = 0; i < cantLab; i++){
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.print("Materia: ");
                                    asig1.asigna = tecla.nextLine();
                                    asig1.setAsigna(asig1.asigna);
                                    System.out.print("Docente: ");
                                    asig1.doc = tecla.nextLine();
                                    asig1.setDoc(asig1.doc);
                                    System.out.println("Hora (Texto): ");
                                    asig1.horario = tecla.nextLine();
                                    asig1.setHorario(asig1.horario);
                                    System.out.println("-------------------------------------------------------------");
                                    lab2.Horarios(band);
                                }
                                break;
                            case 3:
                                System.out.println("Lab. Quimica/Biologia");
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("Nombre del Laboratorio: " + lab3.getNomb());
                                System.out.print("Capacidad: " + lab3.getCapa());
                                System.out.print("Equipos del laboratorio: " + lab3.getEqui());
                                System.out.println("Encargado de Laboratorio: " + lab3.getResplab());
                                System.out.println("-------------------------------------------------------------");
                                System.out.print("¿Cuántos laboratorios desea ingresar? ");
                                cantLab = tecla.nextInt();
                                for(int i = 0; i < cantLab; i++){
                                    System.out.println("-------------------------------------------------------------");
                                    System.out.print("Materia: ");
                                    asig2.asigna = tecla.nextLine();
                                    asig2.setAsigna(asig2.asigna);
                                    System.out.print("Docente: ");
                                    asig2.doc = tecla.nextLine();
                                    asig2.setDoc(asig2.doc);
                                    System.out.println("Hora (Texto): ");
                                    asig2.horario = tecla.nextLine();
                                    asig2.setHorario(asig2.horario);
                                    System.out.println("-------------------------------------------------------------");
                                    lab3.Horarios(band);
                                }
                                break;
                            default:
                                System.out.println("No existe el laboratorio seleccionado");
                                break;
                        }
                        break;
                    }else{
                        System.out.println("Primero ingrese la informacion correspondiente a los laboratorios");
                    }
                case 2:
                    System.out.println("----------------------------------------------");
                    lab1.Horarios(marc);
                    System.out.println("----------------------------------------------");
                    lab2.Horarios(marc);
                    System.out.println("----------------------------------------------");
                    lab3.Horarios(marc);
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ver reservar de laboratorios");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Lab. Fisica/Matematica");
                    System.out.print("Materia: "+asig.getAsigna());
                    System.out.print("Docente: "+asig.getDoc());
                    System.out.println("Hora (Texto): "+asig.getHorario());
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Lab. Informatica");
                    System.out.print("Materia: "+asig1.getAsigna());
                    System.out.print("Docente: "+asig1.getDoc());
                    System.out.println("Hora (Texto): "+asig1.getHorario());
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Lab. Quimica/Biologia");
                    System.out.print("Materia: "+asig2.getAsigna());
                    System.out.print("Docente: "+asig2.getDoc());
                    System.out.println("Hora (Texto): "+asig2.getHorario());
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 4:
                    marcador = true;
                    System.out.println("Ingresar Informacion de Laboratorios");
                    System.out.println("1: Lab. Fisica/Matematica");
                    System.out.println("2: Lab. Informatica");
                    System.out.println("3: Lab. Quimica/Biologia");
                    op = tecla.nextInt();
                    switch (op){
                        case 1:
                            System.out.println("Lab. Fisica/Matematica");
                            System.out.print("Nombre del Laboratorio: ");
                            lab1.nomb = tecla.nextLine();
                            System.out.print("Capacidad: ");
                            lab1.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio:");
                            lab1.equi = tecla.nextLine();
                            System.out.println("Encargado de Laboratorio: ");
                            lab1.resplab = tecla.nextLine();
                            
                            lab1.setNomb(lab1.nomb);
                            lab1.setCapa(lab1.capa);
                            lab1.setEqui(lab1.equi);
                            lab1.setResplab(lab1.resplab);
                            break;
                        case 2:
                            System.out.println("Lab. Informatica");
                            System.out.print("Nombre del Laboratorio: ");
                            lab2.nomb = tecla.nextLine();
                            System.out.print("Capacidad: ");
                            lab2.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio:");
                            lab2.equi = tecla.nextLine();
                            System.out.println("Encargado de Laboratorio: ");
                            lab2.resplab = tecla.nextLine();
                            
                            lab2.setNomb(lab2.nomb);
                            lab2.setCapa(lab2.capa);
                            lab2.setEqui(lab2.equi);
                            lab2.setResplab(lab2.resplab);
                            break;
                        case 3:
                            System.out.println("Lab. Quimica/Biologia");
                            System.out.print("Nombre del Laboratorio: ");
                            lab3.nomb = tecla.nextLine();
                            System.out.print("Capacidad: ");
                            lab3.capa = tecla.nextInt();
                            System.out.print("Equipos del laboratorio:");
                            lab3.equi = tecla.nextLine();
                            System.out.println("Encargado de Laboratorio: ");
                            lab3.resplab = tecla.nextLine();
                            
                            lab3.setNomb(lab3.nomb);
                            lab3.setCapa(lab3.capa);
                            lab3.setEqui(lab3.equi);
                            lab3.setResplab(lab3.resplab);
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
