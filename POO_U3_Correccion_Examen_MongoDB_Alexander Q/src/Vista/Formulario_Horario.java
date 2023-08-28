package Vista;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
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
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * @author Alexander Quizhpe
 */

public class Formulario_Horario extends JInternalFrame{
    
    public JPanel panel;
    
    JTable Tabla_Laboratorio = new JTable();
    JTextField txt_Lab = new JTextField();
    JTextField txt_nombre = new JTextField();
    JTextField txt_Asignatura = new JTextField();
    JComboBox Cmb_Hora = new JComboBox();
    JComboBox Cmb_Dia = new JComboBox();
    JButton Nuevo = new JButton("Nuevo");
    JButton Guardar = new JButton("Guardar");
    JButton Eliminar = new JButton("Eliminar");
    JButton Editar = new JButton("Editar");
    
    //Creamos una ventana grafica con JFrame
    public Formulario_Horario (){
       this.setSize(1000,400); 
       setTitle("Registro Horarios"); //Comando que permitecolocar nombre a la ventana
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
        JLabel label = new JLabel("Registrar Horarios",SwingConstants.CENTER);
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
        label2.setText("Nombre: ");
        panel.add(label2);
        //Comando para ubicar el label
        label2.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(40, 80, 100, 15);
        
        JLabel label3 = new JLabel();
        label3.setText("Hora: ");
        panel.add(label3);
        //Comando para ubicar el label
        label3.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(40, 120, 100, 15);
        
        JLabel label4 = new JLabel();
        label4.setText("Asignatura: ");
        panel.add(label4);
        //Comando para ubicar el label
        label4.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(40, 160, 100, 15);
        
        JLabel label5 = new JLabel();
        label5.setText("Dia: ");
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
        
        txt_Asignatura.setBounds(140, 157, 300, 20);
        panel.add(txt_Asignatura);
    }
    
    public void ColocarComboBox(){
        Cmb_Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00 - 08:00", "08:00 - 09:00", "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00" }));
        Cmb_Hora.setBounds(140,117,300,20);
        panel.add(Cmb_Hora);
        
        Cmb_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        Cmb_Dia.setBounds(140,197,300,20);
        panel.add(Cmb_Dia);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==Cmb_Hora) {
            String seleccionado=(String)Cmb_Hora.getSelectedItem();
            setTitle(seleccionado);
        }
        if (e.getSource()==Cmb_Dia) {
            String seleccionado=(String)Cmb_Dia.getSelectedItem();
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
        String titulos[] = {"ID", "# Laboratorio", "Nombre", "Hora", "Asignatura", "Dia"};
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Tabla_Laboratorio.setModel(modelo);
        panel.add(Tabla_Laboratorio);
        mostrarDatos();
    }
    
    public MongoDatabase DataMongoDB (){
        MongoDatabase database = null;
        int puerto = 27017;
        String server = "localhost";
        
        try {
            MongoClient query = new MongoClient(server, puerto);
            database = query.getDatabase("poo_correcion");
            System.out.println("MONGODB-CONNECT");
            return database;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar MongoDB");
        }
        return database;
    }
    
    public void mostrarDatos(){
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("horarios");
        // Obtener todos los documentos de la colección
        FindIterable<Document> documents = collection.find();
        
        String titulos[] = {"ID", "# Laboratorio", "Nombre", "Hora", "Asignatura", "Dia"};
        String registro[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM horario";
        try (MongoCursor<Document> cursor = documents.iterator()){
            while(cursor.hasNext()){
                Document regis = cursor.next();
                registro[0] = regis.getString("lab_codigo");
                registro[1] = regis.getString("lab_numlab");
                registro[2] = regis.getString("lab_nombre");
                registro[3] = regis.getString("lab_hora");
                registro[4] = regis.getString("lab_materia");
                registro[5] = regis.getString("lab_dia");
                modelo.addRow(registro);
            }
            Tabla_Laboratorio.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos. "+e);
            System.out.println(e);
        }  
    }                        

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {  
        int select = Cmb_Dia.getSelectedIndex();
        int select1 = Cmb_Hora.getSelectedIndex();
        String lab = txt_Lab.getText();
        String nom = txt_nombre.getText();
        String asig = txt_Asignatura.getText();
        
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("horarios");
        Document newDocument = new Document(
                "#LAB", lab).append(
                "Nombre", nom).append(
                "Hora", String.valueOf(Cmb_Hora.getItemAt(select1))).append(
                "Materia", asig).append(
                "Dia",String.valueOf(Cmb_Dia.getItemAt(select)));
        
        collection.insertOne(newDocument);
        
        mostrarDatos();
    }                                           

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int select = Cmb_Dia.getSelectedIndex();
        int select1 = Cmb_Hora.getSelectedIndex();
        String lab = txt_Lab.getText();
        String nom = txt_nombre.getText();
        String asig = txt_Asignatura.getText();
        
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("horarios");
        
        int fila = Tabla_Laboratorio.getSelectedRow();
        ObjectId id = new ObjectId((String) Tabla_Laboratorio.getValueAt(fila, 0));
        
        Document newDocument = new Document(
                "#LAB", lab).append(
                "Nombre", nom).append(
                "Hora", String.valueOf(Cmb_Hora.getItemAt(select1))).append(
                "Materia", asig).append(
                "Dia",String.valueOf(Cmb_Dia.getItemAt(select)));
        
        collection.replaceOne(new Document("lab_codigo", id), newDocument);
        
        mostrarDatos();
    }                                          

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("horarios");
        
        int fila = Tabla_Laboratorio.getSelectedRow();
        ObjectId id = new ObjectId((String) Tabla_Laboratorio.getValueAt(fila, 0));
        
        collection.deleteOne(new Document("lab_codigo", id));
        
         
        mostrarDatos();
    }                                            

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_Lab.setText("");
        txt_nombre.setText("");
        Cmb_Hora.setSelectedItem(null);
        txt_Asignatura.setText("");
        Cmb_Dia.setSelectedItem(null); 
    }
}
