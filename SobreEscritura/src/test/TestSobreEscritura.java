package test;

import domain.*;

public class TestSobreEscritura {
       
	public static void main(String[]args) {
	
		
		//aplicando polimorfismo
		Empleado empleado = new Empleado ("Juan" , 5000);
		Gerente gerente = new Gerente("Karla",10000, "Contabilidad");
		
		imprimir(empleado);
		imprimir(gerente);	
	}
	
	public static void imprimir(Empleado empleado) {
		System.out.println("Empleado = "+empleado.obtenerDetalles());
	}
}
