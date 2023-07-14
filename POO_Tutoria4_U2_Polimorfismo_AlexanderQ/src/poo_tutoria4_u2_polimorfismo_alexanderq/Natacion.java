package poo_tutoria4_u2_polimorfismo_alexanderq;

/**
 * @author PERSONAL
 */

public class Natacion extends Deportista{
    
    private String estilo;
    
    public Natacion(String nombre, int edad, String disciplina, String sexo, String estilo) {
        super(nombre, edad, disciplina, sexo);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void entrenamiento() {
        System.out.println("La natacion es un deporte acuatico");
    }
    
    public void mostrardatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Disciplina: "+getDisciplina());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Estilo: "+getEstilo());
        System.out.println(" ");
    }
}
