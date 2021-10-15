package Banco;

import java.util.Scanner;

public class ProbarCajero {

	public static void main(String[] args) {
		
		Cajero objeto = new Cajero();
		Scanner entrada = new Scanner(System.in);
		int opcion;
		double cantidad;
		
		
		do
		{
			System.out.println("ELIJA UNA OPCION\n1-IngresarDinero\n2-RetirarDinero\n3-AbonarIntereses"
					+ "\n4-SaldoActual");
			opcion = entrada.nextInt();
			
						
			switch(opcion){
			   case 1:
				     System.out.println("ESCRIBA LA CANTIDAD QUE DESEA INGRESAR");
				     cantidad = entrada.nextDouble();
				     objeto.ingresarDinero(cantidad);
				     
				   break;
			   case 2:
				     System.out.println("ESCRIBA LA CANTIDAD QUE DESEA RETIRAR");
				     cantidad = entrada.nextDouble();
				     objeto.retirarDinero(cantidad);
				    break;
			   case 3:
				     System.out.println("ESCRIBA LA CANTIDAD QUE DESEA ABONAR");
				     cantidad = entrada.nextDouble();
				     objeto.retirarDinero(cantidad);
				   break;
			   case 4:
				    System.out.println("SU SALDO ACTUAL ES"+objeto.obtenerSaldo());
				   break;
			}
			

		
			
		}while(opcion!=5);
		
		
	}//cierra metodo main
}//cierra clase ProbarCajero
