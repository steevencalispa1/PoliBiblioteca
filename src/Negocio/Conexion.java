package Negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author Steeven
 */
public class Conexion {
    private static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/biblioteca";
    private String user;
    private String pass;

    public Connection conexion(){
        con = null;
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }

    public Connection getCon() {
        return con;
    }
 
    public Connection tablaConexion(String user,String pass){
        return con;
    }

    public Conexion(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Conexion() {
    }
}
