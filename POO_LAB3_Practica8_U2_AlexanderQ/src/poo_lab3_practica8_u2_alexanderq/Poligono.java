package poo_lab3_practica8_u2_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.lang.Math;

public class Poligono extends Figura{
    float apotema;
    float lado;
    
    public void Triangulo(float lado){
        this.lado = lado;
    }
     
    public float calcularArea(float lado) {
        //Sirve para calcular el apotema
        float angulo = 365/(2*5); // Ángulo en grados
        float radianes = (float) Math.toRadians(angulo); // Convertir a radianes
        float tangente = (float) Math.tan(radianes); // Calcular la tangente
        apotema = lado/(2*tangente);
        area = ((lado*5)*apotema)/2;
        return area;
    }
    
    public float calcularPerimetro(float lado){
        perimetro = lado *5;
        return perimetro;
    }
}
