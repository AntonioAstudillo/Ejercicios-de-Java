package proyectoModular;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * 116: ¿porque 116? Esto es el año, tenemos que tener en cuenta que inicialmente empieza en 1900 y lo que hace es sumarle el valor que le demos 1900+116 = 2016. Si ponemos 2016 en realidad, sería el año 3916.
    5: este es el mes, pero si es el 5 ¿No debería ser Mayo? No, porque empieza en 0 por lo que el 5 seria el sexto mes, en este caso Junio.
   3: este es el día, aquí es el día tal cual lo ponemos.
 * 
 */


public class FechaObtener {



 
		public static void main(String[] args) 
		{
	 
			// Creamos una instancia del calendario
			Calendar now = Calendar.getInstance();
	 
			System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1)
							+ "-"
							+ now.get(Calendar.DATE)
							+ "-"
							+ now.get(Calendar.YEAR));
	 
	 
			// Array con los dias de la semana
			String[] strDays = new String[]{
							"Domingo",
							"Lunes",
							"Martes",
							"Miercoles",
							"Jueves",
							"Viernes",
							"Sabado"};
	 
			// El dia de la semana inicia en el 1 mientras que el array empieza en el 0
			System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
		}
	}



