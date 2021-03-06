package proyectoModular;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ValidarCita 
{
    private int dia;
    private int mes;
    private int a?o;
    
	
    
    public ValidarCita()
    {
    	 dia=0;
    	 mes=0;
    	 a?o=0;
    }
    
    public void romperCadena(String dato)
    {
    	DateFormat objetoFecha = new SimpleDateFormat("dd/MM/yyyy");
    	dato = objetoFecha.format(objetoFecha);
    	
    	StringTokenizer rompiendo = new StringTokenizer(dato,"/");
    	
    	dia = Integer.parseInt(rompiendo.nextToken());
    	mes = Integer.parseInt(rompiendo.nextToken());
    	a?o = Integer.parseInt(rompiendo.nextToken());
    	
    }
    
    public boolean validarAnio()
    {
    	//este metodo retorna true si el a?o es incorrecto
    	//caso contrario retorna false.
    	
    	Date fecha2 = new Date(a?o,mes-1,dia);
		Calendar fecha = Calendar.getInstance();
		
		int anio =  fecha.get(Calendar.YEAR);
		
		if(a?o<anio)
		{
			return true;
		}
		else
		{
			return false;
		}
    	
    	
    }
    
    
    

}
