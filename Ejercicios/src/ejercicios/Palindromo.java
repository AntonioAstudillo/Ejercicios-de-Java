package ejercicios;

import java.util.Scanner;

/*
 * Crear un programa que implemente una funcion que determine si una frase o palabra es palindromo
 * 
 * */


public class Palindromo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra o frase");
		String cadena = in.nextLine();
		
		if(Palindromo.isPalindromo(cadena)) {
			System.out.println("La cadena ingresada es palindromo");
		}else {
			System.out.println("La cadena ingresada no es palindromo");
		}

	}
	
	public static boolean isPalindromo(String palabra) {
		
		String aux = "";
		boolean bandera;
		bandera = false;
		palabra = palabra.replace(" ", "");
		
		int longitud = palabra.length();
		
		for (int i = longitud-1; i >=0; i--) {
			
			aux = aux.concat(Character.toString(palabra.charAt(i)));
			
		}
		
		if(palabra.equals(aux)) {
			bandera = true;
		}
		
		return bandera;
		
	}

}
