package poo_practica16_u2_polimorfismo_alexanderq;

/**
 *
 * @author ESPE
 */
public class Cuadrado extends Figura{
    
    private int lado;

    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double superficie() {
        return lado*lado;
    }
    
}
