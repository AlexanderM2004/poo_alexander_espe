package evaluacion_u1_erick_gomez;

/**
 *
 * @author erick
 */
public class Profesor {
    //cédula, nombre, dirección, teléfono, celular
    private long cedula;
    private String name;
    private String direction;
    private long phone;
    private long cellphone;
    
    public Profesor(String name, String direction, long cedula, long phone, long cellphone){
        this.cedula = cedula;
        this.name = name;
        this.phone = phone;
        this.cellphone = cellphone;
        this.direction = direction;
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
}
