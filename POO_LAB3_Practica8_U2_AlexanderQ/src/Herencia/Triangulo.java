package Herencia;

public class Triangulo{

	public Triangulo() {
		// TODO Auto-generated constructor stub
		float base;
		float altura;
		float ladoA;
		float ladoB;
	}

	public float areaT(float ladoA, float ladoB){
		float areaT;
		areaT = ladoA*ladoB;
        return areaT;
    }
	
	public float perimetroT(float ladoA, float ladoB){
		float periT;
		periT = ladoA+ladoA+ladoB+ladoB;
        return periT;
    }
}
