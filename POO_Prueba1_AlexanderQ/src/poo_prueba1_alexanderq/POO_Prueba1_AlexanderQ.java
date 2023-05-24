/**UNIVERSIDAD DE LAS FUERZAS - ESPE
 * Nombre: Alexander Miguel Quizhpe Cuzme
 * Programacion Orientada a Objetos
 */
package poo_prueba1_alexanderq;
import javax.swing.JOptionPane; //Permite ingresar datos

public class POO_Prueba1_AlexanderQ {
    public static void main(String[] args) {
        //Declaracion de variables
        int opc;
        String name1, name2;
        boolean band = false;
        float not1, not2, not3, not4, not5, prom1=0, prom2=0;
        
        //Creacion de objetos
        Estudiante estu1 = new Estudiante();
        Estudiante estu2 = new Estudiante();
        
        do{
            System.out.println("-----------------------CALIFICACIONES-----------------------");
            System.out.println("1: Ingresar nota");
            System.out.println("2: Ver nota media");
            System.out.println("3: Ver aprovados");
            System.out.println("4: Salir");
            System.out.println("------------------------------------------------------------");
            opc = Integer.parseInt(JOptionPane.showInputDialog(""));
            
            switch (opc){
                case 1: 
                    System.out.println("---------------------INGRESAR NOTAS---------------------");
                    System.out.println("Ingrese notas dentro de un rango de 0 -20");
                    System.out.println("------------------------------------------------------------");
                    
                    //Permite el ingreso de datos al estudiante 1
                    System.out.println("Estudiante 1");
                    name1 = JOptionPane.showInputDialog("Nombre del estudiante 1");
                    not1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 1: "));
                    not2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 2: "));
                    not3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 3: "));
                    not4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 4: "));
                    not5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 5: "));
                    
                    //Enviar informacion a la clase mediante el SET
                    estu1.setName1(name1);
                    estu1.setNot1(not1);
                    estu1.setNot2(not2);
                    estu1.setNot3(not3);
                    estu1.setNot4(not4);
                    estu1.setNot5(not5);
                    
                    System.out.println("------------------------------------------------------------");
                    
                    //Permite el ingreso de datos al estudiante 2
                    System.out.println("Estudiante 2");
                    name2 = JOptionPane.showInputDialog("Nombre del estudiante 2");
                    not1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 1: "));
                    not2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 2: "));
                    not3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 3: "));
                    not4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 4: "));
                    not5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota 5: "));
                    
                    //Enviar informacion a la clase mediante el SET
                    estu2.setName2(name2);
                    estu2.setNot1(not1);
                    estu2.setNot2(not2);
                    estu2.setNot3(not3);
                    estu2.setNot4(not4);
                    estu2.setNot5(not5);
              
                    band = true;
                    break;
                case 2: 
                    System.out.println("------------------------------------------------------------");
                    if(band == true){
                        prom1 = (estu1.getNot1() + estu1.getNot2()+estu1.getNot3()+estu1.getNot4() + estu1.getNot5())/5;
                        System.out.println("Estudiante 1: " + estu1.getName1());
                        System.out.println("Nota media estudiante 1: "+prom1);
                      
                        prom2 = (estu2.getNot1() + estu2.getNot2()+estu2.getNot3()+estu2.getNot4() + estu2.getNot5())/5;
                        System.out.println("Estudiante 2: " + estu2.getName2());
                        System.out.println("Nota media estudiante 2: "+prom2);
                    }else{
                        System.out.println("Primero ingrese calificaciones");
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------");
                    if(band == true){
                        System.out.println("APROVADOS Y REPROVADOS");
                        //Vefificacion de aprobar
                        if(prom1<=20){
                            System.out.println("Estudiante 1: " + estu1.getName1());
                            System.out.println("Estudiante 1: Aprueba");
                        }else{
                            System.out.println("Estudiante 1: " + estu1.getName1());
                            System.out.println("Estudiante 1: Reprueba");
                        }
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                        //Vefificacion de aprobar
                        if(prom2<=20){
                            System.out.println("Estudiante 2: " + estu2.getName2());
                            System.out.println("Estudiante 2: Aprueba");
                        }else{
                            System.out.println("Estudiante 2: " + estu2.getName2());
                            System.out.println("Estudiante 2: Reprueba");
                        }
                    }else{
                        System.out.println("Primero ingrese calificaciones");
                    }
                    break;
                case 4:
                    System.out.println("Muchas Gracias ... Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese una opcion valida");
                    break;
            }
        }while(opc != 4);
    }
}
