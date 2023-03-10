package Vista;

import Negocio.Conexion;
import Negocio.TablaPrestamo;
import Negocio.TablasLibros;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Steeven
 */
public class JFPrestamo extends javax.swing.JFrame {

    Conexion cone = new Conexion();
    Connection cn = cone.tablaConexion("root", "marlon2002");
    DefaultTableModel model;
    String efecto1,efecto2;
    JFMenu menuGeneral;
    TablaPrestamo tabPrestamo = new TablaPrestamo();
    TablasLibros resta = new TablasLibros();
    TablasLibros sumar = new TablasLibros();
    TablaPrestamo llenar = new TablaPrestamo();
    TablasLibros numCopias = new TablasLibros();
    TablasLibros refrescarCopias = new TablasLibros();
    
    public JFPrestamo() {
        initComponents();
        this.setLocationRelativeTo(this);
        tabPrestamo.mostrarTablaPrestamo(model, Prestamo,jTFcodigoLibroPrestamo.getText());
        refrescarCopias.resfrarTablaLibro(model, Copias);
        this.jTFcodigoLibroPrestamo.setEditable(false);
        this.jTFcodigoEstudiantePrestamo.setEditable(false);
        this.jBrealizarDevolucion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jCBcodigoUnico = new javax.swing.JCheckBox();
        jCBnombres = new javax.swing.JCheckBox();
        jCBcedula = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCBelementoBuscarEstudiante = new javax.swing.JComboBox<>();
        jTFbusquedaEstudiante = new javax.swing.JTextField();
        jBbusacarRegistroEstudiantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAmostrarEstudiante = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCBcodigoLibro = new javax.swing.JCheckBox();
        jCBtitulo = new javax.swing.JCheckBox();
        jCBautor = new javax.swing.JCheckBox();
        jCBnumCopias = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jCBelementoBuscarLibro = new javax.swing.JComboBox<>();
        jTFbusquedaLibro = new javax.swing.JTextField();
        jBbusacarRegistroLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAmostrarLibro = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFcodigoEstudiantePrestamo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAcodigoEstudiante = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prestamo = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Copias = new javax.swing.JTable();
        jBrealizarDevolucion = new javax.swing.JButton();
        jLinformacion = new javax.swing.JLabel();
        jBrealizarPrestamo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAcodigoLibro = new javax.swing.JTextArea();
        jTFcodigoLibroPrestamo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        jCBcodigoUnico.setText("Codigo Unico");

        jCBnombres.setText("Nombres");

        jCBcedula.setText("Cedula");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCBcodigoUnico)
            .addComponent(jCBnombres)
            .addComponent(jCBcedula)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jCBcodigoUnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBnombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBcedula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        jCBelementoBuscarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigoUnico", "nombreEstudiante", "cedulaEstudiante" }));

        jBbusacarRegistroEstudiantes.setText("Buscar Registro");
        jBbusacarRegistroEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbusacarRegistroEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFbusquedaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jBbusacarRegistroEstudiantes)))
                .addGap(47, 47, 47))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jCBelementoBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBelementoBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFbusquedaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBbusacarRegistroEstudiantes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jTAmostrarEstudiante.setEditable(false);
        jTAmostrarEstudiante.setColumns(20);
        jTAmostrarEstudiante.setRows(5);
        jScrollPane1.setViewportView(jTAmostrarEstudiante);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 475, 104));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoPrestamo.png"))); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 360));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta Estudiante", jPanel1);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        jCBcodigoLibro.setText("Codigo Libro");

        jCBtitulo.setText("Titulo");

        jCBautor.setText("Autor");

        jCBnumCopias.setText("Numero Copias");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCBcodigoLibro)
            .addComponent(jCBtitulo)
            .addComponent(jCBautor)
            .addComponent(jCBnumCopias)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBcodigoLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBautor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCBnumCopias)
                .addContainerGap())
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        jCBelementoBuscarLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idlibro", "titulo", "autor" }));

        jBbusacarRegistroLibro.setText("Buscar Registro");
        jBbusacarRegistroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbusacarRegistroLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jTFbusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jCBelementoBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jBbusacarRegistroLibro)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBelementoBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFbusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBbusacarRegistroLibro)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jTAmostrarLibro.setEditable(false);
        jTAmostrarLibro.setColumns(20);
        jTAmostrarLibro.setRows(5);
        jScrollPane2.setViewportView(jTAmostrarLibro);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 523, 104));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoPrestamo.png"))); // NOI18N
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 360));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Libro", jPanel2);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Codigo Estudiante");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 20));
        jPanel8.add(jTFcodigoEstudiantePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 119, 20));

        jTAcodigoEstudiante.setEditable(false);
        jTAcodigoEstudiante.setColumns(20);
        jTAcodigoEstudiante.setRows(5);
        jScrollPane4.setViewportView(jTAcodigoEstudiante);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 357, 71));

        Prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrestamoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Prestamo);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 547, 100));

        Copias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Copias.setEnabled(false);
        jScrollPane6.setViewportView(Copias);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 210, 100));

        jBrealizarDevolucion.setText("Efectuar Devolucion");
        jBrealizarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrealizarDevolucionActionPerformed(evt);
            }
        });
        jPanel8.add(jBrealizarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLinformacion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLinformacion.setForeground(new java.awt.Color(255, 0, 0));
        jLinformacion.setText("Para devolver seleccione el prestamo");
        jPanel8.add(jLinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jBrealizarPrestamo.setText("Efectuar Prestamo");
        jBrealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrealizarPrestamoActionPerformed(evt);
            }
        });
        jPanel8.add(jBrealizarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jTAcodigoLibro.setEditable(false);
        jTAcodigoLibro.setColumns(20);
        jTAcodigoLibro.setRows(5);
        jScrollPane3.setViewportView(jTAcodigoLibro);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 380, 71));
        jPanel8.add(jTFcodigoLibroPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 87, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Codigo Libro");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 97, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoPrestamo.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 360));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Prestamo", jPanel3);

        jPanel9.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 790, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoPrestamo.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Regresar al Menu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbusacarRegistroEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbusacarRegistroEstudiantesActionPerformed
        ArrayList <String> atributosE = new ArrayList();
        String buscarE = "";
        int j;
        atributosE.add("codigoUnico");
        if(jCBnombres.isSelected())
            atributosE.add("nombreEstudiante");
        if(jCBcedula.isSelected())
            atributosE.add("cedulaEstudiante");
        
        Iterator e = atributosE.iterator();
        while(e.hasNext()){
            buscarE += e.next() + ",";
        }
        
        buscarE = buscarE.substring( 0, buscarE.length()-1);
        String atributoBuscar = jCBelementoBuscarEstudiante.getSelectedItem().toString();
        String requisito = "'" + jTFbusquedaEstudiante.getText() + "'";
        String sql="SELECT " + buscarE + " FROM biblioteca.estudiante WHERE " + atributoBuscar + " LIKE " + requisito;
        
        Statement st;
        ResultSet rs;
        efecto1 = "";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(j=1; j<=atributosE.size(); j++){
                    efecto1 += rs.getString(j) + "\t";
                }
            }
        } catch (SQLException busquedaError) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la busqueda " + busquedaError);
        }
        this.jTAmostrarEstudiante.setText(efecto1);
        tabPrestamo.mostrarTablaPrestamo(model, Prestamo,jTFcodigoLibroPrestamo.getText());
        StringTokenizer token = new StringTokenizer(efecto1,"\t");
        String codigoUnico = token.nextToken();
        this.jTFcodigoEstudiantePrestamo.setText(codigoUnico);
        this.jTAcodigoEstudiante.setText(efecto1);
    }//GEN-LAST:event_jBbusacarRegistroEstudiantesActionPerformed

    private void jBbusacarRegistroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbusacarRegistroLibroActionPerformed
        ArrayList <String> atributosL = new ArrayList();
        String buscarL = "";
        int j;
        atributosL.add("Idlibro");
        if(jCBtitulo.isSelected())
            atributosL.add("titulo");
        if(jCBautor.isSelected())
            atributosL.add("autor");
        if(jCBnumCopias.isSelected())
            atributosL.add("numeroCopias");
        
        Iterator l = atributosL.iterator();
        while(l.hasNext()){
            buscarL += l.next() + ",";
        }
        
        buscarL = buscarL.substring( 0, buscarL.length()-1);
        String atributoBuscar = jCBelementoBuscarLibro.getSelectedItem().toString();
        String requisito = "'" + jTFbusquedaLibro.getText() + "'";
        String sql="SELECT " + buscarL + " FROM biblioteca.libro WHERE " + atributoBuscar + " LIKE " + requisito;
        
        Statement st;
        ResultSet rs;
        efecto2 = "";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(j=1; j<=atributosL.size(); j++){
                    efecto2 += rs.getString(j) + "\t";
                }
            }
        } catch (SQLException busquedaError) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la busqueda " + busquedaError);
        }
        this.jTAmostrarLibro.setText(efecto2);
        tabPrestamo.mostrarTablaPrestamo(model, Prestamo,jTFcodigoLibroPrestamo.getText());
        StringTokenizer token= new StringTokenizer(efecto2,"\t");
        String codigolibro=token.nextToken();
        this.jTFcodigoLibroPrestamo.setText(codigolibro);
        this.jTAcodigoLibro.setText(efecto2);
    }//GEN-LAST:event_jBbusacarRegistroLibroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        menuGeneral = new JFMenu();
        this.setVisible(false);
        this.menuGeneral.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int opc = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de salir del Prestamo?",
                "Alerta!", 
                JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java programacion ii\\workspace2022-b\\proyecto\\Avance-Proyecto3\\src\\Imagen\\iconoPrestamo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void jBrealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrealizarPrestamoActionPerformed
        String sql = "select max(IdPrestamo) from biblioteca.estudiante_libro";
        Statement st;
        ResultSet rs;
        String efecto = "0";
        int opc = JOptionPane.showConfirmDialog(null,
            "¿Esta seguro de agregar prestamo?", "Alerta",JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            //if(menosCero.numCopias(jTFcodigoLibroPrestamo.getText()) != 0 ){
                if(jTFcodigoLibroPrestamo.getText().equals("") || jTFcodigoEstudiantePrestamo.getText().equals("")){
                JOptionPane.showMessageDialog(null,
                    "No se puede dejar campos vacios, por favor ingrese datos",
                    "Alerta!", JOptionPane.ERROR_MESSAGE);
            }else{
                try {
                    st = cn.createStatement();
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                        efecto += rs.getString(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFPrestamo.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("No se encontro");
                }
                int auxPrestamo = 1 + Integer.parseInt(efecto);
                
                try {
                    if(numCopias.numCopias(jTFcodigoLibroPrestamo.getText())!=0){
                        PreparedStatement pps = cn.prepareStatement(
                        "insert into estudiante_libro(IdPrestamo,codigoUnicoP,IdlibroP) values (?,?,?)");
                        pps.setInt(1, auxPrestamo);
                        pps.setString(2, jTFcodigoEstudiantePrestamo.getText());
                        pps.setString(3, jTFcodigoLibroPrestamo.getText());
                        pps.executeUpdate();
                        resta.prestar1(jTFcodigoLibroPrestamo.getText());
                        JOptionPane.showMessageDialog(null, "Datos Gurdados Correctamente",
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Nohay copias disponibles");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFPrestamo.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al Ingresar los datos");
                }
                tabPrestamo.mostrarTablaPrestamo(model, Prestamo,jTFcodigoLibroPrestamo.getText());
                jTFcodigoLibroPrestamo.setText("");
                jTFcodigoEstudiantePrestamo.setText("");

            }
        }else if(opc == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Guardado Cancelado",
                "Alerta", JOptionPane.ERROR_MESSAGE);
            jTFcodigoLibroPrestamo.setText("");
            jTFcodigoEstudiantePrestamo.setText("");
        }
        refrescarCopias.resfrarTablaLibro(model, Copias);
        Prestamo.clearSelection();
    }//GEN-LAST:event_jBrealizarPrestamoActionPerformed

    private void jBrealizarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrealizarDevolucionActionPerformed
        int fila = Prestamo.getSelectedRow();
        String valor = Prestamo.getValueAt(fila, 0).toString();
        if(fila < 0){
            JOptionPane.showMessageDialog(null,
                "Nose ha selecionado el Prestamo a eliminar, seleciones uno porfavor",
                "Aviso", JOptionPane.OK_OPTION);
        }else{
            int opc = JOptionPane.showConfirmDialog(null,
                "¿Esta seguro de devolver el siguiente libro?",
                "Alerta!", JOptionPane.YES_NO_OPTION);
            if(opc == JOptionPane.YES_OPTION){
                try {
                    PreparedStatement pps = cn.prepareStatement("delete from estudiante_libro where IdPrestamo='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Libro Devuelto",
                        "Devolucion", JOptionPane.OK_OPTION);
                    sumar.devolver(this.jTFcodigoLibroPrestamo.getText());
                    tabPrestamo.mostrarTablaPrestamo(model, Prestamo, jTFcodigoLibroPrestamo.getText());
                    jTFcodigoLibroPrestamo.setText("");
                    jTFcodigoEstudiantePrestamo.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(JFPrestamo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Devolucion cancelada",
                    "Alerta", JOptionPane.OK_OPTION);
                jTFcodigoLibroPrestamo.setText("");
                jTFcodigoEstudiantePrestamo.setText("");
            }
            refrescarCopias.resfrarTablaLibro(model, Copias);
            Prestamo.clearSelection();
        }
    }//GEN-LAST:event_jBrealizarDevolucionActionPerformed

    private void PrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamoMouseClicked
        DefaultTableModel tablaPrestamo = (DefaultTableModel) Prestamo.getModel();
        int SelectRowns = Prestamo.getSelectedRow();
        this.jBrealizarDevolucion.setVisible(true);
        this.jTFcodigoEstudiantePrestamo.setText(tablaPrestamo.getValueAt(SelectRowns, 1).toString());
        llenar.llenarSeleccionEstudiante(jTFcodigoEstudiantePrestamo.getText(), this.jTAcodigoEstudiante);
        this.jTFcodigoLibroPrestamo.setText(tablaPrestamo.getValueAt(SelectRowns, 2).toString());
        llenar.llenarSeleccionLibro(jTFcodigoLibroPrestamo.getText(), this.jTAcodigoLibro);
    }//GEN-LAST:event_PrestamoMouseClicked

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
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Copias;
    public javax.swing.JTable Prestamo;
    private javax.swing.JButton jBbusacarRegistroEstudiantes;
    private javax.swing.JButton jBbusacarRegistroLibro;
    private javax.swing.JButton jBrealizarDevolucion;
    private javax.swing.JButton jBrealizarPrestamo;
    private javax.swing.JCheckBox jCBautor;
    private javax.swing.JCheckBox jCBcedula;
    private javax.swing.JCheckBox jCBcodigoLibro;
    private javax.swing.JCheckBox jCBcodigoUnico;
    private javax.swing.JComboBox<String> jCBelementoBuscarEstudiante;
    private javax.swing.JComboBox<String> jCBelementoBuscarLibro;
    private javax.swing.JCheckBox jCBnombres;
    private javax.swing.JCheckBox jCBnumCopias;
    private javax.swing.JCheckBox jCBtitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLinformacion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTAcodigoEstudiante;
    private javax.swing.JTextArea jTAcodigoLibro;
    private javax.swing.JTextArea jTAmostrarEstudiante;
    private javax.swing.JTextArea jTAmostrarLibro;
    private javax.swing.JTextField jTFbusquedaEstudiante;
    private javax.swing.JTextField jTFbusquedaLibro;
    private javax.swing.JTextField jTFcodigoEstudiantePrestamo;
    private javax.swing.JTextField jTFcodigoLibroPrestamo;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
