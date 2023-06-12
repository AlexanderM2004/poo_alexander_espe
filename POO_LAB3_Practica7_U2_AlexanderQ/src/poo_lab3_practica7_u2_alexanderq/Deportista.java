package poo_lab3_practica7_u2_alexanderq;

/**
 *
 * @author Alexander Quizhpe
 */
public class Deportista extends Persona{
    String Deporte;
    
    public Deportista(String nombre){
        super(nombre);
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
