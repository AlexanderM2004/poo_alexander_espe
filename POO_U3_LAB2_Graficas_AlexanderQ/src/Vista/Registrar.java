package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Alexander Quizhpe
 */
public class Registrar extends JFrame{
     //Creacion del panel
    public JPanel panel;
    
    //Creamos una ventana grafica con JFrame
    public Registrar (){
       this.setSize(400,400); 
       setTitle("Registrar Usuario"); //Comando que permitecolocar nombre a la ventana
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
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Comando para aplicar color al panel
        panel.setBackground(Color.white);
        //Poner el panel sobre la ventana del registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Registrar",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(140, 20, 100, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.BLACK);
        
        JLabel label1 = new JLabel();
        label1.setText("Usser: ");
        panel.add(label1);
        //Comando para ubicar el label
        label1.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setBounds(35, 220, 80, 15);
        
        JLabel label2 = new JLabel();
        label2.setText("Password: ");
        panel.add(label2);
        //Comando para ubicar el label
        label2.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(35, 260, 80, 15);
        
        //Comando para colocar imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("usser.png");//La imagen se encuetra en la misma carpeta del proyecto
        labelimagen.setBounds(135, 70, 130, 130);
        panel.add(labelimagen);
        //Modificar imagen
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    //Comando para colocar cajas de texto
    public void ColocarCajatexto(){
        
        JTextField txt_Usser = new JTextField();
        txt_Usser.setBounds(120, 217, 200, 20);
        panel.add(txt_Usser);
        
        JPasswordField txt_Pass = new JPasswordField();
        txt_Pass.setBounds(120, 257, 200, 20);
        panel.add(txt_Pass);
        
    }
    
     public void ColocarBotones(){
        JButton Iniciar = new JButton("Registrar");
        Iniciar.setBounds(125, 300, 150, 30);
        panel.add(Iniciar);
        Iniciar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
    }
}
