package Clases_Abstractas_Practica13;

public class Circulo extends Figura{
	double r;
	
	public Circulo(double r, double x, double y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.r = r;
	}
	
	@Override
	public double calcuArea() {
		double pi = 3.1416;
		double resul = pi *r*r;
		return resul;
	}

}
