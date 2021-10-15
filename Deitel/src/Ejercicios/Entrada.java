package Ejercicios;

import java.util.*;


public class Entrada {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int numero1 , numero2 , resultado;
		
		
		System.out.println("INGRESE UN NUMERO");
        numero1=entrada.nextInt();
        
        System.out.println("INGESE OTRO NUMERO");
        numero2=entrada.nextInt();
        
        resultado=numero1+numero2;
        
        System.out.print("LA SUMA DE LOS NUMEROS QUE INGRESO ES "+resultado);
        
	}

}
