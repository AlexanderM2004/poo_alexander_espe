package Vista;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * @author Alexander Quizhpe
 */

public class Formulario_Profesor extends JInternalFrame{
    
    public JPanel panel;
    JTextField txt_Cedula = new JTextField();
    JTextField txt_Apellido = new JTextField();
    JTextField txt_Nombre = new JTextField();
    JTextField txt_Celular = new JTextField();
    JTextField txt_Mail = new JTextField();
    JTextField txt_Titulo = new JTextField();
    JComboBox Cmb_Estado = new JComboBox();
    JTable Tabla_Profesores = new JTable();
    JButton Nuevo = new JButton("Nuevo");
    JButton Guardar = new JButton("Guardar");
    JButton Eliminar = new JButton("Eliminar");
    JButton Editar = new JButton("Editar");
    
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
    
    //Creamos una ventana grafica con JFrame
    public Formulario_Profesor (){
       this.setSize(1000,420); 
       setTitle("Registro Estudiante"); //Comando que permitecolocar nombre a la ventana
       //Comando que permite finalizar todo el programa en el momento que se cierra la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
        ColocarCajatexto();
        ColocarComboBox();
        ModelTableDefault();
        
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
        JLabel label = new JLabel("Registrar Profesores",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(325, 10, 350, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.white);
        
        JLabel label1 = new JLabel();
        label1.setText("Cedula: ");
        panel.add(label1);
        //Comando para ubicar el label
        label1.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setBounds(40, 40, 70, 15);
        
        JLabel label2 = new JLabel();
        label2.setText("Apellidos: ");
        panel.add(label2);
        //Comando para ubicar el label
        label2.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(40, 80, 70, 15);
        
        JLabel label3 = new JLabel();
        label3.setText("Nombre: ");
        panel.add(label3);
        //Comando para ubicar el label
        label3.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(40, 120, 70, 15);
        
        JLabel label4 = new JLabel();
        label4.setText("Celular: ");
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
        label6.setText("Titulo: ");
        panel.add(label6);
        //Comando para ubicar el label
        label6.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(40, 240, 70, 15);
        
        JLabel label7 = new JLabel();
        label7.setText("Estado: ");
        panel.add(label7);
        //Comando para ubicar el label
        label7.setHorizontalAlignment(HEIGHT);
        //comando para modificar fuente de letra
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(40, 280, 70, 15);
     
    }
    
    //Comando para colocar cajas de texto
    public void ColocarCajatexto(){
        txt_Cedula.setBounds(120, 37, 300, 20);
        panel.add(txt_Cedula);
        
        txt_Apellido.setBounds(120, 77, 300, 20);
        panel.add(txt_Apellido);
        
        txt_Nombre.setBounds(120, 117, 300, 20);
        panel.add(txt_Nombre);
        
        txt_Celular.setBounds(120, 157, 300, 20);
        panel.add(txt_Celular);
        
        txt_Mail.setBounds(120, 197, 300, 20);
        panel.add(txt_Mail);
        
        txt_Titulo.setBounds(120, 237, 300, 20);
        panel.add(txt_Titulo);
    }
    
    public void ColocarComboBox(){
        Cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombramiento","Contrato" }));
        Cmb_Estado.setBounds(120,277,300,20);
        panel.add(Cmb_Estado);
    }
    
    //Conexion de registro
    public void ModelTableDefault(){
        Tabla_Profesores.setBounds(450, 37, 500, 260);
        String titulos[] = {"ID", "Cedula", "Apellido", "Nombre", "Celular", "Mail", "Titulo", "Estado"};
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Tabla_Profesores.setModel(modelo);
        panel.add(Tabla_Profesores);
        mostrarDatos();
    }
    
    public void ColocarBotones(){
        Nuevo.setBounds(250, 320, 100, 30);
        panel.add(Nuevo);
        Nuevo.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Nuevo.setMnemonic('n');//Sirve para que se active el boton con el teclado Alt + n
        
        Guardar.setBounds(400, 320, 100, 30);
        panel.add(Guardar);
        Guardar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Guardar.setMnemonic('g');//Sirve para que se active el boton con el teclado Alt + g
        
        Eliminar.setBounds(550, 320, 100, 30);
        panel.add(Eliminar);
        Eliminar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Eliminar.setMnemonic('d');//Sirve para que se active el boton con el teclado Alt + d
        
        Editar.setBounds(700, 320,100, 30);
        panel.add(Editar);
        Editar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        Editar.setMnemonic('e');//Sirve para que se active el boton con el teclado Alt + e
    }
    
    public void mostrarDatos(){
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("profesores");
        FindIterable<Document> documents = collection.find();
        
        String titulos[] = {"ID", "Cedula", "Apellido", "Nombre", "Celular", "Mail", "Titulo", "Estado"};
        String registro[] = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try (MongoCursor<Document> cursor = documents.iterator()){
            while(cursor.hasNext()){
                Document regis = cursor.next();
                registro[0] = regis.getObjectId("profe_codigo").toString();
                registro[1] = regis.getString("profe_cedula");
                registro[2] = regis.getString("profe_apellido");
                registro[3] = regis.getString("profe_nombre");
                registro[4] = regis.getString("profe_celular");
                registro[5] = regis.getString("profe_mail");
                registro[6] = regis.getString("profe_titulo");
                registro[7] = regis.getString("profe_estado");
                modelo.addRow(registro);
            }
            Tabla_Profesores.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos. "+e);
            System.out.println(e);
        }  
    }
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {    
        
        String ci = txt_Cedula.getText();
        String apellido = txt_Apellido.getText();
        String nombre = txt_Nombre.getText();
        String phone = txt_Celular.getText();
        String mail = txt_Mail.getText();
        String titulo = txt_Titulo.getText();
        int select =  Cmb_Estado.getSelectedIndex();
        
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("profesores");
        Document newDocument = new Document(
                "Cedula", ci).append(
                "Apellido", apellido).append(
                "Nombre", nombre).append(
                "Telefono", phone).append(
                "Mail", mail).append(
                "Titulo", titulo).append(
                "Estado", String.valueOf(Cmb_Estado.getItemAt(select)));
        
        collection.insertOne(newDocument);
        
        mostrarDatos();
    }                                           

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("profesores");
        
        String ci = txt_Cedula.getText();
        String apellido = txt_Apellido.getText();
        String nombre = txt_Nombre.getText();
        String phone = txt_Celular.getText();
        String mail = txt_Mail.getText();
        String titulo = txt_Titulo.getText();
        int select =  Cmb_Estado.getSelectedIndex();
        
        int fila = Tabla_Profesores.getSelectedRow();
        ObjectId id = new ObjectId((String) Tabla_Profesores.getValueAt(fila, 0));
        
        Document newDocument = new Document(
                "Cedula", ci).append(
                "Apellido", apellido).append(
                "Nombre", nombre).append(
                "Telefono", phone).append(
                "Mail", mail).append(
                "Titulo", titulo).append(
                "Estado", String.valueOf(Cmb_Estado.getItemAt(select)));
        
        collection.replaceOne(new Document("profe_codigo", id), newDocument);
        mostrarDatos();
    }                                          

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("profesores");
        
        int fila = Tabla_Profesores.getSelectedRow();
        ObjectId id = new ObjectId((String) Tabla_Profesores.getValueAt(fila, 0));
        
        collection.deleteOne(new Document("profe_codigo", id));
         
        mostrarDatos();
    }                                            

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txt_Cedula.setText("");
        txt_Apellido.setText("");
        txt_Nombre.setText("");
        txt_Celular.setText("");
        txt_Mail.setText("");
        txt_Titulo.setText("");
        Cmb_Estado.setSelectedItem(null);
    }                  
}
