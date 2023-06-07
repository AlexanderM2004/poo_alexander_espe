package TRYCATCH;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume[]=new int[5];
		
		try {
			nume[7] = 0;		
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Se genero un excepcion al momento de abrir al arreglo");
		}catch(Exception e){
			System.out.println("A ocurrido un error");
		}
	}
}
