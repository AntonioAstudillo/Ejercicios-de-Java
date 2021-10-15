package pajaro;

public class Ejercicio17 {
      
     
     public Ejercicio17(int valor) {
    	 tablaMultiplicar(valor);
     }
     
     private void tablaMultiplicar(int numero) {
    	 for (int i = 1; i <=10; i++) {
			 System.out.println(numero+" x "+i+" = "+(i*numero));
		}
     }
}
