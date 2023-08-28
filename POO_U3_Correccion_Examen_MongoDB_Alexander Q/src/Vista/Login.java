package Vista;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.IndexOptions;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Alexander Quizhpe
 */
public class Login extends javax.swing.JFrame {
    
    //Creacion del panel
    public JPanel panel;
    
    JTextField txt_Usser = new JTextField();
    JPasswordField txt_Pass = new JPasswordField();
    JButton Iniciar = new JButton("Iniciar Sesion");
    JButton Registrar = new JButton("Registrar");
    
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
    public Login (){
       this.setSize(400,450); 
       setTitle("Iniciar Sesion"); //Comando que permitecolocar nombre a la ventana
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
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //Comando para aplicar color al panel
        panel.setBackground(Color.white);
        //Poner el panel sobre la ventana del registro
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("LOGIN",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(150, 30, 100, 20);
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
        txt_Usser.setBounds(120, 217, 200, 20);
        panel.add(txt_Usser);
        
        txt_Pass.setBounds(120, 257, 200, 20);
        panel.add(txt_Pass);
        
    }
    
    public void ColocarBotones(){
        Iniciar.setBounds(75, 300, 250, 30);
        panel.add(Iniciar);
        Iniciar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
        
        Registrar.setBounds(75, 350, 250, 30);
        panel.add(Registrar);
        Registrar.setEnabled(true);//Sirve para habilitar o deshabilitar los botones
    }
    
    public void getTask(){
        MongoDatabase database = DataMongoDB();
        MongoCollection<Document> collection = database.getCollection("task");
        // Obtener todos los documentos de la colección
        FindIterable<Document> documents = collection.find();
        
        String titulos[] = {"ID", "Titulo", "Descripcion", "Estado"};
        String registro[] = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        try (MongoCursor<Document> cursor = documents.iterator()) {
            while(cursor.hasNext()){
                Document document = cursor.next();
                registro[0] = document.getObjectId("_id").toString();
                registro[1] = document.getString("title");
                registro[2] = document.getString("description");
                registro[3] = "FALTA REALIZAR";
                if (document.getInteger("state") == 1){
                    registro[3] = "HECHO";
                }
                
                modelo.addRow(registro);
            }
            //tblTareas.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos.");
            System.out.println("Hubo un error : " + e);
        }
    }
    
    public void validarUsuario(){
        try (MongoClient mongoClient = (MongoClient) MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = DataMongoDB();
            MongoCollection<Document> collection = database.getCollection("task");
            
            // Datos ingresados por el usuario
            String userInputUsername = txt_Usser.getText();
            String userInputPassword = String.valueOf(txt_Pass.getPassword());
            
            // Crear filtro para buscar el usuario por nombre de usuario
            Document filter = new Document("usu_usuario", userInputUsername);
            
            // Ejecutar la consulta
            Document userDocument = collection.find(filter).first();
            
            if (userDocument != null) {
                // Usuario encontrado en la base de datos
                String storedPassword = userDocument.getString("usu_pass");
                
                if (userInputPassword.equals(storedPassword)) {
                    this.dispose();
                    Menu menu = new Menu();
                    menu.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }
    }
    
    public void agregarUsuario(){
        try{
            //OBTENER VALORES
            String usu_usuario = txt_Usser.getText();
            String usu_pass = String.valueOf(txt_Pass.getPassword());

            int state = 0;
            
            MongoDatabase database = DataMongoDB();
            MongoCollection<Document> collection = database.getCollection("task");
            collection.createIndex(new Document("usu_usuario", 1), new IndexOptions().unique(true));
            Document newDocument = new Document("usu_usuario", usu_usuario).append("usu_pass", usu_pass);

            collection.insertOne(newDocument);
            getTask();
        }catch(MongoException ME){
            JOptionPane.showMessageDialog(null, "Error al crear cuenta");
        }
    }
    
    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        validarUsuario();
        // TODO add your handling code here:
    } 
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        agregarUsuario();
        // TODO add your handling code here:
    } 
}
