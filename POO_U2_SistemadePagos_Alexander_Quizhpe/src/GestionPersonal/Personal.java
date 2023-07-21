package GestionPersonal;

public abstract class Personal {

	//Declaracion de variables
	protected String nombre;
	protected int edad;
	protected long ci;
	protected int añostraba;
	protected int hijos;
	
	//Creacion del constructor con metodo super para la clase padre Personal
	public Personal(String nombre, int edad, long ci, int añostraba, int hijos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
		this.añostraba = añostraba;
		this.edad = edad;
	}
	
	//Metodo abstracto que calcular la comision dependiendo de los años de trabajo
	public abstract float PagoComisionAños(int añostraba, boolean marc);

	//Metodo abstracto que calcular la comision dependiendo de los hijos
	public abstract float PagoComisionHijos(int hijos, boolean marc);
	
	//Creacion de metodos set y get para las varibles de esta clase hija
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getCi() {
		return ci;
	}

	public void setCi(long ci) {
		this.ci = ci;
	}

	public int getAñostraba() {
		return añostraba;
	}

	public void setAñostraba(int añostraba) {
		this.añostraba = añostraba;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
}
