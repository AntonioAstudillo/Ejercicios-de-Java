package pruebas;

import java.util.Scanner;

import ejercicio10.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha objeto;
		Scanner in = new Scanner(System.in);
		String fecha;
		
		System.out.println("Ingrese su fecha de nacimiento en formato d/m/aaaa");
		fecha = in.nextLine();
		
		objeto = new Fecha(fecha);
		
		System.out.println("Su edad es: "+objeto.obtenerEdad());

	}

}
