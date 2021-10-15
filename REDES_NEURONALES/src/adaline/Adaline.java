package adaline;

public class Adaline {

	public static void main(String[] args) {
		//declaramos variables de entrada
		double x1[] = new double[4];
		double x2[] = new double[4];
		
		//variables de variacion de pesos
		double wsa[] = new double[4]; //neurona intermedia 1
		double wsb[] = new double[4]; //neurona intermedia 2
		double us[] = new double[4]; //umbral
		
		
		//derivada de los pesos
		double Dwsa[] = new double[4]; //neurona intermedia 1
		double Dwsb[] = new double[4]; //neurona intermedia 2
		double Dus[] = new double[4]; //Derivada umbral
		
		
		//postsinaptico
		double h[] = new double[4];
		
		double epsilon = 0.01;//definimos una constante de aprendizaje
        
		//variables temporales a usar durante las operaciones
		
		double suma1 = 0;
		double suma2 = 0;
		double suma3 = 0;
		
		int numero_ejemplos = 4;
		
		double y = 0;
		double t[] = new double[4];
		
		//inicializacion de los pesos con valores aleatorios
		
		wsa[0] = wsb[0] = us[0] = Dwsa[0] = Dwsb[0] = Dus[0] = 0.34;
		wsa[1] = wsb[1] = us[1] = Dwsa[1] = Dwsb[1] = Dus[1] = 0.44;
		wsa[2] = wsb[2] = us[2] = Dwsa[2] = Dwsb[2] = Dus[2] = 0.64;
		wsa[3] = wsb[3] = us[3] = Dwsa[3] = Dwsb[3] = Dus[3] = 0.78;
		
		//Definimos entradas posibles
 		/* x1 x2  
		 * 0 0 -> 1 //resultado deseado
		 * 0 1 -> 2 //resultado deseado
		 * 1 0 -> 3 //resultado deseado
		 * 1 1 -> 4 //resultado deseado
		 * 
		 * */
		
		x1[0] = (-1); // 0 0
		x2[0] = (-1); //
		x1[1] = (-1); // 0 1
		x2[1] = (1);
		x1[2] = (1); // 1 0
		x2[2] = (-1);
		x1[3] = (1); // 1 1
		x2[3] = (1);
		
		//le damos valores deseado a la red
		t[0] = 1 ;
		t[1] = 2 ;
		t[2] = 3 ;
		t[3] = 4 ;
		
		//imprimir pesos
		
		System.out.println(" Pesos Iniciales: \n");
		for (int i = 0; i < 4; i++) {
			System.out.println("w("+(i)+")"+" "+wsa[i]);			
		}
		
		System.out.println("\n Umbral inicial \n");
		System.out.println("us "+us[0]+"\n");
		
		//calculos de la red ..aprendizaje supervisado
		//iteraciones = 1000 para iniciar
		for (int i = 0; i < 1000; i++) {
			
			for (int j = 0; j < numero_ejemplos ; j++) {
				h[j] = ( (x1[j]* wsa[j] ) + ( x2[j] * wsb[j] ) - (us[j]) );
				
				y = h[j];
				
				//calculamos las variaciones de los pesos W
				Dwsa[j] = (  (epsilon * ( t[j]  - y ) )*x1[j] );
				Dwsb[j] = (  (epsilon * ( t[j]  - y ) )*x2[j] );
				Dus[j] = ( epsilon * (t[j] - y) * (-1) ) ;
				
				//calculamos nuevos pesos
				suma1 = suma1 + Dwsa[j];
				suma2 = suma2 + Dwsb[j];
				suma3 = suma3 + Dus[j];
				
				//actualizamos los pesos
				wsa[j] = suma1 + Dwsa[j];
				wsb[j] = suma2 + Dwsb[j];
				us[j] = suma3 + Dus[j];
				
			}
		}
		
		//imprimimos resultados
		
		for (int i = 0; i < 4; i++) {
			double salida = ( x1[i]*wsa[0] + x2[i]*wsb[0] - us[0] );
			System.out.println("Salida X1 X2 \n"+x1[i]+" "+x2[i]+" ");
			System.out.println("Salida deseada "+t[i]+"\n");
			System.out.println("Salida real "+salida);
			salida = 0;
		}
		
		
	} 

}
