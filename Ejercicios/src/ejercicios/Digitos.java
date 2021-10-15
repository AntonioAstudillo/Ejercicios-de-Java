package ejercicios;

import java.util.Scanner;

/*Crea un metodo que dado un numero muestre sus digitos
 * 
 * */

public class Digitos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;

		System.out.println("Ingrese un numero");
		numero = in.nextInt();
		
		Digitos.mostrarDigitos(numero);

	}

	public static void mostrarDigitos(int numero) {
		int residuo, i;
		int array[] = new int[10];
		
		i = 0;
		
		while (numero > 0) {
			residuo = numero % 10;
			numero = numero / 10;
            array[i] = residuo;
            i++;	
		}
		
		for (int j = i-1; j>=0 ; j--) {
			
			System.out.print(" "+array[j]);
		}
	}

}
