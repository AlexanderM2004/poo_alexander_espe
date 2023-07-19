package Personal;
/**
 * @author Alexander Quizhpe  
 */
public class Personal {

	protected String nombre;
	public int edad;
	protected long CI;
	
	public Personal(String nombre, int edad, long CI) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.setCI(CI);
	}

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

	public long getCI() {
		return CI;
	}

	public void setCI(long cI) {
		CI = cI;
	}

}
