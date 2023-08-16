package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author Alexander Quizhpe
 */

public class Registro extends JFrame{
    
    //Creacion del panel
    public JPanel panel;
    
    //Creamos una ventana grafica con JFrame
    public Registro (){
       this.setSize(500,500); 
       setTitle("Registro"); //Comando que permitecolocar nombre a la ventana
       
       //Comando que permite finalizar todo el programa en el momento que se cierra la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       //Comando para centrar la ventana del monitor
       //setBounds(550,200,500,500); //Forma manual
       setLocationRelativeTo(null); //Forma automatica
       /*
       Las dos formas funcionan pero la diferencia radica, en el que una es de forma automatica y la otra
       es de forma manual
       */
       
       iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
        ColocarCajatexto();
        colocarAreaTexto();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Comando para aplicar color al panel
        panel.setBackground(Color.gray);
        //Poner el panel sobre la ventana del registro
        this.getContentPane().add(panel);
    }
    
    //Creacion de etiquetas
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Registrar",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(65, 10, 350, 50);
        label.setForeground(Color.white);
        label.setBackground(Color.black);
        label.setOpaque(true);
        
        JLabel label1 = new JLabel();
        label1.setText("Nombre: Alexander Quizhpe");
        
        panel.add(label1);
        //Comando para ubicar el label
        label1.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setBounds(65, 80, 350, 50);
        
        //Comando para colocar imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("registro.png");//La imagen se encuetra en la misma carpeta del proyecto
        labelimagen.setBounds(30, 120, 50, 50);
        panel.add(labelimagen);
        //Modificar imagen
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    //Metodo para crear botones
    public void ColocarBotones(){
        JButton boton1 = new JButton("Click");
        boton1.setBounds(30, 310, 100, 50);
        panel.add(boton1);
        boton1.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        boton1.setMnemonic('a');//Sirve para que se active el boton con el teclado
        //Da border a los botones
        boton1.setBorder(BorderFactory.createLineBorder(Color.CYAN,5,true));
        
        //Boton con imagen
        JButton boton2 = new JButton("Imagen");
        ImageIcon imagen1 = new ImageIcon("imagen1.jpg");//La imagen se encuetra en la misma carpeta del proyecto
        boton2.setBounds(150, 310, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        boton2.setMnemonic('b');//Sirve para que se active el boton con el teclado
        boton2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    //Comando para colocar cajas de texto
    public void ColocarCajatexto(){
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(65, 200, 350, 50);
        panel.add(cajaTexto1);
        cajaTexto1.setText("POO");
        System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    }
    
    public void colocarAreaTexto(){
        JTextArea textarea1 = new JTextArea();
        textarea1.setBounds(65, 380, 350, 90);
        panel.add(textarea1);
        textarea1.setText("Calulo");
        textarea1.append("\n Escribir aqui ...");
        
        //comandos para crear Scroll en una area de texto
        JScrollPane barra = new JScrollPane(textarea1);
        //Scroll vertical
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        //Scroll horizotal
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(65, 380, 350, 50);
        panel.add(barra);
    }
}

