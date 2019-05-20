package ProgramacionTablas;
import Alumnos.*;
import ConexionMysql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Sebastian Lasso Rivas y Juan Sebastian
 */
public class TablaAlumno extends AlumnoPOA {
    
    //Instanciación de la clase ConexionBaseDato
    ConexionMysql objConect = new ConexionMysql();  
   

    @Override
    public boolean insertarAlumno(int idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String fechaIngreso) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO alumno (idAlumno,nombre,apellidoPaterno,apellidoMaterno,direccion,telefono, fechaIngreso) VALUES ('"+idAlumno+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+direccion+"','"+telefono+"','"+fechaIngreso+"')";
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
    public boolean actualizarAlumno(int idAlumno, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String fechaIngreso) {
         boolean resultado = false;
        try {
            String sql = "UPDATE alumno SET nombre = '"+nombre+"', apellidoPaterno = '"+apellidoPaterno+"', apellidoMaterno = '"+apellidoMaterno+"', direccion = '"+direccion+"', telefono = '"+telefono+"', fechaIngreso = '"+fechaIngreso+"' WHERE idAlumno = '"+idAlumno+"'";
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
    public boolean eliminarAlumno(int idAlumno) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM alumno WHERE idAlumno = " +idAlumno;
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
    public String consultarAlumno(int idAlumno) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from alumno Where idAlumno = " + idAlumno;
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
    
    public ResultSet cargarInfoAlumno(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT * FROM alumno";
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
