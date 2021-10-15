package arreglos;

import java.util.Scanner;

/*Leer por teclados dos tablas
 * de 10 numeros enteros y mezclarlas
 * en una tercera de la forma:
 * el 1* de A , el 1 de B 
 * El 2 de A, el Segundo de b
 * 
 * 
 * 
 */
public class Ejercicio2 {
     
	private static int arreglo3[] = new int[20]; 
	
	public static void llenarArreglo(int arreglo[]) {
		 
		Scanner in = new Scanner(System.in);
		int contador = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese un numero ");
			arreglo[i] = in.nextInt();
		}
	}
	
	public static void mostrarArreglo() {
		
		for (int j = 0; j < arreglo3.length; j++) {
			System.out.print(Ejercicio2.arreglo3[j] + " ");
		}
		
	}
	
	public static void mostrarArreglo(int arreglo[]) {
		System.out.println("\n\nDatos del arreglo");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
	}
	
	public static void main(String[]args) {
		int arreglo1[] = new int [10];
		int arreglo2[] = new int [10];
		int arreglo3[] = new int [10];
		
		System.out.println("Ingrese los valores del primer arreglo");
		Ejercicio2.llenarArreglo(arreglo1);
		System.out.println("Ingrese los valores del segundo arreglo");
		Ejercicio2.llenarArreglo(arreglo2);
		Ejercicio2.mezclarArreglos(arreglo1, true);
		Ejercicio2.mezclarArreglos(arreglo1, false);
		
		System.out.println("Mostando arreglo mezclado");
	    Ejercicio2.mostrarArreglo();
	    		
	}
	
	public static void mezclarArreglos(int a[] , boolean bandera) {
		
		int contador , i=0;
		
		if(bandera) {
			
			contador = 0;
			
			while(i<10) {
				
				Ejercicio2.arreglo3[contador] = a[i];
				i++;
					
			}
		}else {
			contador = 1;
			
			while(i<10) {
			
			Ejercicio2.arreglo3[contador] = a[i];
			contador = contador + 2;
			i++;
			
			}
		}
		
	}
	
}
