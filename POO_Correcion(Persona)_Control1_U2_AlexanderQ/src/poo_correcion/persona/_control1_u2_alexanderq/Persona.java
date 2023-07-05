package poo_correcion.persona._control1_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Persona {
    long CI;
    String nombre;
    public int edad;
    
    public void Persona(long CI, String nombre, int edad){
        this.CI = CI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public long getCI() {
        return CI;
    }

    public void setCI(long CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
