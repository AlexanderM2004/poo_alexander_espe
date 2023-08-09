package view;

/**
 * @author Alexander Quizhpe
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class estu_view extends javax.swing.JInternalFrame {

    Conexion cc=new Conexion();
    Connection con=cc.conexion();
    public estu_view() {
        initComponents();
        mostrarDatos();
    }
    
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
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_promedio = new javax.swing.JTextField();
        buton_guardar = new javax.swing.JButton();
        buton_actualizar = new javax.swing.JButton();
        buton_eliminar = new javax.swing.JButton();
        buton_nuevo = new javax.swing.JButton();
        combobox_asignatura = new javax.swing.JComboBox<>();
        combobox_estado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estudiantes = new javax.swing.JTable();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE ESTUDIANTE");

        label_apellido.setText("APELLIDO:");

        label_nombre.setText("NOMBRE:");

        label_asignatura.setText("ASIGNATURA:");

        label_promedio.setText("PROMEDIO");

        label_estado.setText("ESTADO");

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_promedioActionPerformed(evt);
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

        combobox_asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POO", "FISICA", "EDO", "CALCULO" }));

        combobox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprovado", "Reprovado" }));

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_promedio)
                            .addComponent(label_estado))
                        .addGap(54, 54, 54)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_promedio)
                            .addComponent(combobox_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_asignatura)
                            .addComponent(label_nombre)
                            .addComponent(label_apellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre)
                            .addComponent(combobox_asignatura, 0, 293, Short.MAX_VALUE)
                            .addComponent(txt_apellido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(buton_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addComponent(buton_guardar)
                                .addGap(29, 29, 29)
                                .addComponent(buton_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buton_actualizar)))))
                .addGap(22, 22, 22))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_asignatura)
                    .addComponent(combobox_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_estado)
                    .addComponent(combobox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton_guardar)
                    .addComponent(buton_eliminar)
                    .addComponent(buton_nuevo)
                    .addComponent(buton_actualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        tabla_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_estudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarDatos(){
        String titulos []= {"Codigo","Apellido","Nombre","Asignatura","Promedio","Estado"};
        String registro[]=new String[6];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        //va a seleccionar mi tabala para la base de datos a conectar
        String SQL="select * from estudiante";
        try{
            Statement st= (Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("estu_codigo");
                registro[1]=rs.getString("estu_apellido");
                registro[2]=rs.getString("estu_nombre");
                registro[3]=rs.getString("estu_asignatura");
                registro[4]=rs.getString("estu_promedio");
                registro[5]=rs.getString("estu_estado");
                modelo.addRow(registro);
            }
            tabla_estudiantes.setModel(modelo);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error al mostrar datos"+ e.getMessage());
            
        }
    }
    public void limpiarDatos(){
        txt_apellido.setText("");
        txt_nombre.setText("");
        txt_promedio.setText("");
        combobox_asignatura.setSelectedItem(null);
        combobox_estado.setSelectedItem(null); 
    }
    
    public void insertarDatos(){
        try {
            String SQL="insert into estudiante(estu_apellido,estu_nombre,estu_asignatura,estu_promedio,estu_estado)values(?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, txt_nombre.getText());
            pst.setString(2, txt_apellido.getText());
            
            int seleccion=combobox_asignatura.getSelectedIndex();
            pst.setString(3,combobox_asignatura.getItemAt(seleccion));
            
            pst.setString(4,txt_promedio.getText());
            
            
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(5,combobox_estado.getItemAt(seleccion2));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion"+e);
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada=tabla_estudiantes.getSelectedRow();
        try {
            String SQL="delete from estudiante where estu_codigo="+tabla_estudiantes.getValueAt(filaSeleccionada, 0);
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
            SQL="update estudiante set estu_apellido=?,estu_nombre=?,estu_asignatura=?,estu_promedio=?,estu_estado=? where estu_codigo";
            //SQL="update estudiantes set nombre=?,apellidos=?,asignatura=?,promedio=?,estado=? where idestudiantes=?";
            int filaSeleccionada=tabla_estudiantes.getSelectedRow();
            String dao=(String)tabla_estudiantes.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txt_nombre.getText());
            pst.setString(2,txt_apellido.getText());
            
            int  seleccion=combobox_asignatura.getSelectedIndex();
            pst.setString(3, combobox_asignatura.getItemAt(seleccion));
            
            pst.setString(4,txt_promedio.getText());
            
            int seleccion2=combobox_estado.getSelectedIndex();
            pst.setString(5,combobox_estado.getItemAt(seleccion2));
            //Ejecutamos la consulta/
            pst.setString(6, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
    }
    
    
    
    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txt_promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_promedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_promedioActionPerformed

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
            java.util.logging.Logger.getLogger(estu_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estu_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estu_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estu_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estu_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton_actualizar;
    private javax.swing.JButton buton_eliminar;
    private javax.swing.JButton buton_guardar;
    private javax.swing.JButton buton_nuevo;
    private javax.swing.JComboBox<String> combobox_asignatura;
    private javax.swing.JComboBox<String> combobox_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_asignatura;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_promedio;
    private javax.swing.JPanel panel_1;
    private javax.swing.JTable tabla_estudiantes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_promedio;
    // End of variables declaration//GEN-END:variables
}
