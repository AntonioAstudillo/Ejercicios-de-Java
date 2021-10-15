package pruebas;

import java.util.Scanner;

import pila.Octal;

public class TestPila {
/*Crear un programa que dado un numero decimal lo pase a octal*/
	public static void main(String[] args) {
		
		Octal objeto;
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero");
		numero = in.nextInt();
		
		objeto = new Octal(numero);
		
		objeto.mostrarNumero();

	}

}
