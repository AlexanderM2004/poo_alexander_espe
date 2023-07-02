package poo_gestion.horarios_practica9_u2_alexanderq;
/**
 * @author Alexander Quizhpe
 */
public class Laboratorio {
    String nomb;
    int capa;
    String equi;
    String resplab;

    public Laboratorio(String nomb, int capa, String equi, String resplab) {
        this.nomb = nomb;
        this.capa = capa;
        this.equi = equi;
        this.resplab = resplab;
    }

    public void Horario() {
         
    }

    public String getResplab() {
        return resplab;
    }

    public void setResplab(String resplab) {
        this.resplab = resplab;
    }

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
