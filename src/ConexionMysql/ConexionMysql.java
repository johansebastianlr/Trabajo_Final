package ConexionMysql;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lasso rivas y Juan sebastian
 */
public class ConexionMysql {
    
    public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/basecolegio","root","corhuila2018");
            System.out.println("Conexión Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ha sucedido un problema inesperado con la conexión");
        }
        return conex;
    }
}
