package poo_practica19_u2_mvc_alexanderq;

import Modelo.Modelo;
import Vista.Vista;
import Controlador.Control;

/**
 * @author Alexander Quizhpe
 */

public class POO_Practica19_U2_MVC_AlexanderQ {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Control controlador = new Control(vista, modelo);
        
        vista.setVisible(true);
        
    }
    
}
