package Ejercicios;
import java.util.*;

public class Aleatorios {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		NumerosAleatorios objeto = new NumerosAleatorios();
		
		i=0;
		while(i<20)
		{
			objeto.generarNumeros();
			objeto.mostrarNumero();
		    i++;
		}
		
		

	}

}

class NumerosAleatorios
{
	
	Random numeros = new Random();
	
	public void generarNumeros()
	{
		
		numero=1+numeros.nextInt(6);
	}
	
	
	public void mostrarNumero()
	{
		System.out.println("EL NUMERO ALEATORIO GENERADO FUE:"+numero);
	}
	
	
	private int numero;
	
}
