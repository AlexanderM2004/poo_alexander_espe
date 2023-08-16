package poo_u3_tarea2_polimorfismo_alexanderq;

/**
 *
 * @author Alexander Quizhpe
 */

public class Automovil extends Vehiculo{
    //Declaracion de variables
    private int cantAsient;

    //Construcctor de la clase padre y de la clase hija
    public Automovil(String matri, String marca, String modelo, int cantllant, int cantAsient) {
        super(matri, marca, modelo, cantllant);
        this.cantAsient = cantAsient;
    }

    //Creacion de metodos get y set para todas las variables de la clase hija
    public int getCantAsient() {
        return cantAsient;
    }

    public void setCantAsient(int cantAsient) {
        this.cantAsient = cantAsient;
    }
    
    //Sobreescritura del metodo definido en la clase padre, y de esa forma poder modificarla para adiccinarle elementos caraceristicso de esa clase hija
    @Override
    public String mostrarDatos(){
        return "Matricula: " + matri+"\n Marca: "+marca+"\n Modelo: " + modelo + "\n Cantidad de llantas: "+cantllant+"\n Asientos: " + cantAsient;
    }
}
