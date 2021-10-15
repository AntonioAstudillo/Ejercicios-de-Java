package Ejercitandome;

import java.util.*;

public class CadenasRecorrer {

	public static void main(String[] args)
	{
	    String frase ;
	    int i  , longitud , contador;
	    char caracter;
		
		Scanner objeto = new Scanner(System.in);
	    objeto.useDelimiter("\n");
	   
	   System.out.println("INGRESE UNA FRASE");
	   frase = objeto.next();
	   
	   longitud = frase.length();
	   contador=0;
	   
	  
	   
	   for(i=0; i<longitud; i++)
	   {
		   caracter=frase.charAt(i);
		   
		   if(caracter=='a')
		   {
			   contador++;
		   }
		   
	   }
	   
	   System.out.println("LA FRASE INGRESADA TIENE "+contador+" LETRAS A");

	}

}
