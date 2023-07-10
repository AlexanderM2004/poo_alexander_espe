package poo_practica16_u2_polimorfismo_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Circulo extends Figura {
    
    private int radio;
    
    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI*radio*radio;
    }
}
