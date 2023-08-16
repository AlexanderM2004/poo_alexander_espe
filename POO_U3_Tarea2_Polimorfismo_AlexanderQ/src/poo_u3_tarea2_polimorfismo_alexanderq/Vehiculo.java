package poo_u3_tarea2_polimorfismo_alexanderq;

/**
 *
 * @author Alexander Quizhpe
 */

public class Vehiculo {
    //Declaracion de variables
    protected String matri;
    protected String marca;
    protected String modelo;
    public int cantllant;

    //Construcctor de la clase padre
    public Vehiculo(String matri, String marca, String modelo, int cantllant) {
        this.matri = matri;
        this.marca = marca;
        this.modelo = modelo;
        this.cantllant = cantllant;
    }

    //Metodo que permitira mostrar los datos ingresados en los arrglos declarados en el codigo main
    public String mostrarDatos(){
        return "Matricula: " + matri+"\n Marca: "+marca+"\n Modelo: " + modelo + "\n Cantidad de llantas: "+cantllant;
        
    }
    
    //Creacion de metodos get y set para todas las variables de la clase padre
    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantllant() {
        return cantllant;
    }

    public void setCantllant(int cantllant) {
        this.cantllant = cantllant;
    }  
}
