package Notas;

import java.util.ArrayList;

public class GestionNot {
	ArrayList<Double> notas;
	
	public GestionNot() {
		notas = new ArrayList<>();
	}
	
	public void guardarNot(double n) {
		notas.add(n);
	}
	
	public double media() {
		double media =0;
		for(double d:notas) {
			media+=d;
		}
		return media/notas.size();
	}
	
	public int aprobados() {
		int op = 0;
		for(double d:notas) {
			if(d>=14) {
				op ++;
			}
		}
		return op;
	}
}
