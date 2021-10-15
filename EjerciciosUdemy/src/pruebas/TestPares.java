package pruebas;

import java.util.Scanner;

import Ejercicios.Pares;

public class TestPares {

	public static void main(String[] args) {
		
		Pares objeto;
		int n , m;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el valor n");
		n = in.nextInt();
		
		System.out.println("Ingrese el valor de m");
		m = in.nextInt();
		
		objeto = new Pares(n,m);
		
		objeto.mostrarPares();
		

	}

}
