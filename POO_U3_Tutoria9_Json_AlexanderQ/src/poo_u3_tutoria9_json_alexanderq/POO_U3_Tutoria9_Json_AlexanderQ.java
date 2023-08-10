package poo_u3_tutoria9_json_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_U3_Tutoria9_Json_AlexanderQ {

    public static void main(String[] args) {
        
        List<Persona> personasList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Guardar en JSON");
            System.out.println("4. Cargar desde JSON");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    personasList.add(crearPersonaDesdeConsola(scanner));
                    break;
                case 2:
                    mostrarPersonas(personasList);
                    break;
                case 3:
                    JsonManager.guardarEnJSON(personasList);
                    break;
                case 4:
                    personasList = JsonManager.cargarDesdeJSON();
                    if (personasList != null) {
                        System.out.println("Datos cargados desde JSON");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static Persona crearPersonaDesdeConsola(Scanner scanner) {
        System.out.print("Ingrese el codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cédula: ");
        long cedula = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Ingrese el celular: ");
        String celular = scanner.nextLine();

        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();

        return new Persona(codigo, nombre, cedula, celular, correo);
    }

    private static void mostrarPersonas(List<Persona> personasList) {
        System.out.println("Personas:");
        for (Persona persona : personasList) {
            System.out.println(persona);
        }
    }
}
