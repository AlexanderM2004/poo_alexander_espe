package poo_lab3_practica8_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Rectangulo extends Figura {
    
    // TODO Auto-generated constructor stub
    float ladoA;
    float ladoB;

    public void Rectangulo(float ladoA, float ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    public float calcularArea(float ladoA, float ladoB) {
        area = ladoA * ladoB;
        return area;
    }
    
    public float calcularPerimetro(float ladoA, float ladoB){
        perimetro = ladoA+ladoA+ladoB+ladoB;
        return perimetro;
    }
}
