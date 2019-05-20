package Alumnos;


/**
* Alumnos/AlumnoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Alumno.idl
* lunes 20 de mayo de 2019 09:29:56 AM COT
*/

public abstract class AlumnoPOA extends org.omg.PortableServer.Servant
 implements Alumnos.AlumnoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarAlumno", new java.lang.Integer (0));
    _methods.put ("actualizarAlumno", new java.lang.Integer (1));
    _methods.put ("eliminarAlumno", new java.lang.Integer (2));
    _methods.put ("consultarAlumno", new java.lang.Integer (3));
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
       case 0:  // Alumnos/Alumno/insertarAlumno
       {
         int idAlumno = in.read_long ();
         String nombre = in.read_wstring ();
         String apellidoPaterno = in.read_wstring ();
         String apellidoMaterno = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String fechaIngreso = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarAlumno (idAlumno, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, fechaIngreso);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Alumnos/Alumno/actualizarAlumno
       {
         int idAlumno = in.read_long ();
         String nombre = in.read_wstring ();
         String apellidoPaterno = in.read_wstring ();
         String apellidoMaterno = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String fechaIngreso = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarAlumno (idAlumno, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, fechaIngreso);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Alumnos/Alumno/eliminarAlumno
       {
         int idAlumno = in.read_long ();
         boolean $result = false;
         $result = this.eliminarAlumno (idAlumno);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Alumnos/Alumno/consultarAlumno
       {
         int idAlumno = in.read_long ();
         String $result = null;
         $result = this.consultarAlumno (idAlumno);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Alumnos/Alumno/shutdown
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
    "IDL:Alumnos/Alumno:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Alumno _this() 
  {
    return AlumnoHelper.narrow(
    super._this_object());
  }

  public Alumno _this(org.omg.CORBA.ORB orb) 
  {
    return AlumnoHelper.narrow(
    super._this_object(orb));
  }


} // class AlumnoPOA