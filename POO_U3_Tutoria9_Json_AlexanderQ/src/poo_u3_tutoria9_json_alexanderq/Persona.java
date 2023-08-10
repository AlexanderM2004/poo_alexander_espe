package poo_u3_tutoria9_json_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona {
    private int codigo;
    private String Nombre;
    private long Cedula;
    private String Celular;
    private String Correo;

    // Constructor con anotación @JsonCreator
    @JsonCreator
    public Persona(@JsonProperty("codigo") int codigo,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("cedula") long cedula,
                   @JsonProperty("celular") String celular,
                   @JsonProperty("correo") String correo) {
        this.codigo = codigo;
        this.Nombre = nombre;
        this.Cedula = cedula;
        this.Celular = celular;
        this.Correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long Cedula) {
        this.Cedula = Cedula;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
     @Override
    public String toString() {
        return "(" +
                "codigo=" + codigo +
                ", nombre='" + Nombre + '\'' +
                ", cedula=" + Cedula +
                ", celular='" + Celular + '\'' +
                ", correo='" + Correo + '\'' +
                ')';
    }
}
