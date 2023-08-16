package poo_u3_tarea2_polimorfismo_alexanderq;

/**
 *
 * @author Alexander Quizhpe
 */

public class Camion extends Vehiculo{
    //Declaracion de variables
    private int pesomax;

    //Construcctor de la clase padre y de la clase hija
    public Camion(String matri, String marca, String modelo, int cantllant, int pesomax) {
        super(matri, marca, modelo, cantllant);
        this.pesomax = pesomax;
    }

    //Creacion de metodos get y set para todas las variables de la clase hija
    public int getPesomax() {
        return pesomax;
    }

    public void setPesomax(int pesomax) {
        this.pesomax = pesomax;
    }
    
    //Sobreescritura del metodo definido en la clase padre, y de esa forma poder modificarla para adiccinarle elementos caraceristicso de esa clase hija
    @Override
    public String mostrarDatos(){
        return "Matricula: " + matri+"\n Marca: "+marca+"\n Modelo: " + modelo + "\n Cantidad de llantas: "+cantllant+"\n Carga Maxima: " + pesomax;
    }
    
}
