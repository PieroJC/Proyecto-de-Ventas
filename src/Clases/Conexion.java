
package Clases;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conn;
    private static final String user = "root";
    private static final String pass = "12345678";
    private static final String url = "jdbc:mysql://localhost/farmacia";
    
    public Connection Conectar(){
        conn = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(url, user, pass);
           //if (conn != null){
             //   JOptionPane.showMessageDialog(null, "Conectado");
           //}
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Driver jdbc no ecnontrado");
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "NO CONECTADO");
        }
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null){
            JOptionPane.showMessageDialog(null, "DESCONECTADO");
        }
    }           
}
