package ProgramacionTablas;
import Profesores.*;
import ConexionMysql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class TablaProfesor extends ProfesorPOA {

    //Instanciación de la clase ConexionBaseDato
    ConexionMysql objConect = new ConexionMysql(); 
    
    @Override
    public boolean insertarProfesor(int idColegio, String nombre, String apellidoPaterno, String apellidoMaterno, int cedula, String direccion) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO profesores (fk_idColegio,nombre,apellidoPaterno,apellidoMaterno,cedula,direccion) VALUES ('"+idColegio+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+cedula+"','"+direccion+"')";
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
    public boolean actualizarProfesor(int idProfesor, int idColegio, String nombre, String apellidoPaterno, String apellidoMaterno, int cedula, String direccion) {
        boolean resultado = false;
        try {
            String sql = "UPDATE profesores SET fk_idColegio = '"+idColegio+"', nombre = '"+nombre+"', apellidoPaterno = '"+apellidoPaterno+"', apellidoMaterno = '"+apellidoMaterno+"', cedula = '"+cedula+"', direccion = '"+direccion+"' WHERE idProfesor = '"+idProfesor+"'";
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
    public boolean eliminarProfesor(int idProfesor) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM profesores where idProfesor = " +idProfesor;
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
    public String consultarProfesor(int idProfesor) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from profesores Where idProfesor = " + idProfesor;
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
    
     public ResultSet cargarInfoProfesor(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT P.idProfesor, C.nombre, P.nombre, P.apellidoPaterno, P.apellidoMaterno, P.cedula, P.direccion  FROM profesores P, colegio C WHERE P.fk_idColegio = C.idColegio";
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
