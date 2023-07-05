package Interfaz_Practica14_U2;

public class Cuadrado implements Figura, Dibujar {

	double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcuArea(){
		double result = lado * lado;
		return result;
	}

	@Override
	public void Dibujar() {
		System.out.println("Lado iguales");
	}
	
}
