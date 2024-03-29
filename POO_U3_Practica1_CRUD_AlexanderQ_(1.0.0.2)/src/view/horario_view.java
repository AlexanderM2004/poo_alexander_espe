/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author ESPE
 */
public class horario_view extends javax.swing.JInternalFrame {

    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    public horario_view() {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        panel_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_asignatura = new javax.swing.JLabel();
        label_promedio = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombrelb = new javax.swing.JTextField();
        txt_temalb = new javax.swing.JTextField();
        buton_guardar = new javax.swing.JButton();
        buton_actualizar = new javax.swing.JButton();
        buton_eliminar = new javax.swing.JButton();
        buton_nuevo = new javax.swing.JButton();
        combobox_estado = new javax.swing.JComboBox<>();
        label_estado1 = new javax.swing.JLabel();
        txt_capacidad = new javax.swing.JTextField();
        txt_encargado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_laboratorios = new javax.swing.JTable();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE LABORATORIO");

        label_apellido.setText("NOMBRE LABORATORIO:");

        label_nombre.setText("CODIGO:");

        label_asignatura.setText("TEMA:");

        label_promedio.setText("CAPACIDAD");

        label_estado.setText("ESTADO");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        txt_nombrelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombrelbActionPerformed(evt);
            }
        });

        txt_temalb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_temalbActionPerformed(evt);
            }
        });

        buton_guardar.setText("GUARDAR");
        buton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_guardarActionPerformed(evt);
            }
        });

        buton_actualizar.setText("ACTUALIZAR");
        buton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_actualizarActionPerformed(evt);
            }
        });

        buton_eliminar.setText("ELIMINAR");
        buton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_eliminarActionPerformed(evt);
            }
        });

        buton_nuevo.setText("NUEVO");
        buton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_nuevoActionPerformed(evt);
            }
        });

        combobox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantenimiento", "Disponible", "Usado" }));
        combobox_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_estadoActionPerformed(evt);
            }
        });

        label_estado1.setText("ENCARGADO");

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(buton_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buton_guardar)
                        .addGap(29, 29, 29)
                        .addComponent(buton_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buton_actualizar))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1))
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_apellido)
                                    .addComponent(label_nombre)
                                    .addComponent(label_asignatura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txt_nombrelb)
                                    .addComponent(txt_temalb)))
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_promedio)
                                    .addComponent(label_estado)
                                    .addComponent(label_estado1))
                                .addGap(69, 69, 69)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_capacidad)
                                    .addComponent(txt_encargado)
                                    .addComponent(combobox_estado, 0, 229, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombrelb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_asignatura)
                    .addComponent(txt_temalb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_estado1)
                    .addComponent(txt_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_estado)
                    .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_guardar)
                    .addComponent(buton_eliminar)
                    .addComponent(buton_nuevo)
                    .addComponent(buton_actualizar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tabla_laboratorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_laboratorios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarDatos(){
        String titulos []= {"Codigo","Laboratorio","Tema","Capacidad","Encargado","Estado"};
        String registro[]=new String[7];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        //va a seleccionar mi tabala para la base de datos a conectar
        String SQL="select * from laboratorio";
        try{
            Statement st= (Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("lab_codigo");
                registro[1]=rs.getString("lab_nomlab");
                registro[2]=rs.getString("lab_tema");
                registro[3]=rs.getString("lab_capacidad");
                registro[4]=rs.getString("lab_encargado");
                registro[5]=rs.getString("lab_estado");
                modelo.addRow(registro);
            }
            tabla_laboratorios.setModel(modelo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error al mostrar datos"+ e.getMessage());
            
        }
    }
    public void limpiarDatos(){
        txt_codigo.setText("");
        txt_nombrelb.setText("");
        txt_temalb.setText("");
        txt_capacidad.setText("");
        txt_encargado.setText("");
        combobox_estado.setSelectedItem(null); 
    }
    
    public void insertarDatos(){
        try {
            String SQL="insert into laboratorio(lab_codigo, lab_nomlab, lab_tema, lab_capacidad, lab_encargado, lab_estado)values(?,?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txt_codigo.getText());
            pst.setString(2, txt_nombrelb.getText());
            pst.setString(3,txt_temalb.getText());
            pst.setString(4, txt_capacidad.getText());
            pst.setString(5,txt_encargado.getText());
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(6,combobox_estado.getItemAt(seleccion2));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion"+e);
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada=tabla_laboratorios.getSelectedRow();
        try {
            String SQL="delete from laboratorio where lab_codigo="+tabla_laboratorios.getValueAt(filaSeleccionada, 0);
            Statement st=(Statement) con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
    }
        public void actualizarDatos(){
        try {
            String 
            SQL="update laboratorio set lab_codigo=?, lab_nomlab=?, lab_tema=?, lab_capacidad=?, lab_encargado=?, lab_estado=? where lab_codigo";    
            //SQL="update estudiantes set nombre=?,apellidos=?,asignatura=?,promedio=?,estado=? where idestudiantes=?";
            int filaSeleccionada=tabla_laboratorios.getSelectedRow();
            String dao=(String)tabla_laboratorios.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txt_codigo.getText());
            pst.setString(2,txt_nombrelb.getText());
            pst.setString(3,txt_temalb.getText());
            pst.setString(4, txt_capacidad.getText());
            pst.setString(5,txt_encargado.getText());
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(6,combobox_estado.getItemAt(seleccion2));
            //Ejecutamos la consulta/
            pst.setString(7, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
    }
    
    
    
    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_nombrelbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombrelbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombrelbActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txt_temalbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_temalbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_temalbActionPerformed

    private void buton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_guardarActionPerformed
        insertarDatos();
        limpiarDatos();
        mostrarDatos();
        
    }//GEN-LAST:event_buton_guardarActionPerformed

    private void buton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_actualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
        mostrarDatos();
    }//GEN-LAST:event_buton_actualizarActionPerformed

    private void buton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_nuevoActionPerformed
       limpiarDatos();
    }//GEN-LAST:event_buton_nuevoActionPerformed

    private void combobox_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_estadoActionPerformed

    private void buton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarRegistro();
        mostrarDatos();
        limpiarDatos();  
    }//GEN-LAST:event_buton_eliminarActionPerformed
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(horario_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(horario_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(horario_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(horario_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horario_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_actualizar;
    private javax.swing.JButton buton_eliminar;
    private javax.swing.JButton buton_guardar;
    private javax.swing.JButton buton_nuevo;
    private javax.swing.JComboBox<String> combobox_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_asignatura;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_estado1;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_promedio;
    private javax.swing.JPanel panel_1;
    private javax.swing.JTable tabla_laboratorios;
    private javax.swing.JTextField txt_capacidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_encargado;
    private javax.swing.JTextField txt_nombrelb;
    private javax.swing.JTextField txt_temalb;
    // End of variables declaration//GEN-END:variables
}
