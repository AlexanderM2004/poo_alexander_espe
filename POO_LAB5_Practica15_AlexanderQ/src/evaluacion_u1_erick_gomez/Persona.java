package evaluacion_u1_erick_gomez;

/**
 *
 * @author erick
 */
public class Persona {
    //cédula, nombre, dirección, teléfono, celular
    private long cedula;
    private String name;
    private String direction;
    private long phone;
    private long cellphone;
    private int gener; //genero, 0 = masculino, 1 = femenino, 2 = por si alguien se identifica como helicoptero apache
    
    public Persona (String name, String direction, long cedula, long phone, long cellphone, int gener){
        this.cedula = cedula;
        this.name = name;
        this.phone = phone;
        this.cellphone = cellphone;
        this.direction = direction;
        this.gener = gener;
    }

    public void setGener(int gener) {
        this.gener = gener;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCellphone(long cellphone) {
        this.cellphone = cellphone;
    }

    public long getCedula() {
        return cedula;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public long getPhone() {
        return phone;
    }

    public long getCellphone() {
        return cellphone;
    }

    public int getGener() {
        return gener;
    }
    
}
