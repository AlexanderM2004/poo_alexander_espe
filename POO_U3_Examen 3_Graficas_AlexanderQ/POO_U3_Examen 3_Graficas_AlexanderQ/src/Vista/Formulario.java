package Vista;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 * @author Alexander Quizhpe
 */

public class Formulario extends JInternalFrame{
    
    Conexion cc = new Conexion();
    Connection con = cc.Conectar();
    
    public JPanel panel;
    
    JTable Tabla_Estudiantes = new JTable();
    JTextField txt_Codigo = new JTextField();
    JTextField txt_Cedula = new JTextField();
    JTextField txt_Apellido = new JTextField();
    JTextField txt_Nombre = new JTextField();
    JTextField txt_Mail = new JTextField();
    JTextField txt_Telefono = new JTextField();
    JTextField txt_Direccion = new JTextField();
    JComboBox Cmb_Materia = new JComboBox();
    JRadioButton BT_Aprobado = new JRadioButton();
    JRadioButton BT_Reprobado = new JRadioButton();
    JButton Nuevo = new JButton("Nuevo");
    JButton Guardar = new JButton("Guardar");
    JButton Eliminar = new JButton("Eliminar");
    JButton Editar = new JButton("Editar");
    JButton Importar = new JButton ("Importar");
    JButton Exportar = new JButton ("Exportar");
    
    //Creamos una ventana grafica con JFrame
    public Formulario (){
       this.setSize(1000,500); 
       setTitle("Registro Estudiante"); //Comando que permitecolocar nombre a la ventana
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
        RadioButton();
        ColocarTabla();
        
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
        
        txt_Codigo.setBounds(120, 37, 300, 20);
        panel.add(txt_Codigo);
        
        txt_Cedula.setBounds(120, 77, 300, 20);
        panel.add(txt_Cedula);
        
        txt_Apellido.setBounds(120, 117, 300, 20);
        panel.add(txt_Apellido);
        
        txt_Nombre.setBounds(120, 157, 300, 20);
        panel.add(txt_Nombre);
        
        txt_Mail.setBounds(120, 197, 300, 20);
        panel.add(txt_Mail);
        
        txt_Telefono.setBounds(120, 237, 300, 20);
        panel.add(txt_Telefono);
        
        txt_Direccion.setBounds(120, 277, 300, 20);
        panel.add(txt_Direccion);
    }
    
    public void ColocarComboBox(){
        Cmb_Materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CALCULO", "POO", "COMPUTACION", "EDO", "FISICA" }));
        Cmb_Materia.setBounds(120,317,300,20);
        panel.add(Cmb_Materia);
    }
    
    public void RadioButton(){
        BT_Aprobado.setText("Aprobado");
        BT_Aprobado.setBounds(120, 357, 145, 20);
        panel.add(BT_Aprobado);
        
        BT_Reprobado.setText("Reprovado");
        BT_Reprobado.setBounds(275, 357, 145, 20);
        panel.add(BT_Reprobado);
    }
    
    public void ColocarTabla(){
        Tabla_Estudiantes.setBounds(450, 37, 500, 340);
        panel.add(Tabla_Estudiantes);
    }
    
    //Conexion de registro
    public void ModelTableDefault (){
        Tabla_Estudiantes.setBounds(450, 37, 500, 340);
        String titulos[] = {"Cod.","ID", "Cedula","Apellido", "Nombre", "Mail", "Telefono","Direccion", "Materia","Estado"};
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Tabla_Estudiantes.setModel(modelo);
        panel.add(Tabla_Estudiantes);
        mostrarDatos();
    }
    
    public void ColocarBotones(){
        Nuevo.setBounds(250, 397, 100, 30);
        panel.add(Nuevo);
        Nuevo.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Nuevo.setMnemonic('n');//Sirve para que se active el boton con el teclado Alt + n
        
        Guardar.setBounds(400, 397, 100, 30);
        panel.add(Guardar);
        Guardar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Guardar.setMnemonic('g');//Sirve para que se active el boton con el teclado Alt + g
        
        Eliminar.setBounds(550, 397, 100, 30);
        panel.add(Eliminar);
        Eliminar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Eliminar.setMnemonic('d');//Sirve para que se active el boton con el teclado Alt + d
        
        Editar.setBounds(700, 397, 100, 30);
        panel.add(Editar);
        Editar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Editar.setMnemonic('e');//Sirve para que se active el boton con el teclado Alt + e
    }
    
    //Conexion con la base de datos
    public void mostrarDatos(){
        String titulos[] = {"Cod.","ID", "Cedula","Apellido", "Nombre", "Mail", "Telefono","Direccion", "Materia","Estado"};
        String registro[] = new String[10];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM estudiante";
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0] = rs.getString("codigo");
                registro[1] = rs.getString("estu_codigo");
                registro[2] = rs.getString("estu_cedula");
                registro[3] = rs.getString("estu_apellido");
                registro[4] = rs.getString("estu_nombre");
                registro[5] = rs.getString("estu_mail");
                registro[6] = rs.getString("estu_telefono");
                registro[7] = rs.getString("estu_direccion");
                registro[8] = rs.getString("estu_materia");
                registro[9] = rs.getString("estu_estado");
                modelo.addRow(registro);
            }
            Tabla_Estudiantes.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos. "+e);
            System.out.println(e);
        }  
    }
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String SQL = "insert into estudiante(estu_codigo,estu_cedula, estu_apellido, estu_nombre, estu_mail, estu_telefono, estu_direccion, estu_materia, estu_estado)values(?,?,?,?,?,?,?,?,?)";
        try {
            int select1 = Cmb_Materia.getSelectedIndex();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            String esta; 
            if(BT_Aprobado.isSelected()){
                esta = "Reprobado";
            } else {
                esta = "Aprobado";
            }
            
            String estado; 
            if(BT_Reprobado.isSelected()){
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }
            
            pst.setString(1,txt_Codigo.getText());
            pst.setString(2,txt_Cedula.getText());
            pst.setString(3,txt_Apellido.getText());
            pst.setString(4,txt_Nombre.getText());
            pst.setString(5,txt_Mail.getText());
            pst.setString(6,txt_Telefono.getText());
            pst.setString(7,txt_Direccion.getText());
            pst.setString(8, (String) Cmb_Materia.getItemAt(select1));
            pst.setString(9,esta);
            pst.setString(9,estado);
            pst.execute();
        } catch(Exception e){
            System.out.println(e);
        }
        
        mostrarDatos();
    }                                           

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        try {
            String SQL = "update estudiante set estu_codigo=?,estu_cedula=?, estu_apellido=?, estu_nombre=?, estu_mail=?, estu_telefono=?, estu_direccion=?, estu_materia=?, estu_estado=? where codigo = ?";
            int fila = Tabla_Estudiantes.getSelectedRow();
            int select1 = Cmb_Materia.getSelectedIndex();
            String dao = (String) Tabla_Estudiantes.getValueAt(fila, 0);
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            
            String esta; 
            if(BT_Aprobado.isSelected()){
                esta = "Reprobado";
            } else {
                esta = "Aprobado";
            }
            
            String estado; 
            if(BT_Reprobado.isSelected()){
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }

            
            pst.setString(1,txt_Codigo.getText());
            pst.setString(2,txt_Cedula.getText());
            pst.setString(3,txt_Apellido.getText());
            pst.setString(4,txt_Nombre.getText());
            pst.setString(5,txt_Mail.getText());
            pst.setString(6,txt_Telefono.getText());
            pst.setString(7,txt_Direccion.getText());
            pst.setString(8, (String) Cmb_Materia.getItemAt(select1));
            pst.setString(9, esta); 
            pst.setString(10, estado); 
            pst.setString(11, dao); 
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
            int fila = Tabla_Estudiantes.getSelectedRow();
            System.out.println(Tabla_Estudiantes.getValueAt(fila, 0));
            String SQL = "delete from `estudiante` where codigo = " + Tabla_Estudiantes.getValueAt(fila, 0);
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
        txt_Codigo.setText("");
        txt_Cedula.setText("");
        txt_Apellido.setText("");
        txt_Nombre.setText("");
        txt_Mail.setText("");
        txt_Telefono.setText("");
        txt_Direccion.setText("");
        Cmb_Materia.setSelectedItem(null);
        BT_Aprobado.setSelected(false);
        BT_Reprobado.setSelected(false);
    }
}
