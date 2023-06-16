package poo_lab3_practica8_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Triangulo extends Figura{
        // TODO Auto-generated constructor stub
        float base;
        float altura;
        float ladoA;
        float ladoB;

    public void Triangulo(float lado, float altura, float ladoA, float ladoB){
        this.altura = altura;
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
     
    public float calcularArea(float base, float altura) {
        area = (base * altura)/2;
        return area;
    }
    
    public float calcularPerimetro(float lado, float ladoA, float ladoB){
        perimetro = lado + ladoA + ladoB;
        return perimetro;
    }
}
