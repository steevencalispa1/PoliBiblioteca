package Vista;

import Negocio.Conexion;
import Negocio.TablasLibros;
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
import javax.swing.JTable;

/*
 * @author Steeven
 */
public class JFIngresoLibros extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection cn = cone.tablaConexion("root", "marlon2002");
    DefaultTableModel model;
    TablasLibros tablibro = new TablasLibros();
    TablasLibros eliminar = new TablasLibros();
    
    JFMenu menuGeneral;
    
    public JFIngresoLibros() {
        initComponents();
        this.setLocationRelativeTo(this);
        model = new DefaultTableModel();
        tablibro.mostrarTablaLibro(model, Libro);
        this.jLindicacionfiltrar.setVisible(false);
        this.jBsctualizar.setVisible(false);
        this.jBeliminar.setVisible(false);
        
        this.jTFtituloFiltrar.setVisible(false);
        this.jTFtituloFiltrar.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jTFcodigoLibro = new javax.swing.JTextField();
        jTFtitulo = new javax.swing.JTextField();
        jTFautor = new javax.swing.JTextField();
        jTFnumCopias = new javax.swing.JTextField();
        jBGuardado = new javax.swing.JButton();
        jBsctualizar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLindicacionfiltrar = new javax.swing.JLabel();
        jTFtituloFiltrar = new javax.swing.JTextField();
        jBfiltrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLseleccionar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Libro = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMregreso = new javax.swing.JMenuItem();

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
        setTitle("Registro Libros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Libros"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo Unico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setText("Titulo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("Autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setText(" Numero Copias");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jTFcodigoLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFcodigoLibroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcodigoLibroKeyTyped(evt);
            }
        });
        jPanel1.add(jTFcodigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 100, -1));
        jPanel1.add(jTFtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));
        jPanel1.add(jTFautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, -1));

        jTFnumCopias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnumCopiasKeyTyped(evt);
            }
        });
        jPanel1.add(jTFnumCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, -1));

        jBGuardado.setText("Guardar");
        jBGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardadoActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 49, 82, -1));

        jBsctualizar.setText("Actualizar");
        jBsctualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsctualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBsctualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 126, -1, -1));

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 161, 82, -1));

        jLindicacionfiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLindicacionfiltrar.setForeground(new java.awt.Color(255, 0, 0));
        jLindicacionfiltrar.setText("Para eliminar y actualizar primero Filtrar");
        jPanel1.add(jLindicacionfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 20));

        jTFtituloFiltrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtar Libro"));
        jTFtituloFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFtituloFiltrarKeyReleased(evt);
            }
        });
        jPanel1.add(jTFtituloFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 120, -1));

        jBfiltrar.setText("Filtrar");
        jBfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBfiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 82, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoLibro.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 440, 230));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 440, 250));

        jLseleccionar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLseleccionar.setForeground(new java.awt.Color(255, 0, 0));
        jLseleccionar.setText("(Para eliminar o actualizar selecionar)");
        jPanel2.add(jLseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        Libro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Libro);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 441, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoLibro.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 540, 530));

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMregreso.setText("Regresar Menu");
        jMregreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregresoActionPerformed(evt);
            }
        });
        jMenu1.add(jMregreso);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int opc = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de salir del registro Libros?",
                "Alerta!", 
                JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardadoActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, 
                "¿Esta seguro de guardar al Libro?", "Alerta",JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            if(jTFcodigoLibro.getText().equals("") || jTFtitulo.getText().equals("") 
                    || jTFautor.getText().equals("") || jTFnumCopias.getText().equals("")){
                JOptionPane.showMessageDialog(null, 
                        "No se puede dejar campos vacios, por favor ingrese datos", 
                        "Alerta!", JOptionPane.ERROR_MESSAGE);
            }else{
                
                try {
                    PreparedStatement pps = (PreparedStatement) cn.prepareStatement(
                            "insert into libro(Idlibro,titulo,autor,numeroCopias) values(?,?,?,?)");
                    pps.setString(1, jTFcodigoLibro.getText());
                    pps.setString(2, jTFtitulo.getText());
                    pps.setString(3, jTFautor.getText());
                    pps.setString(4, jTFnumCopias.getText());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, 
                            "Registro Guardado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    tablibro.mostrarTablaLibro(model, Libro);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Registro No guardado\nEl Codigo Libro ya existe",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
                jTFcodigoLibro.setText("");
                jTFtitulo.setText("");
                jTFautor.setText("");
                jTFnumCopias.setText("");
            }
        }else if(opc == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Guardado Cancelado", 
                    "Alerta", JOptionPane.OK_OPTION);
            jTFcodigoLibro.setText("");
            jTFtitulo.setText("");
            jTFautor.setText("");
            jTFnumCopias.setText("");
        }
        Libro.clearSelection();
    }//GEN-LAST:event_jBGuardadoActionPerformed

    private void LibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibroMouseClicked
        DefaultTableModel tablaRegistroLibro = (DefaultTableModel) Libro.getModel();
        int SelecRowns = Libro.getSelectedRow();
        this.jTFcodigoLibro.setEditable(false);
        jTFcodigoLibro.setText(tablaRegistroLibro.getValueAt(SelecRowns, 0).toString());
        this.jTFtitulo.setEditable(true);
        jTFtitulo.setText(tablaRegistroLibro.getValueAt(SelecRowns, 1).toString());
        this.jTFautor.setEditable(true);
        jTFautor.setText(tablaRegistroLibro.getValueAt(SelecRowns, 2).toString());
        this.jTFnumCopias.setEditable(true);
        jTFnumCopias.setText(tablaRegistroLibro.getValueAt(SelecRowns, 3).toString());
        this.jBsctualizar.setVisible(true);
        this.jBeliminar.setVisible(true);
    }//GEN-LAST:event_LibroMouseClicked

    private void jBsctualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsctualizarActionPerformed
        int fila = Libro.getSelectedRow();
        String valor = Libro.getValueAt(fila, 0).toString();
        
        if(jTFcodigoLibro.getText().equals("") || jTFtitulo.getText().equals("") 
                || jTFautor.getText().equals("") || jTFnumCopias.getText().equals("")){
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
                            "UPDATE `biblioteca`.`libro` SET `Idlibro` = '"
                            +jTFcodigoLibro.getText()+ "', `titulo` = '"+jTFtitulo.getText()
                            + "', `autor` = '"+jTFautor.getText()+ "', `numeroCopias` = '"
                            +jTFnumCopias.getText()+ "' WHERE (`Idlibro` = '"+valor+ "');");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Dato Actualizado");
                    //mostrarTabla(Libro);
                    tablibro.mostrarTablaLibro(model, Libro);
                    this.jBsctualizar.setVisible(false);
                    this.jBeliminar.setVisible(false);
                    this.jLindicacionfiltrar.setVisible(false);
                    this.jLseleccionar.setVisible(false);
                    this.jTFtituloFiltrar.setVisible(false);
                    
                    this.jTFcodigoLibro.setEditable(true);
                    this.jTFtitulo.setEditable(true);
                    this.jTFautor.setEditable(true);
                    this.jTFnumCopias.setEditable(true);
                    
                    jTFcodigoLibro.setText("");
                    jTFtitulo.setText("");
                    jTFautor.setText("");
                    jTFnumCopias.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(JFIngresoLibros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Actualizacion cancelada",
                        "Alerta!", JOptionPane.OK_OPTION);
                jTFcodigoLibro.setText("");
                jTFtitulo.setText("");
                jTFautor.setText("");
                jTFnumCopias.setText("");
            }
            Libro.clearSelection();
        }
    }//GEN-LAST:event_jBsctualizarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int fila = Libro.getSelectedRow();
        String valor = Libro.getValueAt(fila, 0).toString();
        //menosCero.numCopias(jTFcodigoLibro.getText());
        if(fila < 0){
            JOptionPane.showMessageDialog(null, 
                    "Nose ha selecionado el Libro a eliminar, seleciones uno porfavor", 
                    "Aviso", JOptionPane.OK_OPTION);
        }else{
            int opc = JOptionPane.showConfirmDialog(null, 
                    "¿Esta seguro de elliminar al siguiente libro?", 
                    "Alerta!", JOptionPane.YES_NO_OPTION);
            if(opc == JOptionPane.YES_OPTION){
                try {
                    if(eliminar.RegistroElminar(jTFcodigoLibro.getText())==true){
                    PreparedStatement pps = cn.prepareStatement("delete from libro where Idlibro='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Libro Eliminado", 
                            "Eliminacion", JOptionPane.OK_OPTION);
                    tablibro.mostrarTablaLibro(model, Libro);
                    this.jBsctualizar.setVisible(false);
                    this.jBeliminar.setVisible(false);
                    this.jLindicacionfiltrar.setVisible(false);
                    this.jLseleccionar.setVisible(false);
                    this.jTFtituloFiltrar.setVisible(false);

                    this.jTFcodigoLibro.setEditable(true);
                    this.jTFtitulo.setEditable(true);
                    this.jTFautor.setEditable(true);
                    this.jTFnumCopias.setEditable(true);

                    jTFcodigoLibro.setText("");
                    jTFtitulo.setText("");
                    jTFautor.setText("");
                    jTFnumCopias.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "El libro "+this.jTFtitulo.getText()+" tiene prestamos realziados no se puede eliminar");
                        this.jTFcodigoLibro.setEditable(true);
                        this.jTFcodigoLibro.setText("");
                        this.jTFtitulo.setEditable(true);
                        this.jTFtitulo.setText("");
                        this.jTFautor.setEditable(true);
                        this.jTFautor.setText("");
                        this.jTFnumCopias.setEditable(true);
                        this.jTFnumCopias.setText("");
                        this.jTFcodigoLibro.setEditable(true);
                        this.jBsctualizar.setVisible(false);
                        this.jBeliminar.setVisible(false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFIngresoLibros.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }else{
                JOptionPane.showMessageDialog(null, "Eliminacion cancelada", 
                        "Alerta", JOptionPane.OK_OPTION);
                jTFcodigoLibro.setText("");
                jTFtitulo.setText("");
                jTFautor.setText("");
                jTFnumCopias.setText("");
                this.jTFcodigoLibro.setEditable(true);
            }
            Libro.clearSelection();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jMregresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregresoActionPerformed
        menuGeneral = new JFMenu();
        this.setVisible(false);
        this.menuGeneral.setVisible(true);
    }//GEN-LAST:event_jMregresoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java programacion ii\\workspace2022-b\\proyecto\\Avance-Proyecto3\\src\\Imagen\\iconoRegistroLibro.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jTFtituloFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFtituloFiltrarKeyReleased
        tablibro.filtrarTabla(jTFtituloFiltrar.getText(), model, Libro);
    }//GEN-LAST:event_jTFtituloFiltrarKeyReleased

    private void jBfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarActionPerformed
        this.jLindicacionfiltrar.setVisible(true);
        this.jTFtituloFiltrar.setVisible(true);
        this.jLseleccionar.setVisible(true);
        
        this.jTFcodigoLibro.setEditable(false);
        this.jTFtitulo.setEditable(false);
        this.jTFautor.setEditable(false);
        this.jTFnumCopias.setEditable(false);
    }//GEN-LAST:event_jBfiltrarActionPerformed

    private void jTFcodigoLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcodigoLibroKeyTyped
        char letra=evt.getKeyChar();
        if(Character.isLetter(letra)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFcodigoLibro.setText("");
        }
    }//GEN-LAST:event_jTFcodigoLibroKeyTyped

    private void jTFcodigoLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcodigoLibroKeyReleased
        Pattern pat = Pattern.compile("[1-9]{1,4}");
        Matcher mat = pat.matcher(jTFcodigoLibro.getText());
        if(mat.matches() == false){
            JOptionPane.showMessageDialog(null, "Solo 4 digitos");
            this.jTFcodigoLibro.setText("");
        }
    }//GEN-LAST:event_jTFcodigoLibroKeyReleased

    private void jTFnumCopiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnumCopiasKeyTyped
        char letra=evt.getKeyChar();
        if(Character.isLetter(letra)){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.jTFnumCopias.setText("");
        }
    }//GEN-LAST:event_jTFnumCopiasKeyTyped

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
            java.util.logging.Logger.getLogger(JFIngresoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIngresoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIngresoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngresoLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIngresoLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Libro;
    private javax.swing.JButton jBGuardado;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBfiltrar;
    private javax.swing.JButton jBsctualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLindicacionfiltrar;
    private javax.swing.JLabel jLseleccionar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMregreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFautor;
    private javax.swing.JTextField jTFcodigoLibro;
    private javax.swing.JTextField jTFnumCopias;
    private javax.swing.JTextField jTFtitulo;
    private javax.swing.JTextField jTFtituloFiltrar;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void mostrarTabla(JTable Libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
