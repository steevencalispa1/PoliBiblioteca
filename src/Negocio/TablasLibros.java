package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author Steeven
 */
public class TablasLibros {

    
    public void mostrarTablaLibro(DefaultTableModel model ,JTable Libro){
        model.setRowCount(0);
        String sql = "select * from biblioteca.libro";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("Idlibro");
        model.addColumn("titulo");
        model.addColumn("autor");
        model.addColumn("numeroCopias");
        Libro.setModel(model);

        String [] datos = new String[4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
            Libro.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
    
    public void filtrarTabla(String dat, DefaultTableModel model ,JTable Libro){
        String sql = "select * from biblioteca.libro where titulo = '"+ dat +"'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("Idlibro");
        model.addColumn("titulo");
        model.addColumn("autor");
        model.addColumn("numeroCopias");
        Libro.setModel(model);
        
        String [] datos = new String[4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i=0; i<4; i++)
                    datos[i] = rs.getString(i+1);
                model.addRow(datos);
            }
            Libro.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        Libro.clearSelection();
    }
    
    public void resfrarTablaLibro(DefaultTableModel model, JTable Copias){
        String sql = "select Idlibro,titulo,numeroCopias from libro;";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("Idlibro");
        model.addColumn("titulo");
        model.addColumn("numeroCopias");
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
            Copias.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(TablasLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int numCopias(String dat){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root", "marlon2002");
        String sql="select numeroCopias from libro where Idlibro like " + dat;
        Statement st;
        ResultSet rs;
        String efecto = "";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int j=1; j<=1; j++)
                    efecto += rs.getString(j);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TablasLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Integer.parseInt(efecto);
    }

    public void prestar1(String valor){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root","marlon2002");
        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE `biblioteca`.`libro` SET `numeroCopias` = `numeroCopias` - '1' WHERE (`Idlibro` = '"+valor+"')");
            pps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TablasLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void devolver(String valor){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root","marlon2002");
        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE `biblioteca`.`libro` SET `numeroCopias` = `numeroCopias` + '1' WHERE (`Idlibro` = '"+valor+"')");
            pps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TablasLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean RegistroElminar(String dat){
        Conexion cone = new Conexion();
        Connection cn = cone.tablaConexion("root", "marlon2002");
        String sql = "SELECT * FROM biblioteca.estudiante_libro WHERE IdlibroP='" + dat + "'";
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
            System.out.println(ex);
        }
        return efecto=="";
    }   
}