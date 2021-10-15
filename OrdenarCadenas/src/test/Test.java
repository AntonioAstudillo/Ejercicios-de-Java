package test;

import ordenarCadenas.Cadenas;

public class Test {

	public static void main(String[] args) 
	{
		String matriz [] = {"Mexico" ,"Argentina", "Brasil" , "Colombia" , "Peru" , "Holanda"};
		Cadenas objeto = new Cadenas();
		
		objeto.ordenarMatriz(matriz);
		objeto.getMatriz();
	    
	}

}
