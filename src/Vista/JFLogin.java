package Vista;

import Negocio.Conexion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;

/*
 * @author Steeven
 */
public class JFLogin extends javax.swing.JFrame {
 
    Conexion con;
    Conexion conexion;
    JFMenu menu;

    public JFLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.jLocultar.setVisible(false);
    }
    
    public void menu(){
        menu = new JFMenu();
        menu.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFusuario = new javax.swing.JTextField();
        jPFcontraseña = new javax.swing.JPasswordField();
        jLver = new javax.swing.JLabel();
        jLocultar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setBackground(new java.awt.Color(51, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de Sesion"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jTFusuario.setToolTipText("");
        jPanel1.add(jTFusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 46, 80, -1));
        jPanel1.add(jPFcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 90, 80, -1));

        jLver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver_32px.png"))); // NOI18N
        jLver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLverMouseClicked(evt);
            }
        });
        jPanel1.add(jLver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 40));

        jLocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ocultar_32px.png"))); // NOI18N
        jLocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLocultarMouseClicked(evt);
            }
        });
        jPanel1.add(jLocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoGeneral.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, 110));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 130));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoGeneral.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        con = new Conexion(this.jTFusuario.getText(),String.copyValueOf(this.jPFcontraseña.getPassword()));
        Connection cn = con.conexion();
        if(cn != null){
            JOptionPane.showMessageDialog(null, "Base Conectada");
            this.setVisible(false);
            menu();
        }else{
            JOptionPane.showMessageDialog(null, "Base  No Conectada");
            this.jTFusuario.setText("");
            this.jPFcontraseña.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java programacion ii\\workspace2022-b\\proyecto\\Avance-Proyecto3\\src\\Imagen\\iconoLogin.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jLverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLverMouseClicked
        jLver.setVisible(false);
        jLocultar.setVisible(true);
        jPFcontraseña.setEchoChar((char)0);
    }//GEN-LAST:event_jLverMouseClicked

    private void jLocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLocultarMouseClicked
        jLver.setVisible(true);
        jLocultar.setVisible(false);
        jPFcontraseña.setEchoChar('*');
    }//GEN-LAST:event_jLocultarMouseClicked

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLocultar;
    private javax.swing.JLabel jLver;
    private javax.swing.JPasswordField jPFcontraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFusuario;
    // End of variables declaration//GEN-END:variables
}
