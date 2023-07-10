package poo_practica16_u2_polimorfismo_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public abstract class Figura {
    private String color;

    public Figura(String color) {
        super();
        this.color = color;
    }
    
    public abstract double superficie();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
