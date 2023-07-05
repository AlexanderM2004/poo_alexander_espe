package practica_herencia.de.vehiculos;

/**
 *
 * @author Personal
 */
public class Vehiculo {
    String numPlaca;
    public String marca;
    public int numRuedas;
    int estado;
    
    public void Vehiculo(String numPlaca, String marca, int numRuedas){
        this.numPlaca = numPlaca;
        this.estado = estado;
        this.marca = marca;
        this.numRuedas = numRuedas;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
