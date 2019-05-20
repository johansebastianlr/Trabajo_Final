package ProgramacionTablas;
import Colegios.*;
import ConexionMysql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class TablaColegio extends ColegioPOA{
    
    //Instanciación de la clase ConexionBaseDato
    ConexionMysql objConect = new ConexionMysql(); 

    @Override
    public boolean insertarColegio(int idColegio, String nombre, String direccion, String telefono, String correo) {
         boolean resultado = false;
        try {
            String sql = "INSERT INTO colegio (idColegio,nombre,direccion,telefono,correo) VALUES ('"+idColegio+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"')";
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones
            objConect.conex.close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, Ocurrió un error. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado; 
    }

    @Override
    public boolean actualizarColegio(int idColegio, String nombre, String direccion, String telefono, String correo) {
        boolean resultado = false;
        try {
            String sql = "UPDATE colegio SET nombre = '"+nombre+"', direccion = '"+direccion+"', telefono = '"+telefono+"', correo = '"+correo+"' WHERE idColegio = '"+idColegio+"' ";
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }        
        return resultado;
    }

    @Override
    public boolean eliminarColegio(int idColegio) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM colegio where idColegio = " +idColegio;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
    }

    @Override
    public String consultarColegio(int idColegio) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from colegio Where idCodigo = " + idColegio;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            
            while (rs.next()) {                
                resultado += rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
      
        return resultado;    
    }
    
     public ResultSet cargarInfoColegio(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT idColegio, nombre, direccion, telefono,correo from colegio";
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            resultado = st.executeQuery(sqlConsultar);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
       return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
