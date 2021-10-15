package arreglos;

import java.util.Scanner;

public class Ejercicio4 {
     
	
	
	public static void main(String[]args) {
		
		int cantidad , arreglo[];
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Cuantos numeros va ingresar");
		cantidad = in.nextInt();
		arreglo = new int[cantidad];
		
		Ejercicio4.PedirNumeros(cantidad, arreglo, in);
		
		if(Ejercicio4.comprobarDecreciente(arreglo , cantidad)) {
			
			if(Ejercicio4.comprobarCreciente(arreglo, cantidad)) {
				System.out.println("Los numeros estan desordenados");
			}
			else {
				System.out.println("Los numeros estan Ordenados de forma Decreciente");
			}
		}else {
			System.out.println("Los numeros estan Ordenados de forma Creciente");
		}
		
		
	}
	
	
	public static void PedirNumeros(int cantidad , int a[] , Scanner in) {
		
	
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese un numero");
			a[i] = in.nextInt();
			
		}
	}
	
	public static boolean comprobarDecreciente(int a[] , int tamano) {
		
		boolean bandera;
		
		bandera = false;
		
		for (int i = tamano-1; i >=0; i--) {
			
			 for (int j = i-1; j >= 0; j--) {
			
				  if( !(a[i]>a[j]) ) {
					  bandera = true;
					  break;
				  }
			}
			 
			if(bandera) {
				break;
			}
		}
		
		return bandera;
		
	}
	
	public static boolean comprobarCreciente(int a[] , int tamano) {
		boolean bandera;
		
		bandera = false;
		
		for (int i = 0; i < tamano; i++) {
			
			 for (int j = i+1; j < a.length; j++) {
			
				  if( !(a[i]<a[j]) ) {
					  bandera = true;
					  break;
				  }
			}
			 
			if(bandera) {
				break;
			}
		}
		
		return bandera;
		
	}
}
