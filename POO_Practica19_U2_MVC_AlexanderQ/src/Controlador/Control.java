package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author Alexander Quizhpe
 */

public class Control implements ActionListener{
    private Vista vista;
    private Modelo modelo;

    public Control(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.Sumar.addActionListener(this);
        this.vista.Dividir.addActionListener(this);
        this.vista.Multiplicacion.addActionListener(this);
        this.vista.Resta.addActionListener(this);
    }
    
    public void iniciar_vista(){
        vista.setTitle("Prueba MVC");
        vista.setLocationRelativeTo(null);
        vista.txt1.setText(String.valueOf(modelo.getV1()));
        vista.txt2.setText(String.valueOf(modelo.getV2()));
        vista.txt3.setText(String.valueOf(modelo.getTotal()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int v1 = Integer.parseInt(vista.txt1.getText());
        int v2 = Integer.parseInt(vista.txt2.getText());
        modelo.setV1(v1);
        modelo.setV2(v2);
        
        if(e.getSource()==vista.Sumar){
            modelo.Sumar();
        }if(e.getSource()==vista.Resta){
            modelo.Restar();
        }if(e.getSource()==vista.Multiplicacion){
            modelo.Multiplicar();
        }if(e.getSource()==vista.Dividir){
            modelo.Dividir();
        }
        
        vista.txt3.setText(String.valueOf(modelo.getTotal()));
    }
}
