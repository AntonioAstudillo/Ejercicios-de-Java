package ejercicio;

public class Collatz 
{
   private int i;
	
	
	private int isPar(int numero)
	{
		
		numero = numero / 2;
		
		return numero;
	}
	
	private int isImpar(int numero)
	{
		
		numero = (numero*3) + 1;
		
		return numero;
	}
	

	public void calcular(int numero)
	{
		while(numero>1)
		{
			System.out.print(numero+" ");
			
			if(numero % 2 ==0)
			{
				numero = isPar(numero);
			}
			else
			{
				numero = isImpar(numero);
			}	
		}
		
		System.out.println(1);
	}

	
	public int sumar(int numero)
	{
		return 0;
	}
	
	public double sumar()
	{
		return 1.1;
	}
	
}
