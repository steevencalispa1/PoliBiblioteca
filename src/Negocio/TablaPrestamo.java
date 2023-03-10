package Negocio;

import Vista.JFPrestamo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/*
 * @author Steeven
 */
public class TablaPrestamo {
    
    public void mostrarTablaPrestamo(DefaultTableModel model ,JTable Prestamo,String dato){
        String sql = "select * from biblioteca.estudiante_libro";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("IdPrestamo");
        model.addColumn("codigoUnicoP");
        model.addColumn("IdlibroP");
        Prestamo.setModel(model);

        String [] datos = new String[3];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }
            Prestamo.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
    
    public void llenarSeleccionLibro(String dat, JTextArea jTAcodigoLibro){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root", "marlon2002");
        String sql = "SELECT * FROM biblioteca.libro WHERE Idlibro LIKE '" + dat + "'";
        Statement st;
        ResultSet rs;
        String efecto = "";
        int j;

        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(j=1; j <= 4; j++)
                efecto += rs.getString(j) + "\t";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        jTAcodigoLibro.setText(efecto);
    }
    
    public void llenarSeleccionEstudiante(String dat, JTextArea jTAcodigoEstudiante){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root", "marlon2002");
        String sql = "SELECT * FROM biblioteca.estudiante WHERE codigoUnico LIKE '" + dat + "'";
        Statement st;
        ResultSet rs;
        String efecto = "";
        int j;

        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(j=1; j <= 3; j++)
                efecto += rs.getString(j) + "\t";
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ocurrio un error en la busqueda " + ex);
        }
        jTAcodigoEstudiante.setText(efecto);
    }  
}