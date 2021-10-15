package Ejercitandome;

import java.util.*;

public class EjemploScanner 
{
    public static void main(String[]args)
    {
    	Scanner objetoEntrada = new Scanner(System.in);
    	
    	//para capturar un string con todo y espacios utilizamos useDelimiter("\n");
    
    	objetoEntrada.useDelimiter("\n");
    	System.out.println("INGRESE UN STRING");
    	String palabra = objetoEntrada.next();
    	
    	System.out.println(palabra);
    	
    }
    
}
