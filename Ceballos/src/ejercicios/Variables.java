package ejercicios;

public class Variables {
  
	public static void main(String[] args) {
		
		int numero1 , resultado;
		
		numero1=30;
		
		//no puedo acceder a numero2 fuera del bloque interno
		//pero si puedo acceder a numero1 y resultado dentro de ese bloque
		
		
		{//bloque interno
		    int numero2;
		    numero2=30;
		    
		    	System.out.println(numero2);
		    	resultado = numero1 + numero2;
		    	
		    	System.out.print(resultado);
		}//bloque interno
		
		
		

	}

}
