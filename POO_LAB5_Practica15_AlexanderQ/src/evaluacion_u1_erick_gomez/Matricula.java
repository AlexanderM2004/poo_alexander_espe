/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_u1_erick_gomez;

/**
 *
 * @author erick
 */
public class Matricula {
    //private int idProfesor;
    private int idEstudiante;
    private int idMateria;
    
    public Matricula(int idEstudiante, int idMateria){
        this.idEstudiante = idEstudiante;
        this.idMateria = idMateria;
        //this.idProfesor = idProfe;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    
}
