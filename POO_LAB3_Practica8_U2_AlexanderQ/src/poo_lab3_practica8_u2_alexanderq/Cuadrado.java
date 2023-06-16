package poo_lab3_practica8_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

public class Cuadrado extends Figura{
    // TODO Auto-generated constructor stub
    float lado;

    public void Cuadrado(float lado){
        this.lado = lado;
    }
     
    public float calcularArea(float lado) {
        area = lado * lado;
        return area;
    }
    
    public float calcularPerimetro(float lado){
        perimetro = lado*4;
        return perimetro;
    }
}
