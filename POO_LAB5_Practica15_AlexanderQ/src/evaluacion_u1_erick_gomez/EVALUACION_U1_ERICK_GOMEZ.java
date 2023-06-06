/*
Gestión Matriculas

Se desea diseñar un sistema para la ESPE. El sistema necesita ingresar profesores 
(cédula, nombre, dirección, teléfono, celular). Los profesores imparten materias. 
Cada alumno está matriculado en uno o varias materias. Los profesores pueden 
impartir varias materias, pero una materia sólo puede ser impartido por un profesor.
EL sistema de matrícula se caracteriza por los siguientes datos:

·        profesores
·        alumno
·        Materias
·        Matricula

Los pedidos se almacenarán, donde cada pedido se guardará con el formato:
profesores|alumno|materias|matricula|

Al iniciarse el programa, aparecerá un menú con las siguientes opciones:
1. Profesores
2. Alumno
3. Materias.
4.- Gestión Matriculas
5.-Total Matriculados
6.- Salir

La opción 1 ingresar 2 Profesores
La opción 2 ingresar 6 alumnos
La opción 3 ingresar 4 materias
Al elegir la opción 4, solicitará la introducción de los datos de matrícula, guardar 4
Con la opción 5 se mostrará el total matriculado, y el total de la ESPE cuantos hombres y cuantas mujeres.
*/
package evaluacion_u1_erick_gomez;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class EVALUACION_U1_ERICK_GOMEZ {
    public static void main(String[] args) {
        int op = 0, value = 0, gener, idmateria, idestudiante, idprofesor;
        String name, direction;
        long cedula, phone, cellphone;
        
        Scanner req = new Scanner(System.in);
        Gestor admin = new Gestor();
        
        do {
            System.out.println(
                    "==================================\n" +
                    "Bienvenido a la Gestión Matriculas \n" +
                    "Seleccione una opcion \n" +
                    "1. Profesores \n" +
                    "2. Alumnos \n" +
                    "3. Materias \n" +
                    "4. Gestion matricula \n" +
                    "5. Total matriculados \n" +
                    "9. Salir"
            );
            
            op = req.nextInt();
            
            switch (op){
                case 1:
                    System.out.println("Opcion 1");
                    req.nextLine();
                    System.out.println("Ingrese el nombre 'string'");
                    name = req.nextLine();
                    System.out.println("Ingrese la direccion 'string'");
                    direction = req.nextLine();
                    System.out.println("Ingrese la cedula 'long'");
                    cedula = req.nextLong();
                    System.out.println("Ingrese el telefono 'long'");
                    phone = req.nextLong();
                    System.out.println("Ingrese el celular 'long'");
                    cellphone = req.nextLong();
                    
                    if (admin.addProfe(name, direction, cedula, phone, cellphone)){
                        System.out.println("Se guardo un profesor");
                    }
                    break;
                    
                case 2:
                    System.out.println("Opcion 2");
                    req.nextLine();
                    System.out.println("Ingrese el nombre 'string'");
                    name = req.nextLine();
                    System.out.println("Ingrese la cedula 'long'");
                    cedula = req.nextLong();
                    System.out.println("Ingrese el genero 0 Masculino, 1 Femenino 'int'");
                    gener = req.nextInt();
                    
                    if (admin.addEstudiante(name, cedula, gener)){
                        System.out.println("Se guardo un estudiante");
                    }
                    break;
                    
                case 3:
                    System.out.println("Opcion 3");
                    
                    if (!admin.checkProfes()){
                        System.out.println("No hay profesores");
                        break;
                    }
                    
                    req.nextLine();
                    System.out.println("Ingrese el nombre de la materia 'string'");
                    name = req.nextLine();
                    System.out.println("Aqui estan los profesores:");
                    admin.showProfes();
                    System.out.println("Ingrese el ID del Profesor 'Int'");
                    value = req.nextInt();

                    if (admin.addMateria(name, value)){
                        System.out.println("Se guardo la materia");
                    }
                    
                    break;
                    
                    
                case 4:
                    System.out.println("Opcion 4");
                    
                    if (!admin.checkMaterias()){
                        System.out.println("No hay Materias");
                        break;
                    }
                    if (!admin.checkEstudiantes()){
                        System.out.println("No hay Estudiantes");
                        break;
                    }
                    
                    req.nextLine();
                    System.out.println("Aqui estan las materias:");
                    admin.showMaterias();
                    System.out.println("Ingrese el id de la materia 'Int'");
                    idmateria = req.nextInt();
                    System.out.println("Aqui estan los estudiantes:");
                    admin.showEstudiantes();
                    System.out.println("Ingrese el id del estudiante 'Int'");
                    idestudiante = req.nextInt();

                    if (admin.addMatricula(idmateria, idestudiante)){
                        System.out.println("Se guardo la matricula");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Opcion 5");
                    
                    if (!admin.checkMatricula()){
                        System.out.println("No hay Matriculas");
                        break;
                    }
                    System.out.println("Aqui estan los matriculados:");
                    admin.showMatriculas();
                    System.out.println("Estos son la cantidad por genero:");
                    admin.showMatriculasGeneros();
                    break;
                    
                case 9:
                    System.out.println("Gracias...");
                    break;
                    
                default:
                    System.out.println("Ingreso una opcion invalida");
                    break;
            }
            
        } while (op != 9);
        
    }
}
