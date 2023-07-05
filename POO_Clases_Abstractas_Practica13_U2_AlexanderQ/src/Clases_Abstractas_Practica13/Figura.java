package Clases_Abstractas_Practica13;

public abstract class Figura {

	double x;
	double y;
	
	public Figura() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcuArea();

}
