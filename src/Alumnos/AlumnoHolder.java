package Alumnos;

/**
* Alumnos/AlumnoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Alumno.idl
* lunes 20 de mayo de 2019 09:29:56 AM COT
*/

public final class AlumnoHolder implements org.omg.CORBA.portable.Streamable
{
  public Alumnos.Alumno value = null;

  public AlumnoHolder ()
  {
  }

  public AlumnoHolder (Alumnos.Alumno initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Alumnos.AlumnoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Alumnos.AlumnoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Alumnos.AlumnoHelper.type ();
  }

}
