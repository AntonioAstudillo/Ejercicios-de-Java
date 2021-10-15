package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Persona[] lasPersonas=new Persona[3];
		
		lasPersonas[0]= new Empleado2("Luis Conde",50000,2009,02,25);
		lasPersonas[1]=new Alumno("Antonio Astudillo","Computacion");
		lasPersonas[2]=new Empleado2("Maria Elena",4600,2007,03,26);
		
		
		for(Persona p:lasPersonas)
		{
			System.out.println(p.dameNombre()+p.dameDescripcion());
		}
		
	}

}

abstract class Persona
{
  private String nombre;
  
  
  public Persona(String nom)
  {
	  nombre=nom;
  }
  
  public String dameNombre()
  {
	  return nombre;
  }
  
  public abstract String dameDescripcion();
  
  
  
  
}//cierra clase Persona


class Empleado2 extends Persona{
	
	public Empleado2(String nom , double sue , int anio , int mes , int dia)
	{
		super(nom);
		sueldo=sue;
		//establecer fecha clase GregorianCalendar
		GregorianCalendar calendario = new GregorianCalendar(anio , mes , dia);
		altaContrato=calendario.getTime();
		idSiguiente++;
		id=idSiguiente;
		
	}
	
	 public double dameSueldo()
	{
		return sueldo;
	}
	
	public Date dameFecha()
	{
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje)
	{
		double aumento;
		
		aumento=(sueldo*porcentaje)/100;
		sueldo=sueldo+aumento;
	}
	
	public String dameDescripcion()
	{
		return "Este empleado tiene un id= "+id+"Con un sueldo de="+sueldo;
	}
	
	
 	private double sueldo;
 	private Date altaContrato;
 	private static int idSiguiente;
 	private int id;
 	
	
}//cierra clase empleado


class Alumno extends Persona
{
	
   public Alumno(String nom , String carrera)
   {
	   super(nom);
	   this.carrera=carrera;
	   
   }
   
   public String dameDescripcion()
   {
	   return "Este alumno esta estudiando la carrera de "+carrera;
   }
   
	
   private String carrera;
}