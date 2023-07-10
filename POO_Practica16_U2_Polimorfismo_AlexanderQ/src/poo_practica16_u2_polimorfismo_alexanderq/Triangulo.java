package poo_practica16_u2_polimorfismo_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Triangulo extends Figura{
    
    private int base;
    private int alt;

    public Triangulo(int base, int alt, String color) {
        super(color);
        this.base = base;
        this.alt = alt;
    }
    
    @Override
    public double superficie() {
        return (base*alt)/2;
    }
    
}
