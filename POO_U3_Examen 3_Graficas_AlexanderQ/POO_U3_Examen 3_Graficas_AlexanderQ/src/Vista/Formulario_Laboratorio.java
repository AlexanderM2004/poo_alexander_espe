package Vista;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexander Quizhpe
 */
public class Formulario_Laboratorio extends JInternalFrame{
    
    Conexion cc = new Conexion();
    Connection con = cc.Conectar();
    
    public JPanel panel;
    
    JTable Tabla_Laboratorio = new JTable();
    JTextField txt_Lab = new JTextField();
    JTextField txt_nombre = new JTextField();
    JTextField txt_Encarga = new JTextField();
    JTextField txt_Capacidad = new JTextField();
    JComboBox Cmb_Hora = new JComboBox();
    JComboBox Cmb_Bloque = new JComboBox();
    JButton Nuevo = new JButton("Nuevo");
    JButton Guardar = new JButton("Guardar");
    JButton Eliminar = new JButton("Eliminar");
    JButton Editar = new JButton("Editar");
    
    //Creamos una ventana grafica con JFrame
    public Formulario_Laboratorio(){
       this.setSize(1000,400); 
       setTitle("Registro Laboratorio"); //Comando que permitecolocar nombre a la ventana
       //Comando que permite finalizar todo el programa en el momento que se cierra la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       iniciarComponentes();
       mostrarDatos();
       ModelTableDefault();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
        ColocarCajatexto();
        ColocarComboBox();
        
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        
        Guardar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                GuardarActionPerformed(evt);
            }
        });
        
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        
        Editar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Comando para aplicar color al panel
        panel.setBackground(Color.gray);
        //Poner el panel sobre la ventana del registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Registrar Laboratorio",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(325, 10, 350, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.white);
        
        JLabel label1 = new JLabel();
        label1.setText("# Laboratorio: ");
        panel.add(label1);
        //Comando para ubicar el label
        label1.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setBounds(40, 40, 100, 15);
        
        JLabel label2 = new JLabel();
        label2.setText("Nombre de LAB: ");
        panel.add(label2);
        //Comando para ubicar el label
        label2.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(40, 80, 100, 15);
        
        JLabel label3 = new JLabel();
        label3.setText("Encargado: ");
        panel.add(label3);
        //Comando para ubicar el label
        label3.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(40, 120, 100, 15);
        
        JLabel label4 = new JLabel();
        label4.setText("Capacidad: ");
        panel.add(label4);
        //Comando para ubicar el label
        label4.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(40, 160, 100, 15);
        
        JLabel label5 = new JLabel();
        label5.setText("Bloque: ");
        panel.add(label5);
        //Comando para ubicar el label
        label5.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(40, 200, 100, 15);
    }
    
    //Comando para colocar cajas de texto
    public void ColocarCajatexto(){
        txt_Lab.setBounds(140, 37, 300, 20);
        panel.add(txt_Lab);
        
        txt_nombre.setBounds(140, 77, 300, 20);
        panel.add(txt_nombre);
        
        txt_Encarga.setBounds(140, 117, 300, 20);
        panel.add(txt_Encarga);
        
        txt_Capacidad.setBounds(140, 157, 300, 20);
        panel.add(txt_Capacidad);
    }
    
    public void ColocarComboBox(){
        Cmb_Bloque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloque A", "Bloque B"}));
        Cmb_Bloque.setBounds(140,197,300,20);
        panel.add(Cmb_Bloque);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==Cmb_Bloque) {
            String seleccionado=(String)Cmb_Bloque.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public void ColocarBotones(){
        Nuevo.setBounds(250, 300, 100, 30);
        panel.add(Nuevo);
        Nuevo.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Nuevo.setMnemonic('n');//Sirve para que se active el boton con el teclado Alt + n
        
        Guardar.setBounds(400, 300, 100, 30);
        panel.add(Guardar);
        Guardar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Guardar.setMnemonic('g');//Sirve para que se active el boton con el teclado Alt + g
        
        Eliminar.setBounds(550, 300, 100, 30);
        panel.add(Eliminar);
        Eliminar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Eliminar.setMnemonic('d');//Sirve para que se active el boton con el teclado Alt + d
        
        Editar.setBounds(700, 300, 100, 30);
        panel.add(Editar);
        Editar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Editar.setMnemonic('e');//Sirve para que se active el boton con el teclado Alt + e
    }
    
    //Conexion de registro
    public void ModelTableDefault (){
        Tabla_Laboratorio.setBounds(450, 37, 500, 250);
        String titulos[] = {"ID", "# Laboratorio", "Nombre", "Encargado", "Capacidad", "Bloque"};
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Tabla_Laboratorio.setModel(modelo);
        panel.add(Tabla_Laboratorio);
        mostrarDatos();
    }
    
    public void mostrarDatos(){
        String titulos[] = {"ID", "# Laboratorio", "Nombre", "Encargado", "Capacidad", "Bloque"};
        String registro[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM laboratorio";
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0] = rs.getString("lab_codigo");
                registro[1] = rs.getString("lab_num");
                registro[2] = rs.getString("lab_nombre");
                registro[3] = rs.getString("lab_encarg");
                registro[4] = rs.getString("lab_capa");
                registro[5] = rs.getString("lab_bloque");
                modelo.addRow(registro);
            }
            Tabla_Laboratorio.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos. "+e);
            System.out.println(e);
        }  
    }                        

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String SQL = "insert into laboratorio(lab_num, lab_nombre, lab_encarg, lab_capa, lab_bloque)values(?,?,?,?,?)";
        try {
            int select = Cmb_Bloque.getSelectedIndex();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txt_Lab.getText());
            pst.setString(2,txt_nombre.getText());
            pst.setString(3,txt_Encarga.getText());
            pst.setString(4,txt_Capacidad.getText());
            pst.setString(5, (String) Cmb_Bloque.getItemAt(select));
            pst.execute();
        } catch(Exception e){
            System.out.println(e);
        }
        
        mostrarDatos();
    }                                           

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        try {
            String SQL = "update laboratorio set lab_num =?, lab_nombre=?, lab_encarg=?, lab_capa=?, lab_bloque=? where lab_codigo = ?";
            int fila = Tabla_Laboratorio.getSelectedRow();
            int select = Cmb_Bloque.getSelectedIndex();
            String dao = (String) Tabla_Laboratorio.getValueAt(fila, 0);
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1, txt_Lab.getText());
            pst.setString(2, txt_nombre.getText());
            pst.setString(3, txt_Encarga.getText());
            pst.setString(4, txt_Capacidad.getText());
            pst.setString(5, (String) Cmb_Bloque.getItemAt(select)); 
            pst.setString(6, dao); 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
            mostrarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
        
        mostrarDatos();
    }                                          

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        try {
            int fila = Tabla_Laboratorio.getSelectedRow();
            System.out.println(Tabla_Laboratorio.getValueAt(fila, 0));
            String SQL = "delete from `laboratorio` where lab_codigo = " + Tabla_Laboratorio.getValueAt(fila, 0);
            Statement st = (Statement) con.createStatement();
            int n = st.executeUpdate(SQL);
            if (n >= 0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            mostrarDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro, "+e);
        }
         
        mostrarDatos();
    }                                            

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_Lab.setText("");
        txt_nombre.setText("");
        txt_Encarga.setText("");
        txt_Capacidad.setText("");
        Cmb_Bloque.setSelectedItem(null); 
    }
}
