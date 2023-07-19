package poo_gestion.horarios_practica9_u2_alexanderq;
/**
 * @author Alexander Quizhpe
 */
public abstract class Laboratorio {
	//Declaracion de variables
    String nomb;
    int capa;
    String equi;

    //Constructor de la clase padre(Laboratorio)
    public Laboratorio(String nomb, int capa, String equi) {
        this.nomb = nomb;
        this.capa = capa;
        this.equi = equi;
    }

    //Metodo Abstarcto que sera pasado a las otras clases relacionadas, el cual tiene como funcion 
    //el gestionar las hora de los laboratorio, tanto disponibles como ocupados  
    public abstract void Horarios(boolean marc);

    //Metodos Set y get de las variables anteriormente definidas
    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }

    public String getEqui() {
        return equi;
    }

    public void setEqui(String equi) {
        this.equi = equi;
    }
}
