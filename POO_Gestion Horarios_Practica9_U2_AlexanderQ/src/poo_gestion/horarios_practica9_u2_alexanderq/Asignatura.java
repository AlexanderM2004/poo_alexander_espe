package poo_gestion.horarios_practica9_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */
public class Asignatura {
    String asigna;
    String horario;
    String doc;

    public Asignatura(String asigna, String horario,String doc) {
        this.asigna = asigna;
        this.horario = horario;
        this.doc = doc;
    }

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
