package ProgramacionTablas;
import Registros.*;
import ConexionMysql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author magne
 */
public class TablaRegistro extends RegistroPOA{
    
    //Instanciación de la clase ConexionBaseDato
    ConexionMysql objConect = new ConexionMysql(); 

    @Override
    public boolean insertarRegistro(int idAlumno, int idMateria, int idProfesor) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO registro (fk_idAlumno,fk_idMateria,fk_idProfesor) VALUES ('"+idAlumno+"','"+idMateria+"','"+idProfesor+"')";
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
    public boolean actualizarRegistro(int id, int idAlumno, int idMateria, int idProfesor) {
        boolean resultado = false;
        try {
            String sql = "UPDATE registro SET fk_idAlumno = '"+idAlumno+"', fk_idMateria = '"+idMateria+"', fk_idProfesor = '"+idProfesor+"' WHERE id = '"+id+"'";
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
    public boolean eliminarRegistro(int id) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM registro WHERE id = " +id;
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
    public String consultarRegistro(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public ResultSet cargarInfoRegistro(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT R.id,A.nombre, M.nombre, P.nombre FROM registro R, alumno A, materia M, profesores P WHERE R.fk_idAlumno = A.idAlumno AND R.fk_idMateria = M.idMateria AND R.fk_idProfesor = P.idProfesor;";
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
