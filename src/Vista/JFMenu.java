package Vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * @author Steeven
 */
public class JFMenu extends javax.swing.JFrame {

    JFIngresoEstudiante ingresoEstudiante;
    JFIngresoLibros ingresoLibro;
    JFPrestamo prestamo;    
    
    public JFMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.ingresoEstudiante = new JFIngresoEstudiante();
        this.ingresoLibro = new JFIngresoLibros();
        this.prestamo = new JFPrestamo();
        //boton de accseo a los formularios de registro
        //resgitro Estudiantes
        jBregistroEstudiante.setIcon(
                setIcono("/imagen/iconoBotonEstudiante.png",
                jBregistroEstudiante));
        jBregistroEstudiante.setPressedIcon(
                setIconoPresionado("/imagen/iconoBotonEstudiante.png",
                jBregistroLibro, 15, 20));
        //registro Libro
        jBregistroLibro.setIcon(
                setIcono("/imagen/iconoBotonLibro.png",
                jBregistroLibro));
        jBregistroLibro.setPressedIcon(
                setIconoPresionado("/imagen/iconoBotonLibro.png", 
                jBregistroLibro, 15, 20));
        //Prestamo
        jBPrestamo.setIcon(setIcono("/imagen/iconoBotonPrestamo.png", jBPrestamo));
        jBPrestamo.setPressedIcon(setIconoPresionado("/imagen/iconoBotonPrestamo.png", 
                jBPrestamo, 15, 20));
    }
    
    public Icon setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(
                ancho,
                alto,
                Image.SCALE_DEFAULT));
        
        return icono;
    }
    
    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int heigth = boton.getHeight() - altura;
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(
                width, 
                heigth, 
                Image.SCALE_DEFAULT));
        
        return icono;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmenu = new javax.swing.JPanel();
        jBregistroEstudiante = new javax.swing.JButton();
        jBregistroLibro = new javax.swing.JButton();
        jBPrestamo = new javax.swing.JButton();
        jBsalirRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Biblioteca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBregistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistroEstudianteActionPerformed(evt);
            }
        });
        jPmenu.add(jBregistroEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 172, 152));

        jBregistroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistroLibroActionPerformed(evt);
            }
        });
        jPmenu.add(jBregistroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 161, 152));

        jBPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrestamoActionPerformed(evt);
            }
        });
        jPmenu.add(jBPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 239, 84));

        jBsalirRegistro.setFont(new java.awt.Font("Algerian", 3, 14)); // NOI18N
        jBsalirRegistro.setForeground(new java.awt.Color(0, 0, 255));
        jBsalirRegistro.setText("Salir del Registro");
        jBsalirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirRegistroActionPerformed(evt);
            }
        });
        jPmenu.add(jBsalirRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 48));

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel2.setText("Bienvenidos PoliBiblioteca");
        jPmenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/escudo.png"))); // NOI18N
        jPmenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, 110));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoMenu.png"))); // NOI18N
        jPmenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 680, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBregistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistroEstudianteActionPerformed
        this.ingresoEstudiante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBregistroEstudianteActionPerformed

    private void jBregistroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistroLibroActionPerformed
        this.ingresoLibro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBregistroLibroActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java programacion ii\\workspace2022-b\\proyecto\\Avance-Proyecto3\\src\\Imagen\\iconoMenu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jBsalirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirRegistroActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirRegistroActionPerformed

    private void jBPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrestamoActionPerformed
        this.prestamo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBPrestamoActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPrestamo;
    private javax.swing.JButton jBregistroEstudiante;
    private javax.swing.JButton jBregistroLibro;
    private javax.swing.JButton jBsalirRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPmenu;
    // End of variables declaration//GEN-END:variables
}
