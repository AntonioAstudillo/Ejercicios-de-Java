package arreglos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Llene arreglo 1");
		Ejercicio12.pedirNumeros(a, in);
		
		System.out.println("Llene arreglo 2");
		Ejercicio12.pedirNumeros(b, in);
		
		c = Ejercicio12.llenarArreglo(a, b, c);
		c = Ejercicio12.ordenar(c);
		Ejercicio12.mostrar(c);
  
	}
	
	public static void pedirNumeros(int a[] , Scanner in) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print((i+1)+" Ingrese numero: ");
			a[i] = in.nextInt();
			System.out.println();
		}
		
	}
	
	public static int[] llenarArreglo(int a[] , int b[] ,int c[] ) {
		
		int contador = 0;
		
		for (int i = 0; i < 10; i++) {
			c[contador] = a[i];
			contador++;
			
			c[contador] = b[i];
			contador++;
		}
		
		return c;
		
	}
	
	public static int[] ordenar(int c[]) {
	  int pos , aux;
	  
	  for (int i = 0; i < c.length; i++) {
		  pos = i;
		  aux = c[i];
		  
		  while((pos>0) && (c[pos-1])>aux) {
			  c[pos] = c[pos-1];
			  pos--;
		  }
		  
		  c[pos] = aux;
	}
	  
	  return c;
		
	}
	
	public static void mostrar(int c[]) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
