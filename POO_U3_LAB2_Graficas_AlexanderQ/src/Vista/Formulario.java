package Vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author Alexander Quizhpe
 */

public class Formulario extends JFrame{
    public JPanel panel;
    
    //Creamos una ventana grafica con JFrame
    public Formulario (){
       this.setSize(1000,500); 
       setTitle("Registro Estudiante"); //Comando que permitecolocar nombre a la ventana
       //Comando que permite finalizar todo el programa en el momento que se cierra la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       //Comando para centrar la ventana del monitor
       setLocationRelativeTo(null);
       iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
        ColocarCajatexto();
        ColocarComboBox();
        RadioButton();
        ColocarTabla();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Comando para aplicar color al panel
        panel.setBackground(Color.gray);
        //Poner el panel sobre la ventana del registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Registrar Estudiantes",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(325, 10, 350, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.white);
        
        JLabel label1 = new JLabel();
        label1.setText("Codigo: ");
        panel.add(label1);
        //Comando para ubicar el label
        label1.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setBounds(40, 40, 70, 15);
        
        JLabel label2 = new JLabel();
        label2.setText("Cedula: ");
        panel.add(label2);
        //Comando para ubicar el label
        label2.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(40, 80, 70, 15);
        
        JLabel label3 = new JLabel();
        label3.setText("Apellido: ");
        panel.add(label3);
        //Comando para ubicar el label
        label3.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(40, 120, 70, 15);
        
        JLabel label4 = new JLabel();
        label4.setText("Nombre: ");
        panel.add(label4);
        //Comando para ubicar el label
        label4.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(40, 160, 70, 15);
        
        JLabel label5 = new JLabel();
        label5.setText("Mail: ");
        panel.add(label5);
        //Comando para ubicar el label
        label5.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(40, 200, 70, 15);
        
        JLabel label6 = new JLabel();
        label6.setText("Telefono: ");
        panel.add(label6);
        //Comando para ubicar el label
        label6.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(40, 240, 70, 15);
        
        JLabel label7 = new JLabel();
        label7.setText("Direccion: ");
        panel.add(label7);
        //Comando para ubicar el label
        label7.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(40, 280, 70, 15);
        
        JLabel label8 = new JLabel();
        label8.setText("Materia: ");
        panel.add(label8);
        //Comando para ubicar el label
        label8.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label8.setFont(new Font("Arial", Font.PLAIN, 15));
        label8.setBounds(40, 320, 70, 15);
        
        JLabel label9 = new JLabel();
        label9.setText("Estado: ");
        panel.add(label9);
        //Comando para ubicar el label
        label9.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label9.setFont(new Font("Arial", Font.PLAIN, 15));
        label9.setBounds(40, 360, 70, 15);
    }
    
    //Comando para colocar cajas de texto
    public void ColocarCajatexto(){
        
        JTextField txt_Codigo = new JTextField();
        txt_Codigo.setBounds(120, 37, 300, 20);
        panel.add(txt_Codigo);
        
        JTextField txt_Cedula = new JTextField();
        txt_Cedula.setBounds(120, 77, 300, 20);
        panel.add(txt_Cedula);
        
        JTextField txt_Apellido = new JTextField();
        txt_Apellido.setBounds(120, 117, 300, 20);
        panel.add(txt_Apellido);
        
        JTextField txt_Nombre = new JTextField();
        txt_Nombre.setBounds(120, 157, 300, 20);
        panel.add(txt_Nombre);
        
        JTextField txt_Mail = new JTextField();
        txt_Mail.setBounds(120, 197, 300, 20);
        panel.add(txt_Mail);
        
        JTextField txt_Telefono = new JTextField();
        txt_Telefono.setBounds(120, 237, 300, 20);
        panel.add(txt_Telefono);
        
        JTextField txt_Direccion = new JTextField();
        txt_Direccion.setBounds(120, 277, 300, 20);
        panel.add(txt_Direccion);
    }
    
    public void ColocarComboBox(){
        JComboBox Cmb_Materia = new JComboBox();
        Cmb_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CALCULO", "POO", "COMPUTACION", "EDO", "FISICA" }));
        Cmb_Materia.setBounds(120,317,300,20);
        panel.add(Cmb_Materia);
    }
    
    public void RadioButton(){
        JRadioButton BT_Aprobado = new JRadioButton();
        BT_Aprobado.setText("Aprobado");
        BT_Aprobado.setBounds(120, 357, 145, 20);
        panel.add(BT_Aprobado);
        
        JRadioButton BT_Reprobado = new JRadioButton();
        BT_Reprobado.setText("Reprovado");
        BT_Reprobado.setBounds(275, 357, 145, 20);
        panel.add(BT_Reprobado);
    }
    
    public void ColocarTabla(){
        JTable Tabla_Estudiantes = new JTable();
        Tabla_Estudiantes.setBounds(450, 37, 500, 340);
        panel.add(Tabla_Estudiantes);
    }
    
    public void ColocarBotones(){
        JButton Nuevo = new JButton("Nuevo");
        Nuevo.setBounds(250, 397, 100, 30);
        panel.add(Nuevo);
        Nuevo.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Nuevo.setMnemonic('n');//Sirve para que se active el boton con el teclado Alt + n
        
        JButton Guardar = new JButton("Guardar");
        Guardar.setBounds(400, 397, 100, 30);
        panel.add(Guardar);
        Guardar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Guardar.setMnemonic('g');//Sirve para que se active el boton con el teclado Alt + g
        
        JButton Eliminar = new JButton("Eliminar");
        Eliminar.setBounds(550, 397, 100, 30);
        panel.add(Eliminar);
        Eliminar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Eliminar.setMnemonic('d');//Sirve para que se active el boton con el teclado Alt + d
        
        JButton Editar = new JButton("Editar");
        Editar.setBounds(700, 397, 100, 30);
        panel.add(Editar);
        Editar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Editar.setMnemonic('e');//Sirve para que se active el boton con el teclado Alt + e
    }
}
