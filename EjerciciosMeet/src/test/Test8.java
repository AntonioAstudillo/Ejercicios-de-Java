package test;


import java.util.Scanner;

import arreglos.Ejercicio8;

public class Test8 {

	public static void main(String[] args) {
		
		Ejercicio8 objeto;
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int numero , posicion;
		
		
		//lleno el arreglo con 8 numeros
		Ejercicio8.llenarArreglo(a, in , 8);
		
		//Le pido al usuario que digite el numero y la posicion
		System.out.println("Digite el numero");
		numero = in.nextInt();
		
		System.out.println("Digite la posicion");
		posicion = in.nextInt();
		
		objeto = new Ejercicio8(numero , posicion);
		
		objeto.insertarNumero(a);
		
		/*
		
		objeto = new Ejercicio8();
		
		Ejercicio8.llenarArreglo(a, in , 10);
		a = objeto.desplazarArreglo(a);
		objeto.mostrarArreglo(a);
		
		*/
		

	}

}
