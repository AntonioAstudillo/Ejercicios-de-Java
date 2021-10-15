package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args)
	{ 
		Jefatura jefe_RRHH = new Jefatura("Miguel Angel",55000,2006,9,12);
		
		jefe_RRHH.estableIncentivo(2570);
		
		
		Empleado[] objeto = new Empleado[6];
		
		objeto[0] = new Empleado("Antonio Astudillo", 2500 , 2016 , 06 , 2);
		objeto[1] = new Empleado("Amy Astudillo", 3500 , 2015 , 12 , 8);
		objeto[2] = new Empleado("Juan Astudillo", 5500 , 2018 , 06 , 02);
		objeto[3] = new Empleado("Maria de Jesus");
		objeto[4] =jefe_RRHH; //Polimorfismo en accion principio de sustitucion
		objeto[5] = new Jefatura("Maria",95000,1999,5,26);
		
		 Jefatura jefa_Finanzas=(Jefatura)objeto[5];
		
		 jefa_Finanzas.estableIncentivo(55000);
		
		 System.out.println("El jefe : "+jefa_Finanzas.dameNombre()+"Tiene un bonus de"+jefa_Finanzas.estableceBonus(500));
		 
		 System.out.println(jefa_Finanzas.tomar_decisiones(" DAR MAS DIAS DE VACACIONES"));
		 
		 System.out.println(objeto[3].dameNombre()+" tiene un bonus de"+objeto[3].estableceBonus(200));
		 
		for(Empleado empleados:objeto)
		{
			empleados.subeSueldo(5);
		}

		Arrays.sort(objeto);
		
		for(Empleado empleados:objeto)
		{
		
			System.out.println(empleados.dameNombre()+" Sueldo: "+empleados.dameSueldo()+" Fecha:"+empleados.dameFecha());
		}
		
	//objeto[3].dameNombre();
		
	}//cierra metodo
	
	

}//cierra 

class Empleado implements Comparable,Trabajadores{
	
	public Empleado(String nom , double sue , int anio , int mes , int dia)
	{
		nombre=nom;
		sueldo=sue;
		//establecer fecha clase GregorianCalendar
		GregorianCalendar calendario = new GregorianCalendar(anio , mes , dia);
		altaContrato=calendario.getTime();
		
	}
	
	public Empleado(String nom)
	{
		this(nom,30000,2000,01,01);
	}
	
	public String dameNombre()
	{
		return "EL NOMBRE DEL EMPLEADO ES "+nombre;
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
	
	public double estableceBonus(double gratificacion)
	{
		return Trabajadores.bonusBase+gratificacion;
	}
	
	public int compareTo(Object miObjeto)
	{
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo)
		{
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo)
		{
			return 1;
		}
		
		return 0;
	}
	
	
	
	private String nombre;
 	private double sueldo;
 	private Date altaContrato;
	
}//cierra clase empleado

class Jefatura extends Empleado implements Jefes
{
	
	public Jefatura(String nom , double sue , int agno , int mes , int dia)
	{
		super(nom,sue,agno,mes,dia);		
	}
	
	public void estableIncentivo(double b)
	{
		this.incentivo=b;
	}
	
	public double dameSueldo()
	{
		double sueldoJefe;
		
		sueldoJefe=super.dameSueldo()+incentivo;
		
		return sueldoJefe;
	}
	
	public String tomar_decisiones(String decision)
	{
		
		
		
		return "Un miembro de la direccion ha tomado la desicion"
				+ " de:"+decision;
	}
	
	
	public double estableceBonus(double gratificacion)
	{
		double prima=2000;
		
		
		return Trabajadores.bonusBase+gratificacion+prima;
	}
	
	private double incentivo;

	@Override
	public String tomarDecisiones(String decision) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}//cierra clase jefatura

