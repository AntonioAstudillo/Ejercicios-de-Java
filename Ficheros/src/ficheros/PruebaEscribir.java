package ficheros;

import java.util.Scanner;

public class PruebaEscribir {

	public static void main(String[] args) {
		
		EscribirFichero objeto = new EscribirFichero();
		Scanner in = new Scanner(System.in);
		String texto;
		
		/*
		System.out.println("Ingrese el texto que quiera almacenar en el archivo");
		texto = in.nextLine();
		
		objeto.escribirEnArchivo(texto);  */
		
		System.out.println("\nLa información que hay en el archivo es:\n");
		objeto.leerArchivo();
		System.out.println("\nfin del archivo...");
		System.out.println("El archivo tiene un total de: "+objeto.getContador() + " lineas");

	}

}
