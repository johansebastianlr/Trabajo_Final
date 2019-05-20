package Profesores;


/**
* Profesores/_ProfesorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Profesor.idl
* domingo 19 de mayo de 2019 11:20:59 PM COT
*/

public class _ProfesorStub extends org.omg.CORBA.portable.ObjectImpl implements Profesores.Profesor
{

  public boolean insertarProfesor (int idColegio, String nombre, String apellidoPaterno, String apellidoMaterno, int cedula, String direccion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarProfesor", true);
                $out.write_long (idColegio);
                $out.write_wstring (nombre);
                $out.write_wstring (apellidoPaterno);
                $out.write_wstring (apellidoMaterno);
                $out.write_long (cedula);
                $out.write_wstring (direccion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarProfesor (idColegio, nombre, apellidoPaterno, apellidoMaterno, cedula, direccion        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarProfesor

  public boolean actualizarProfesor (int idProfesor, int idColegio, String nombre, String apellidoPaterno, String apellidoMaterno, int cedula, String direccion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarProfesor", true);
                $out.write_long (idProfesor);
                $out.write_long (idColegio);
                $out.write_wstring (nombre);
                $out.write_wstring (apellidoPaterno);
                $out.write_wstring (apellidoMaterno);
                $out.write_long (cedula);
                $out.write_wstring (direccion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarProfesor (idProfesor, idColegio, nombre, apellidoPaterno, apellidoMaterno, cedula, direccion        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarProfesor

  public boolean eliminarProfesor (int idProfesor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarProfesor", true);
                $out.write_long (idProfesor);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarProfesor (idProfesor        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarProfesor

  public String consultarProfesor (int idProfesor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarProfesor", true);
                $out.write_long (idProfesor);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarProfesor (idProfesor        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarProfesor

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Profesores/Profesor:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ProfesorStub