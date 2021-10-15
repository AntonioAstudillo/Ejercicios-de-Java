package arreglos;

public class Test {

	public static void main(String[] args) {
		
		
		Ejercicio3 objeto = new Ejercicio3(24);
		int a[] = new int[12];
		int b[] = new int[12];
		
		a = objeto.pedirElementos(a);
		b = objeto.pedirElementos(b);
		
		objeto.mezclarTercerForma(a, b);
		objeto.mostrarElementos(); 
		
        
	
		

	}

}
