package practica_herencia.de.vehiculos;
/**
 *
 * @author Personal
 */
public class Camion extends Vehiculo{
    boolean parabrisasOn;
    public String color;
    double carga;
    
    public void Auto(String numPlaca, String marca, int numRuedas, String color, double carga){
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.estado = estado;
        this.numRuedas = numRuedas;
        this.carga = carga;
        this.color = color;
    }
    
    public void OnOffParabrisas(){
        if(this.parabrisasOn){
            this.parabrisasOn = true;
            System.out.println("Se apago el parabrisas");
        }else{
            this.parabrisasOn = false;
            System.out.println("Se encendio el parabrisas");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
}
