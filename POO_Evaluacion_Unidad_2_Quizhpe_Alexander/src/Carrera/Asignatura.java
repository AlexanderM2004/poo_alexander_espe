package Carrera;

/**
 * @author Alexander Quizhpe
 */

public class Asignatura {
	//Declaracion de variables
    String asigna;
    String horario;
    String doc;

    //Costructor de la clase Asignatura
    public Asignatura(String asigna, String horario,String doc) {
        this.asigna = asigna;
        this.horario = horario;
        this.doc = doc;
    }

  //Creacion de metodos get y Set para las variables anteriormente definidas
	public String getAsigna() {
		return asigna;
	}

	public void setAsigna(String asigna) {
		this.asigna = asigna;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}
}
