package Profesores;


/**
* Profesores/ProfesorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Profesor.idl
* domingo 19 de mayo de 2019 11:20:59 PM COT
*/

public abstract class ProfesorPOA extends org.omg.PortableServer.Servant
 implements Profesores.ProfesorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarProfesor", new java.lang.Integer (0));
    _methods.put ("actualizarProfesor", new java.lang.Integer (1));
    _methods.put ("eliminarProfesor", new java.lang.Integer (2));
    _methods.put ("consultarProfesor", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Profesores/Profesor/insertarProfesor
       {
         int idColegio = in.read_long ();
         String nombre = in.read_wstring ();
         String apellidoPaterno = in.read_wstring ();
         String apellidoMaterno = in.read_wstring ();
         int cedula = in.read_long ();
         String direccion = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarProfesor (idColegio, nombre, apellidoPaterno, apellidoMaterno, cedula, direccion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Profesores/Profesor/actualizarProfesor
       {
         int idProfesor = in.read_long ();
         int idColegio = in.read_long ();
         String nombre = in.read_wstring ();
         String apellidoPaterno = in.read_wstring ();
         String apellidoMaterno = in.read_wstring ();
         int cedula = in.read_long ();
         String direccion = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarProfesor (idProfesor, idColegio, nombre, apellidoPaterno, apellidoMaterno, cedula, direccion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Profesores/Profesor/eliminarProfesor
       {
         int idProfesor = in.read_long ();
         boolean $result = false;
         $result = this.eliminarProfesor (idProfesor);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Profesores/Profesor/consultarProfesor
       {
         int idProfesor = in.read_long ();
         String $result = null;
         $result = this.consultarProfesor (idProfesor);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Profesores/Profesor/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Profesores/Profesor:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Profesor _this() 
  {
    return ProfesorHelper.narrow(
    super._this_object());
  }

  public Profesor _this(org.omg.CORBA.ORB orb) 
  {
    return ProfesorHelper.narrow(
    super._this_object(orb));
  }


} // class ProfesorPOA
