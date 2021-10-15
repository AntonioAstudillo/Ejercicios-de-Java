package ejercicios;

import java.util.Scanner;

//validar un numero que se encuentre entre 1 - 10
public class ValidarNumeros {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

	    int minimo , maximo;
		
		do {
			System.out.println("Ingrese minimo");
			minimo = in.nextInt();

			System.out.println("Ingrese maximo");
			maximo = in.nextInt();
			
		} while (ValidarNumeros.validarNumeros(minimo, maximo));

		int numero = ValidarNumeros.validarNumero(minimo, maximo);

		System.out.println("El numero " + numero + " se encuentra entre el rango establecido");

	}

	public static int validarNumero(int minimo, int maximo) {

		int numero;

		do {
			System.out.println("Ingrese un numero");
			numero = in.nextInt();
		} while ((numero < minimo) || (numero > maximo));

		return numero;

	}

	private static boolean validarNumeros(int minimo, int maximo) {

		boolean bandera = false;

		if (minimo > maximo) {
			System.out.println("Datos incorrectos");
			bandera = true;
		}

		return bandera;
	}

}
