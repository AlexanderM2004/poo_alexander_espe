
package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Alexander Quizhpe
 */
public class Menu extends JFrame{
    
    JDesktopPane desktop = new JDesktopPane();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu();
    JMenuItem menuItem1 = new JMenuItem();
    JMenuItem menuItem2 = new JMenuItem();
    JMenuItem menuItem3 = new JMenuItem();
    JMenuItem menuItem4 = new JMenuItem();
    
    Formulario form1;
    Formulario_Horario form2;
    Formulario_Profesor form3;
    
    public Menu(){
        iniciarComponentes();
    }
    
    @SuppressWarnings("Convert2Lambda")
    public void iniciarComponentes(){
        this.setSize(600,600);
        this.setTitle("Gestion Datos de Personas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        setLocationRelativeTo(null);
        
        this.add(desktop);
        desktop.setBackground(new Color(40, 45, 51));
        menuBar.setForeground(new Color(58, 85, 128));
        
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        
        menuItem1.setText("Estudiantes");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem1);
        
        menuItem2.setText("Horario");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem2);
        
        menuItem3.setText("Profesor");
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem3);
        
        menuBar.add(fileMenu);
        desktop.add(menuBar);
        setJMenuBar(menuBar);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        
        this.pack();
    }
    
    private void menuItem1ActionPerformed(ActionEvent evt) {
        form1 = new Formulario();
        form1.setLocation(0,0);
        desktop.removeAll();
        desktop.add(form1);
        desktop.revalidate();
        desktop.repaint();
        form1.toFront();
        form1.setVisible(true);
    }
    
    private void menuItem2ActionPerformed(ActionEvent evt) {
        form2 = new Formulario_Horario();
        form2.setLocation(0,0);
        desktop.removeAll();
        desktop.add(form2);
        desktop.revalidate();
        desktop.repaint();
        form2.toFront();
        form2.setVisible(true);
    }
    
    private void menuItem3ActionPerformed(ActionEvent evt) {
        form3 = new Formulario_Profesor();
        form3.setLocation(0,0);
        desktop.removeAll();
        desktop.add(form3);
        desktop.revalidate();
        desktop.repaint();
        form3.toFront();
        form3.setVisible(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(java.awt.Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java.awt.Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java.awt.Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java.awt.Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
