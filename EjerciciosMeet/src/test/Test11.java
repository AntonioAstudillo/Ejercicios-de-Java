package test;

import java.util.Scanner;

import arreglos.Ejercicio11;

public class Test11 {

	public static void main(String[] args) {
		Ejercicio11 objeto;
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int numero;

		do {
			System.out.println("Ingrese 5 elementos numericos");

			for (int i = 0; i < 5; i++) {

				System.out.print("Ingrese numero ");
				a[i] = in.nextInt();
			}

		}while(Ejercicio11.comprobarNumeros(a));

		objeto = new Ejercicio11(a);
		
		System.out.println("Ingrese numero a insertar");
		numero = in.nextInt();

		objeto.insertarNumero(numero);
		objeto.mostrar();

	}

}
