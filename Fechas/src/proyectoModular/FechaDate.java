package proyectoModular;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//116: �porque 116? Esto es el a�o, tenemos que tener en cuenta que inicialmente empieza en 1900 
//y lo que hace es sumarle el valor que le demos 1900+116 = 2016. Si ponemos 2016 en realidad, ser�a el a�o 3916.
//segundoParametro: este es el mes, pero si es el 5 �No deber�a ser Mayo? No, porque empieza en 0 por lo que el 5 
//seria el sexto mes, en este caso Junio.
//TercerParametro: este es el d�a, aqu� es el d�a tal cual lo ponemos.

public class FechaDate {

	public static void main(String[] args) 
	{
		Date fecha2 = new Date(120,2,12);
		Calendar fecha = Calendar.getInstance();
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-MMM-yy");
        int dia=fecha2.getDay();;
        int dia2 = fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("EL DIA ACTUAL ES "+dia2);
		System.out.println("Dia de la semana "+fecha2.getDay());
		System.out.println("EL DIA ACTUAL ES "+fecha2.getDay());
		System.out.println("EL a�o ACTUAL ES "+fecha.get(Calendar.YEAR));
	    
		
		
		
		
		/*
		 System.out.println("A�o: "+ (fecha2.getYear()+1900) );
		 System.out.println("Mes: "+(fecha2.getMonth()+2));
		 System.out.println("Dia: "+(fecha2.getDate()));
		 System.out.println("Dia de la semana "+fecha2.getDay()  );
		 
		 */
		 
	}

}
