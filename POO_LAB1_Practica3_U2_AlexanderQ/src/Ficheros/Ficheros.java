package Ficheros;

import java.io.*;

public class Ficheros {
	public static void main(String[] args)throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileReader("C:\\Users\\ESPE\\Documents\\AlexQ\\FicheroAlex.txt")));
		String linea;
		try {
			while((linea = br.readLine())!=null);
			System.out.println(linea);
		}catch(IOException e){
			
		}
	}
}
