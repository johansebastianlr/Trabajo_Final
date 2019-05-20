package ProgramacionTablas;
import Materias.*;
import ConexionMysql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author magne
 */
public class TablaMateria extends MateriaPOA{
    
    //Instanciación de la clase ConexionBaseDato
    ConexionMysql objConect = new ConexionMysql(); 

    @Override
    public boolean insertarMateria(int idMateria, String nombre, String horario, String salon, int idProfesor) {
        boolean resultado = false;
        try {
            String sql = "INSERT INTO materia (idMateria,nombre,horario,salon,fk_idProfesor) VALUES ('"+idMateria+"','"+nombre+"','"+horario+"','"+salon+"','"+idProfesor+"')";
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
    public boolean actualizarMateria(int idMateria, String nombre, String horario, String salon, int idProfesor) {
        boolean resultado = false;
        try {
            String sql = "UPDATE materia SET nombre = '"+nombre+"', horario = '"+horario+"', salon = '"+salon+"', fk_idProfesor = '"+idProfesor+"' WHERE idMateria = '"+idMateria+"'";
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
    public boolean eliminarMateria(int idMateria) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM materia where idMateria = " +idMateria;
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
    public String consultarMateria(int idMateria) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from materia Where idMateria = " + idMateria;
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

    public ResultSet cargarInfoMateria(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT M.idMateria, M.nombre, M.horario, M.salon, P.nombre FROM profesores P, materia M WHERE M.fk_idProfesor = P.idProfesor";
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
