package Interfaz_Practica14_U2;

public class Rectangulo implements Figura, Dibujar {

	double ladoA, ladoB;
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Dibujar() {
		System.out.println("Dos lados iguales y dos distintos");
		
	}
	@Override
	public double calcuArea() {
		double retu = ladoA*ladoB;
		return retu;
	}

}
