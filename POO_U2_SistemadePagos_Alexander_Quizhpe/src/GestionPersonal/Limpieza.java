package GestionPersonal;

public class Limpieza extends Personal{

	//Declaracion de varibles
	protected float sueldo;
	protected String Area;
	
	//Creacion del constructor para la clase hija Tecnico, ademas incluye variables de la clase padre Personal
	//ya que hereda datos de esta ultima clase
	public Limpieza(String nombre, int edad, long ci, int añostraba, int hijos, float sueldo, String Area) {
		super(nombre, edad, ci, añostraba, hijos);
		this.Area = Area;
		this.sueldo = sueldo;
	}

	//Creacion de metodos set y get para las varibles de esta clase hija
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	
	//Metodos de la clase padre que permite calcular la comision dependiendo de los años de trabajo
	@Override
	public float PagoComisionAños(int añostraba, boolean marc) {
		float bono = 0;
		float sueldofin = 0;
		float fbono = 0;
		if(añostraba <5) {
			bono = (float) (sueldo * 0.15);
			sueldofin = bono + sueldo;
		}if((añostraba >=5)&&(añostraba<=10)) {
			bono = (float) (sueldo * 0.25);
			sueldofin = bono + sueldo;
		}if(añostraba >10) {
			bono = (float) (sueldo * 0.35);
			sueldofin = bono + sueldo;
		}
		
		if(marc) {
			sueldofin= sueldofin + 200;
			System.out.println("Felicidades por estar estudiando, nunca te rindas");
			System.out.println("Obtuvite una bonificacion de 200$");
			fbono = bono + 200;
		}
		
		System.out.println("Salario: "+sueldo);
		System.out.println("Bono estudiantil: "+fbono);
		System.out.println("Bono a recibir: "+bono);
		System.out.println("Sueldo total a recibir: "+sueldofin);
		return sueldofin;
	}

	//Metodos de la clase padre que permite calcular la comision dependiendo de los hijos
	@Override
	public float PagoComisionHijos(int hijos, boolean marc) {
		float bono = 0;
		float sueldofin = 0;
		float fbono = 0;
		if(hijos < 2) {
			bono = (float) (sueldo * 0.05);
			sueldofin = bono + sueldo;
		}if((hijos >=2)&&(hijos<=4)) {
			bono = (float) (sueldo * 0.15);
			sueldofin = bono + sueldo;
		}if(hijos > 4) {
			bono = (float) (sueldo * 0.25);
			sueldofin = bono + sueldo;
		}
		
		if(marc) {
			sueldofin= sueldofin + 200;
			System.out.println("Felicidades por estar estudiando, nunca te rindas");
			System.out.println("Obtuvite una bonificacion de 200$");
			fbono = bono + 200;
		}
		
		System.out.println("Salario: "+sueldo);
		System.out.println("Bono estudiantil: "+fbono);
		System.out.println("Bono a recibir: "+bono);
		System.out.println("Sueldo total a recibir: "+sueldofin);
		return sueldofin;
	}
}
