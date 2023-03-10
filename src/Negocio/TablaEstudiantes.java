package Negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author Steeven
 */
public class TablaEstudiantes {
    
    public void mostrarTablaEstudiante(DefaultTableModel model ,JTable Estudiante){
        String sql = "select * from biblioteca.estudiante";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("codigoUnico");
        model.addColumn("nombreEstudiante");
        model.addColumn("cedulaEstudiante");
        Estudiante.setModel(model);
        
        String [] datos = new String[3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }
            Estudiante.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
    }
    
    public void filtrarTabla(String dat, DefaultTableModel model ,JTable Estudiante){
        String sql = "select * from biblioteca.estudiante where nombreEstudiante = '"+ dat +"'";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getCon();
        model = new DefaultTableModel();
        model.addColumn("codigoUnico");
        model.addColumn("nombreEstudiante");
        model.addColumn("cedulaEstudiante");
        Estudiante.setModel(model);
        
        String [] datos = new String[3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i=0; i<3; i++)
                    datos[i] = rs.getString(i+1);
                model.addRow(datos);
            }
            Estudiante.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        Estudiante.clearSelection();
    }
    
}
