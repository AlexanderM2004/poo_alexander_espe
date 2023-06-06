package evaluacion_u1_erick_gomez;

/**
 *
 * @author erick
 */
public class Estudiante {
    private String name; //nombre
    private long cedula; //cedula
    private int gener; //genero, 0 = masculino, 1 = femenino, 2 = por si alguien se identifica como helicoptero
    
    public Estudiante(String name, long cedula, int gener){
        this.name = name;
        this.cedula = cedula;
        this.gener = gener;
    }

    public String getName() {
        return name;
    }

    public long getCedula() {
        return cedula;
    }

    public int getGener() {
        return gener;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setGener(int gener) {
        this.gener = gener;
    }
    
    
}
