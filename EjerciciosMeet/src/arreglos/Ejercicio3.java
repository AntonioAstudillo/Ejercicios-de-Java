package arreglos;

import java.util.Scanner;

public class Ejercicio3 extends Ejercicio1 {

	public Ejercicio3(int valor) {
		super(valor);

	}

	public void mezclarTercerForma(int a[], int b[]) {

        int tam = a.length + b.length;
		int contador; 
		int i;
		int indicador , aux;
		
        indicador = 0; aux = 0;
		i = contador = 0;
	
		
		for (int j = 0; j < tam; j++) {
			
			aux = indicador;
			
			while(i<3) {
				super.arreglo[contador] = a[aux];
				contador++;
				aux++; i++;
			}
			
			i=0; aux = indicador;
			
			while(i<3) {
				super.arreglo[contador] = b[aux];
				contador++; i++;
				aux++;
			}
			i=0;
			
			indicador = indicador + 3;
			j=contador;
			
			
		}

	}

	// sobreCargo el metodo mostrarElementos
	public void mostrarElementos(int a[]) {
		System.out.println("\n\nMostrando Elementos del arreglo:");
		for (int elemento : a) {
			System.out.print(elemento + " ");
		}
	}

	public int[] pedirElementos(int a[]) {

		Scanner in = new Scanner(System.in);
		int i;
		int longitud = a.length;

		for (i = 0; i < longitud; i++) {
			System.out.println("Ingrese numero " + (i + 1));
			a[i] = in.nextInt();
		}

		return a;
	}

}
