package test;

import piedrasFilosofales.PiedrasFilosofales;

public class Test {

	public static void main(String[] args) 
	{
		int acumulador;
		PiedrasFilosofales objeto = new PiedrasFilosofales(8,10);
			
		 acumulador = objeto.recojerPiedras();

		 System.out.println(acumulador);
	}

}
