package poo_practica17_u2_jerarquiaempleados_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public abstract class Empleado {
    String nomb;
    public int edad;
    public int fechaingre;
    double salario;
    double bono = 200;

    public Empleado(String nomb, int edad, int fechaingre, double salario, double bono) {
        super();
        this.nomb = nomb;
        this.edad = edad;
        this.fechaingre = fechaingre;
        this.salario = salario;
        this.bono = bono;
    }
    
    public abstract void incentivar();

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFechaingre() {
        return fechaingre;
    }

    public void setFechaingre(int fechaingre) {
        this.fechaingre = fechaingre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
