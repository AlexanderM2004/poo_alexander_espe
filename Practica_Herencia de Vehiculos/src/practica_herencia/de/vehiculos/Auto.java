package practica_herencia.de.vehiculos;

/**
 * @author Personal
 */
public class Auto extends Vehiculo{
    String transmision;
    boolean parabrisasON;
    int multas;
    
    public void Auto(String numPlaca, String marca, int numRuedas, String transmision, int multas){
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.estado = estado;
        this.multas = multas;
        this.numRuedas = numRuedas;
        this.transmision = transmision;
    }
    
    public void OnOffparabrisas(){
        if(this.parabrisasON){
            this.parabrisasON = true;
            System.out.println("Se apago el parabrisas");
        }else{
            this.parabrisasON = false;
            System.out.println("Se encendio el parabrisas");
        }
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }
    
    public void addMulta(){
        this.multas++;
    } 
}
