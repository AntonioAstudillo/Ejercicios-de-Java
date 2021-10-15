package ejercicio10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

//Escribe un programa que pregunte al usuario su fecha de nacimiento y la 
// fecha del dia de doy, y calcule la edad del usuario en años

public class Fecha {

    private StringTokenizer tokens;
    private Calendar c1;
	private int edad ,  mes , anio;
    
	public Fecha(String fecha) {
		
		tokens = new StringTokenizer(fecha, "/");
		c1 = new GregorianCalendar();
		edad = 0;
		tokens.nextToken();
		mes = Integer.parseInt(tokens.nextToken());
		anio = Integer.parseInt(tokens.nextToken());
	}
	
	 public int obtenerEdad() {
	   
		int mes , anio;
		
		anio = c1.get(Calendar.YEAR);
		mes = c1.get(Calendar.MONTH);
		
		this.edad = (mes > this.mes) ? (anio-this.anio)+1 : (anio-this.anio);
		
		if(this.mes == 12) {
			this.edad = this.edad - 1;
		}
		
		return edad;
	}
	
}
