package arreglos;

import java.util.Scanner;

public class Ejercicio1 {
	
   private final int cantidadE; 
   protected int arreglo[];
   private int i;
   
   public Ejercicio1(int valor) {
	   this.cantidadE = valor; 
	   arreglo = new int[this.cantidadE];
	   i = 0;
   }
   
   public Ejercicio1() {
	   this.cantidadE = 10; 
	   arreglo = new int[this.cantidadE];
	   i = 0;
   }
   
   public void pedirElementos() {
	    
	   Scanner in = new Scanner(System.in);
	   
	   for(i=0; i<this.cantidadE; i++) {
		   System.out.println("Ingrese numero "+(i+1));
		   this.arreglo[i] = in.nextInt();
	   }
   }
   
   public void mostrarElementos() {
	   
	   System.out.println("\n\nMostrando Elementos del arreglo:");
	   for(int elemento: this.arreglo) {
		   System.out.print(elemento+" ");
	   }
   }
   
   public void mostrarInverso() {
	   
	   System.out.println("\nMostrando Elementos del arreglo modo inverso:");
	   for(this.i=this.cantidadE-1; i>=0; i--) {
		   System.out.print(this.arreglo[i]+"  ");
	   }
   }
   
   public void Promedio() {
	   
	   float negativos = 0;
	   float positivos=0;
	   int contPo=0 , contNeg=0 , contCeros=0;
	   
	   for(int elemento:this.arreglo) {
		   
		   if(elemento<0) {
			   negativos = negativos + elemento;
			   contNeg++;
			   
		   }else if(elemento>0){
			   positivos = positivos + elemento;
			   contPo++;
		   }
		   else {
			   contCeros++;
		   }
	   }
	   
	  positivos = positivos / contPo;
	  System.out.println("\nMedia de positivos:  "+(positivos));
	  System.out.println("\nMedia de negativos  "+(negativos/contNeg));
	  System.out.println("\nCantidad de ceros:  "+contCeros);
   }
   
   /*Con este metodo, voy a mostrar los elementos de mi arreglo
   primeroUltimo segundoPenultimo, etc..*/
   public void mostrarDiferente() {
	   int ultimo = this.cantidadE-1;
	   
	   System.out.println("\n\nMostrando Elementos de forma diferente: ");
	   
	   for ( i = 0; i < this.cantidadE; i++) {
		
		   if(ultimo < i) {
			   break;
		   }
		   
		   System.out.print(this.arreglo[i] + " ");
		   System.out.print(this.arreglo[ultimo]+" ");
		   ultimo--;	   
	}
   }

   public void llenarConAleatorios() {
	   for (i = 0; i < arreglo.length; i++) {
		 this.arreglo[this.i] = (int) Math.floor(Math.random()*99+1);
	}
   }
   
}
