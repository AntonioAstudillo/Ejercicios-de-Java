package ejercicios;

public class probando {

	public static void main(String[] args) 
	{
		//este metodo retorna false 
		// si el dato es invalido
		String dato="=)(&/%$4";
        int i ; 
        boolean bandera;
        char letra;
        int longitud;
        
        bandera=true;
        
        longitud = dato.length();
        
        if(longitud<3 || longitud>5)
        {
        	bandera=false;
        }
        else
        {
        	 for(i=0; i<longitud; i++)
             {
             	letra = dato.charAt(i);
             	
             	if(!Character.isDigit(letra))
             	{
             		bandera=false;
             		break;
             	}
             }
        }
        
       
        if(bandera)
        {
        	System.out.print("Dato correcto");
        }
        else
        {
        	System.out.print("Dato incorrecto");
        }
       
		
	}
}
