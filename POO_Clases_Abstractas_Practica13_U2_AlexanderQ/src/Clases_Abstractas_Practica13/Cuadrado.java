package Clases_Abstractas_Practica13;

public class Cuadrado extends Figura{
	double lado;
	
	public Cuadrado(double lado, double x, double y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.lado=lado;
	}
	
	@Override
	public double calcuArea() {
		double resul = lado * lado;
		return resul;
	}

}
