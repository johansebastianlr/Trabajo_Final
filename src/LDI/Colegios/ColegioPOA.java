package LDI.Colegios;


/**
* Colegios/ColegioPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Colegio.idl
* domingo 12 de mayo de 2019 04H05' COT
*/

public abstract class ColegioPOA extends org.omg.PortableServer.Servant
 implements LDI.Colegios.ColegioOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarColegio", new java.lang.Integer (0));
    _methods.put ("actualizarColegio", new java.lang.Integer (1));
    _methods.put ("eliminarColegio", new java.lang.Integer (2));
    _methods.put ("consultarColegio", new java.lang.Integer (3));
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
       case 0:  // Colegios/Colegio/insertarColegio
       {
         int idColegio = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String correo = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarColegio (idColegio, nombre, direccion, telefono, correo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Colegios/Colegio/actualizarColegio
       {
         int idColegio = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String correo = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarColegio (idColegio, nombre, direccion, telefono, correo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Colegios/Colegio/eliminarColegio
       {
         int idColegio = in.read_long ();
         boolean $result = false;
         $result = this.eliminarColegio (idColegio);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Colegios/Colegio/consultarColegio
       {
         int idColegio = in.read_long ();
         String $result = null;
         $result = this.consultarColegio (idColegio);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Colegios/Colegio/shutdown
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
    "IDL:Colegios/Colegio:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Colegio _this() 
  {
    return ColegioHelper.narrow(
    super._this_object());
  }

  public Colegio _this(org.omg.CORBA.ORB orb) 
  {
    return ColegioHelper.narrow(
    super._this_object(orb));
  }


} // class ColegioPOA
