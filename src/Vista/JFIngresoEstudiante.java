package Vista;

import Negocio.Conexion;
import Negocio.TablaEstudiantes;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/*
 * @author Steeven
 */
public class JFIngresoEstudiante extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection cn = cone.tablaConexion("root", "marlon2002");
    DefaultTableModel model;
    TablaEstudiantes tabEstudiantes = new TablaEstudiantes();
    JFMenu menuGeneral;

    public JFIngresoEstudiante() {
        initComponents();
        this.setLocationRelativeTo(this);
        model = new DefaultTableModel();
        tabEstudiantes.mostrarTablaEstudiante(model, Estudiante);
        this.jLindicacionfiltrar.setVisible(false);
        this.jBactualizazr.setVisible(false);
        this.jBeliminar.setVisible(false);
        this.jTFnombreFiltrar.setVisible(false);
        this.jLseleccionado.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFcodigo = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jTFcedula = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jBactualizazr = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLindicacionfiltrar = new javax.swing.JLabel();
        jTFnombreFiltrar = new javax.swing.JTextField();
        jBfiltrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLseleccionado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Estudiante = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jregresar = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registri Estudiante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Estudiantes"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo Unico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setText("Nombre y Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jTFcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFcodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jTFcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 100, -1));

        jTFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, -1));

        jTFcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jTFcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, -1));

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 45, 82, -1));

        jBactualizazr.setText("Actualizar");
        jBactualizazr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizazrActionPerformed(evt);
            }
        });
        jPanel1.add(jBactualizazr, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 127, -1, -1));

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 165, 82, -1));

        jLindicacionfiltrar.setForeground(new java.awt.Color(255, 0, 0));
        jLindicacionfiltrar.setText("Para eliminar y actualizar primero Filtrar");
        jPanel1.add(jLindicacionfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 168, -1, -1));

        jTFnombreFiltrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtar Estudiante"));
        jTFnombreFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFnombreFiltrarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnombreFiltrarKeyTyped(evt);
            }
        });
        jPanel1.add(jTFnombreFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 194, 120, -1));

        jBfiltrar.setText("Filtrar ");
        jBfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 86, 82, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoGeneralEstudiante.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 240));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 480, 240));

        jLseleccionado.setForeground(new java.awt.Color(255, 0, 0));
        jLseleccionado.setText("(Para eliminar o actualizar selecionar)");
        jPanel2.add(jLseleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        Estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstudianteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Estudiante);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 515, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoGeneralEstudiante.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 490));

        jMSalir.setText("Opciones");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMSalir.add(jMenuItem1);

        jregresar.setText("Regresar Menu");
        jregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregresarActionPerformed(evt);
            }
        });
        jMSalir.add(jregresar);

        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int opc = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de salir del registro Estudiantil?",
                "Alerta!", 
                JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de guardar al estudiante?", "Alerta",JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            if(jTFcodigo.getText().equals("") || jTFnombre.getText().equals("") || jTFcedula.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No se puede dejar campos vasios, por favor ingrese datos", "Alerta!", JOptionPane.ERROR_MESSAGE);
            }else{
                try {
                    PreparedStatement pps = (PreparedStatement) cn.prepareStatement(
                            "INSERT INTO estudiante(codigoUnico,nombreEstudiante,cedulaEstudiante) VALUES(?,?,?)");
                    pps.setString(1, jTFcodigo.getText());
                    pps.setString(2, jTFnombre.getText());
                    pps.setString(3, jTFcedula.getText());

                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro Guardado",
                            "Registro", JOptionPane.INFORMATION_MESSAGE);
                    tabEstudiantes.mostrarTablaEstudiante(model, Estudiante);
                    this.jLindicacionfiltrar.setVisible(true);
                    this.jTFnombreFiltrar.setVisible(true);
                    this.jTFnombreFiltrar.setVisible(false);
                    this.jLindicacionfiltrar.setVisible(false);
                } catch (SQLException ex) {
                    //Logger.getLogger(JFIngresoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Registro No Guardado\nEl Codigo Unico ya existe",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                jTFcodigo.setText("");
                jTFnombre.setText("");
                jTFcedula.setText("");
            }
        }else if(opc == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Guardado Cancelado", 
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            jTFcodigo.setText("");
            jTFnombre.setText("");
            jTFcedula.setText("");
        }
        Estudiante.clearSelection();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void EstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstudianteMouseClicked
        DefaultTableModel tablaRegistroEstudiantil = (DefaultTableModel) Estudiante.getModel();
        int SelectRowns = Estudiante.getSelectedRow();
        this.jTFcodigo.setEditable(false);
        jTFcodigo.setText(tablaRegistroEstudiantil.getValueAt(SelectRowns, 0).toString());
        this.jTFnombre.setEditable(true);
        jTFnombre.setText(tablaRegistroEstudiantil.getValueAt(SelectRowns, 1).toString());
        this.jTFcedula.setEditable(false);
        jTFcedula.setText(tablaRegistroEstudiantil.getValueAt(SelectRowns, 2).toString());
        this.jBactualizazr.setVisible(true);
        this.jBeliminar.setVisible(true);
    }//GEN-LAST:event_EstudianteMouseClicked

    private void jBactualizazrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizazrActionPerformed
        int fila = Estudiante.getSelectedRow();
        String valor = Estudiante.getValueAt(fila, 0).toString();
        if(jTFcodigo.getText().equals("") || jTFnombre.getText().equals("") ||
                jTFcedula.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                    "No se puede dejar campos vacios, por favor ingrese datos", 
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
        }else{
            int opc=JOptionPane.showConfirmDialog(null, 
                    "¿Estas seguro de actualizar el sigueinte registro?", 
                    "Alerta", JOptionPane.YES_NO_OPTION);
            if(opc == JOptionPane.YES_OPTION){
                try {
                    PreparedStatement pps = cn.prepareStatement(
                            "UPDATE `biblioteca`.`estudiante` SET `codigoUnico` = '"+jTFcodigo.getText()
                            + "', `nombreEstudiante` = '"+jTFnombre.getText()+ "', `cedulaEstudiante` = '"
                            +jTFcedula.getText()+ "' WHERE (`codigoUnico` = '"+valor+ "');");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Dato Actualizado");
                    tabEstudiantes.mostrarTablaEstudiante(model, Estudiante);
                    this.jTFcodigo.setEditable(true);
                    this.jTFcedula.setEditable(true);
                    this.jTFnombreFiltrar.setVisible(false);
                    //
                    this.jBactualizazr.setVisible(false);
                    this.jBeliminar.setVisible(false);
                    this.jLindicacionfiltrar.setVisible(false);
                    this.jLseleccionado.setVisible(false);
                    
                    jTFcodigo.setText("");
                    jTFnombre.setText("");
                    jTFcedula.setText("");
                    jTFnombreFiltrar.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(JFIngresoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Actualizacion cancelada", 
                        "Alerta!", JOptionPane.OK_OPTION);
                jTFcodigo.setText("");
                jTFnombre.setText("");
                jTFcedula.setText("");
            }
            Estudiante.clearSelection();
        }
    }//GEN-LAST:event_jBactualizazrActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int fila = Estudiante.getSelectedRow();
        String valor = Estudiante.getValueAt(fila, 0).toString();
        if(fila < 0){
            JOptionPane.showMessageDialog(null, 
                    "Nose ha selecionado el Estudainte a eliminar, seleciones uno porfavor", 
                    "Aviso", JOptionPane.OK_OPTION);
        }else{
            int opc = JOptionPane.showConfirmDialog(null, 
                    "¿Esta seguro de elliminar al siguiente estudiante?", 
                    "Alerta!", JOptionPane.YES_NO_OPTION);
            if(opc == JOptionPane.YES_NO_OPTION){
                try {
                    PreparedStatement pps = cn.prepareStatement(
                            "DELETE FROM `biblioteca`.`estudiante` WHERE (`codigoUnico` = '"+valor+"');");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Estudiante Eliminado", 
                            "Eliminacion", JOptionPane.OK_OPTION);
                    tabEstudiantes.mostrarTablaEstudiante(model, Estudiante);
                    jTFnombreFiltrar.setText("");
                    this.jTFcodigo.setEditable(true);
                    this.jTFcedula.setEditable(true);
                    this.jTFnombreFiltrar.setVisible(false);
                    //
                    this.jBactualizazr.setVisible(false);
                    this.jBeliminar.setVisible(false);
                    this.jLindicacionfiltrar.setVisible(false);
                    this.jLseleccionado.setVisible(false);
                    
                    jTFcodigo.setText("");
                    jTFnombre.setText("");
                    jTFcedula.setText("");
                    jTFnombreFiltrar.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(JFIngresoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Eliminacion cancelada", 
                        "Alerta", JOptionPane.OK_OPTION);
                jTFcodigo.setText("");
                jTFnombre.setText("");
                jTFcedula.setText("");
            }
            Estudiante.clearSelection();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregresarActionPerformed
        menuGeneral = new JFMenu();
        this.setVisible(false);
        this.menuGeneral.setVisible(true);
    }//GEN-LAST:event_jregresarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java programacion ii\\workspace2022-b\\proyecto\\Avance-Proyecto3\\src\\Imagen\\iconoRegistroEstudiante.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jTFnombreFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombreFiltrarKeyReleased
        tabEstudiantes.filtrarTabla(jTFnombreFiltrar.getText(), model, Estudiante);
    }//GEN-LAST:event_jTFnombreFiltrarKeyReleased

    private void jBfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarActionPerformed
        this.jLindicacionfiltrar.setVisible(true);
        this.jTFnombreFiltrar.setVisible(true);
        this.jLseleccionado.setVisible(true);
        
        this.jTFcodigo.setEditable(false);
        this.jTFnombre.setEditable(false);
        this.jTFcedula.setEditable(false);
    }//GEN-LAST:event_jBfiltrarActionPerformed

    private void jTFcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcodigoKeyTyped
        char letra=evt.getKeyChar();
        if(Character.isLetter(letra)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFcodigo.setText("");
        }
    }//GEN-LAST:event_jTFcodigoKeyTyped

    private void jTFnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombreKeyTyped
        char num=evt.getKeyChar();
        if(!Character.isLetter(num) && num!=KeyEvent.VK_SPACE && num!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFnombre.setText("");
        }
    }//GEN-LAST:event_jTFnombreKeyTyped

    private void jTFcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcedulaKeyTyped
        char letra=evt.getKeyChar();
        if(Character.isLetter(letra)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFcedula.setText("");
        }
    }//GEN-LAST:event_jTFcedulaKeyTyped

    private void jTFcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcodigoKeyReleased
        Pattern pat=Pattern.compile("[1-9]{1,6}");
        Matcher mat=pat.matcher(jTFcodigo.getText());
        if(mat.matches() == false){
            JOptionPane.showMessageDialog(null, "Maximo 6 digitos");
            this.jTFcodigo.setText("");
        }
    }//GEN-LAST:event_jTFcodigoKeyReleased

    private void jTFcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcedulaKeyReleased
        Pattern pat=Pattern.compile("[1-9]{1,10}");
        Matcher mat=pat.matcher(jTFcedula.getText());
        if(mat.matches() == false){
            JOptionPane.showMessageDialog(null, "Maximo 10 digitos");
            this.jTFcedula.setText("");
        }
    }//GEN-LAST:event_jTFcedulaKeyReleased

    private void jTFnombreFiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombreFiltrarKeyTyped
        char num=evt.getKeyChar();
        if(!Character.isLetter(num) && num!=KeyEvent.VK_SPACE && num!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFnombreFiltrar.setText("");
        }
    }//GEN-LAST:event_jTFnombreFiltrarKeyTyped

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
            java.util.logging.Logger.getLogger(JFIngresoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIngresoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIngresoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngresoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIngresoEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Estudiante;
    private javax.swing.JButton jBactualizazr;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBfiltrar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLindicacionfiltrar;
    private javax.swing.JLabel jLseleccionado;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFcedula;
    private javax.swing.JTextField jTFcodigo;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFnombreFiltrar;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem jregresar;
    // End of variables declaration//GEN-END:variables

}
