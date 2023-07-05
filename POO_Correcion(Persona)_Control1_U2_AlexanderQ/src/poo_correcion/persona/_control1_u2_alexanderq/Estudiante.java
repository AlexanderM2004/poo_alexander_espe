package poo_correcion.persona._control1_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Estudiante extends Persona{
    public String carrera;
    public String instituto;
    
    public Estudiante(long CI, String nombre, int edad, String carrera, String instituto) {
        this.CI = CI;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.instituto = instituto;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }
}
