package Interfaz_Practica14_U2;

public class Circulo implements Figura, Dibujar, Rotar {

	double r;
	
	public Circulo(double r) {
		this.r = r;
	}
	
	@Override
	public double calcuArea() {
		double pi = 3.1416;
		double resul = pi *r*r;
		return resul;
	}

	@Override
	public void Dibujar() {
		System.out.println("Vamos a Dibujar");
		
	}

	@Override
	public void Rotar() {
		System.out.println("Usted va a rodar");
		
	}

	
}
