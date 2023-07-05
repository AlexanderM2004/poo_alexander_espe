package Interfaz_Practica14_U2;

import java.util.*;

public class Interfaz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcl = new Scanner(System.in);
		Circulo circ = new Circulo(0);
		Cuadrado cua = new Cuadrado(0);
		Rectangulo rect = new Rectangulo();
		int opc;
		
		System.out.println("Calcular Areas de Figuras");
		System.out.println("1: Circulo");
		System.out.println("2: Cuadrado");
		System.out.println("3: Rectangulo");
		opc = tcl.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("Circulo");
			System.out.print("Ingrese radio del circulo: ");
			circ.r = tcl.nextDouble();
			System.out.println("Area: "+circ.calcuArea());
			circ.Dibujar();
			break;
		case 2:
			System.out.println("Cuadrado");
			System.out.print("Ingrese lado del cuadrado: ");
			cua.lado = tcl.nextDouble();
			System.out.println("Area: "+cua.calcuArea());
			cua.Dibujar();
			break;
		case 3:
			System.out.println("Rectangulo");
			System.out.print("Ingrese ladoA del Rectangulo: ");
			rect.ladoA = tcl.nextDouble();
			System.out.print("Ingrese ladoB del Rectangulo: ");
			rect.ladoB = tcl.nextDouble();
			System.out.println("Area: "+rect.calcuArea());
			rect.Dibujar();
			break;
		}
	}

}
