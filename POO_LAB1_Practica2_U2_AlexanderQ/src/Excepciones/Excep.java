package Excepciones;

import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*; //Importa todas las librerias del tipo java

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String nombre = br.readLine();
			int div = 8/2;
		}catch(IOException  e) {
			e.printStackTrace();
		}catch(ArithmeticException es) {
			System.out.println("No se puede dividir para 0");
		}
	}

}
