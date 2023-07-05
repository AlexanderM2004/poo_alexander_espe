package poo_correcion.persona._control1_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Trabajador extends Persona{
    public String Area;
    public int añosexpe;
    float sueldo;

    public Trabajador(long CI, String nombre, int edad, String Area, int añosexpe, float sueldo){
        this.CI = CI;
        this.nombre = nombre;
        this.edad = edad;
        this.Area = Area;
        this.añosexpe = añosexpe;
        this.sueldo = sueldo;
    }
    
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getAñosexpe() {
        return añosexpe;
    }

    public void setAñosexpe(int añosexpe) {
        this.añosexpe = añosexpe;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
