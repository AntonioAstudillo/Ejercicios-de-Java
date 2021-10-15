package ejercicios;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args)
	{
		String nombre;
		int id;
		double precio;
		char simbolo;
		boolean envio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Proporciona el nombre:");
		nombre=entrada.nextLine();
		System.out.println("Proporciona el id");
		id=Integer.parseInt(entrada.nextLine());
		System.out.println("Proporciona el precio");
		precio=Double.parseDouble(entrada.nextLine());
		System.out.println("Proporciona el signo");
		simbolo=entrada.nextLine().charAt(0);
		System.out.println("Proporciona el envio gratuito");
		envio= Boolean.parseBoolean(entrada.nextLine());
		
		System.out.println(nombre+"#"+id+"\n"+"Precio:"+simbolo+precio+"\n"+"Envio Gratuito: "+envio);
		

	}

}
