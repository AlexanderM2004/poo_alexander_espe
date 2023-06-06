/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_u1_erick_gomez;

/**
 *
 * @author erick
 */
public class Materia {
    public String name;
    private int idProfesor;
    
    public Materia(String name, int idProfe){
        this.name = name;
        this.idProfesor = idProfe;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    
}
