package ejercicios;

public class Validaciones
{
      
	
	public static boolean validarCedula(String cedula)
	{
		//este metodo retorna false si el dato es incorrecto
		
		if( (cedula.length()!=8) )
		{
			return false;
		}
		
		else
		{
			try
			{
	    		 Integer.parseInt(cedula);
	    	     return true;
	    	}
			catch (NumberFormatException e)
			{
	    		return false;
	    	}
		}//cierra else
		
	}//cierra metodo
	
	
	
	public static boolean validarNss(String nss)
	{
		//este metodo retorna true si el dato es valido
		//caso contrario retorna false
		
		if( (nss.length()!=9) )
		{
			return false;
		}
		
		else
		{
			try
			{
	    		 Integer.parseInt(nss);
	    	     return true;
	    	}
			catch (NumberFormatException e)
			{
	    		return false;
	    	}
		}//cierra else
		
	}
	
   public static boolean validarSueldo(String sueldo)
   {
	   //este metodo retorna false , si el dato (sueldo) es invalido
	   //caso contrario retorna true
	   int i ; 
       boolean bandera;
       char letra;
       int longitud;
       
       bandera=true;
       
       longitud = sueldo.length();
       
       if(longitud<3 || longitud>5)
       {
       	bandera=false;
       }
       else
       {
       	 for(i=0; i<longitud; i++)
            {
            	letra = sueldo.charAt(i);
            	
            	if(!Character.isDigit(letra))
            	{
            		bandera=false;
            		break;
            	}
            }
       }
       
       return bandera;
       
   }//cierra metodo validar sueldo
	
}
