package Herencia;

public class HerenciaP {

	public HerenciaP() {
		// TODO Auto-generated constructor stub
		float ladoA;
		float ladoB;
	}

	public float areaR(float ladoA, float ladoB){
		float areaR;
		areaR = ladoA*ladoB;
        return areaR;
    }
	
	public float perimetroR(float ladoA, float ladoB){
		float periR;
		periR = ladoA+ladoA+ladoB+ladoB;
        return periR;
    }
}
