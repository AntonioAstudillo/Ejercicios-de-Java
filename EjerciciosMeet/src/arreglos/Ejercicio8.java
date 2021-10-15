package arreglos;

import java.util.Scanner;

public class Ejercicio8 {
    private int numero;
    private int posicion;
    private int i;
    
    public Ejercicio8(int numero , int posicion) {
    	
    	this.numero = numero;
    	this.posicion = posicion - 1;
    	this.i = 0;
    }
    
    public Ejercicio8() {
    	this.numero = 0;
    	this.posicion = 0;
    	this.i = 0;
    }
    
    
    public static void llenarArreglo(int a[] , Scanner in , int tam) {
    	
    	for (int i = 0; i < tam; i++) {
			System.out.print((i+1)+"- Ingrese numero ");
			a[i] = in.nextInt();
		}
    }
    
    public void insertarNumero(int a[]) {
    	
    	int aux[] = new int [10];
    	int iterador;
    	
    	iterador = 0;
    	
    	//muestro arreglo
    	mostrarArreglo(a);
    	
    	for (int i = 0; i < 9 ; i++) {
			
    		if(i == this.posicion) {
    			aux[iterador] = this.numero;
    			iterador++;
    		}
    		
    		aux[iterador] = a[i];
    		iterador++;
		}
    	
    	a = aux;
    	
    	mostrarArreglo(a);
    }
    
    public void mostrarArreglo(int a[]) {
      int lon = a.length;
      
      System.out.println("\nEl arreglo es: ");
      
      for (int i = 0; i < lon; i++) {
		   
    	  System.out.print(a[i]+" ");
	  }
    	
    }
    
    public int[] desplazarArreglo(int a[]) {
    	
    	int aux[] = new int[10];
    	int tam;
    	
    	tam = a.length; //mido el tamaño de mi arreglo
    	aux[0] =  a[tam-1]; //le asigno el ultimo elemento del arreglo
    	
    	
    	for (int i = 0; i <tam-1 ; i++) {			
    		aux[i+1] = a[i];
		}	
    	
    	return aux;
    }
    
    
}//cierra clase 
