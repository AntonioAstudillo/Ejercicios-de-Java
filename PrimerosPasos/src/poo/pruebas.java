package poo;

public class pruebas {

	public static void main(String[] args) 
	{
		Empleados objeto1 , objeto2 , objeto3 , objeto4;
		
		objeto1= new Empleados("Antonio");
        objeto2= new Empleados("Yamile");
		objeto3=new Empleados("Nuvia");
		objeto4=new Empleados("Maria");
        
		objeto4.cambiarSeccion("Limpieza");
        objeto1.cambiarSeccion("Sistemas");
        objeto3.cambiarSeccion("Mantenimiento");
          
        System.out.println(objeto1.devuelveDatos()+"\n" + objeto2.devuelveDatos() + "\n" + objeto3.devuelveDatos()+"\n"+objeto4.devuelveDatos());        
       
        System.out.println(Empleados.dameIdSiguiente());
	
	}//cierra metodo

}

class Empleados{
	
	
	public Empleados(String nom)
	{
		nombre=nom;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public void cambiarSeccion(String seccion)
	{
		this.seccion=seccion;
	}
	
	public String devuelveDatos()
	{
		return "EL N0MBRE ES :"+nombre+" y la seccion es "+ seccion+" y el id es ="+id;
	}
	
	public static String dameIdSiguiente()
	{
		
		
		
		return "El IdSiguiente es: "+idSiguiente;
	}


	//con la palabra reservada final indicamos que es una constante
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	
	
}