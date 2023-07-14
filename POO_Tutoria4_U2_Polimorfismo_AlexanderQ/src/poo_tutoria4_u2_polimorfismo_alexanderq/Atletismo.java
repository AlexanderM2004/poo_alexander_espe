package poo_tutoria4_u2_polimorfismo_alexanderq;

/**
 * @author PERSONAL
 */

public class Atletismo extends Deportista {

    private String prueba;
    
    public Atletismo(String nombre, int edad, String disciplina, String sexo, String prueba) {
        super(nombre, edad, disciplina, sexo);
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public void entrenamiento() {
        System.out.println(" El atletiamo es un deporte que requiere de mucha resistencia");
    }
    
    public void mostrardatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Disciplina: "+getDisciplina());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Prueba: "+getPrueba());
        System.out.println(" ");
    }
}
