package Practica14;

import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // OBJETO PARA PEDIR y leer  EL DATO POR CONSOLA
        // asociado a System. in al teclado
        Scanner sc=new Scanner (System. in) ;
        // VARIABLE String donde s eva guardar la cadena a crear
		String cad;
		  // Creamos el objeto StringBuilder
		  //llamaos una variables aux done guardamos la cadena invertida
		  // la asociamos a una cadena vacia ""
		  
		StringBuilder aux=new StringBuilder ("");
		// le pediomos al usario que introdusca cadena
		System.out.println("Introduce una cadena");
		//la vamos a guardar en la variable cad llamaos al objeto nexline
		cad=sc.nextLine();
		// hay que recorrerla en orden inverso desde la ultima posicion a la1ra
		//usmaosmun for iniciamos desde el ultimo usamos length
		//sacamos cararcter por caracter s eañada a StringBuilder
		//entramos a for se va decrementando
		for (int i=cad.length()-1;i>-0;i--){
			// sacamos caracter a caracter con el metodo charAt
			// nos lo pone en el aux
			aux.append(cad.charAt(i));
		}
		// para mostrar metodo toString de StringBuilder
		// nos devuelve la cadena ivertida
		System.out.println(aux. toString() );
    }
}
