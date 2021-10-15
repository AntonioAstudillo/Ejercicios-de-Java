package programas;
import java.util.*;

import javax.swing.JOptionPane;

public class Silogismos
{
	
	private String palabra1;
	private String palabra2;
	private String aux; //un simple auxiliar que me va servir para comprobar si coinciden dos token.
    private String terminoMedio; //aqui voy a almacenar el valor de los dos token iguales.
    private	Iterator iterador; //con este iterador voy a apuntar a las listas
    private StringTokenizer token1; 
	private StringTokenizer token2;
	private String modo;
	
    //creo una lista en la cual voy a almacenar los valores de mi primer termino donde
  	//los token o palabras no sean: los,las,son,esta,etc...
  	private	List palabrasReservadas;
    
    //constructor
    public Silogismos(String termino1 , String termino2)
	{
	  token1 = new  StringTokenizer(convertirMinusculas(termino1));
	  token2 = new  StringTokenizer(convertirMinusculas(termino2));
	  aux = null;
	  terminoMedio = null;
	  palabra1 = null;
	  palabra2 = null;
	  palabrasReservadas = new ArrayList();
	  modo = null;
	 
	}
    
    //metodo para calcular la premisa
    
    public String calcularPremisa(String frase , String terminoMedio)
    {
    	StringTokenizer aux;
    	String palabraAux;
    	String premisa = "";
    	
    	aux = new  StringTokenizer(convertirMinusculas(frase));
    	
    	while(aux.hasMoreElements())
		{
			palabraAux=aux.nextToken();
			
		//	if(palabraAux.equals("estan") || palabraAux.equals("son"))
		  //  {
		    //	   premisa = premisa.concat(palabraAux);
		   // }
			
		    if(comprobandoPalabras(palabraAux))
		    {	    	
		       	
		       if(!palabraAux.equals(terminoMedio))
		       {
		    	   premisa = premisa.concat(palabraAux);
		       }
		    }
		       
		}//cierra while  
    	
    	
    	return premisa;
    }
    
    
	
    
   public int calcularFigura(String frase1 , String frase2 , String terminoMedio , String premisaMenor , String premisaMayor)
   {
	   StringTokenizer palabra1 = new  StringTokenizer(convertirMinusculas(frase1));
	   StringTokenizer palabra2 = new  StringTokenizer(convertirMinusculas(frase2));
	   int contador = 0 ;
	   String aux;
	   int numero1=0 , numero2=0 , numero3=0 , numero4=0 , figura=0 ;
	   
	   while(palabra1.hasMoreElements())
	   {
		   contador++;
		   
		   aux=palabra1.nextToken();
		   
		   if(aux.equals(premisaMayor))
		   {
			   numero1=contador;
		   }
		   else if(aux.equals(terminoMedio))
		   {
			   numero2=contador;
		   }   
	   }//cierra primer while
	   
	   contador=0;
	   
	   while(palabra2.hasMoreElements())
	   {
		   contador++;
		   
		   aux=palabra2.nextToken();
		   
		   if(aux.equals(premisaMenor))
		   {
			   numero3=contador;
		   }
		   else if(aux.equals(terminoMedio))
		   {
			   numero4=contador;
		   }   
	   }
	   
	   if(numero2 < numero1)
	   {
		   if(numero4>numero2)
		   {
			   figura=1;
		   }
	   }
	    if(numero1<numero2)
	   {
		   if(numero3<numero4)
		   {
			   figura=2;
		   }
	   }
	   if(numero2<numero1 && numero4<numero3)
	   {
		   figura=3;
	   }
	   
	   return figura;
   }
    
    
    
	private String convertirMinusculas(String dato)
	{
		dato=dato.toLowerCase();
		
		return dato;
	}
	

	public String obtenerTerminoMedio()
	{
		while(token1.hasMoreElements())
		{
			palabra1=token1.nextToken();
			
		    if(comprobandoPalabras(palabra1))
		    {	    	
		       palabrasReservadas.add(palabra1);		      
		    }
		       
		}//cierra while  
		
		    
		//ahora hago que mi iterador apunte a la lista creada
		//en el bucle de arriba 
		iterador=palabrasReservadas.iterator();
		
		//ahora voy reccoriendo mi segundo termino 
		while(token2.hasMoreElements())
		{//abre while 1
			palabra2=token2.nextToken(); //a palabra2 le asigno el primer token de mi termino dos
			
			//System.out.println("valor de palabra: "+palabra2);
			
			//compruebo que palabra2 no pertenezca a la lista(los,las,son,es,etc..)
		    if(comprobandoPalabras(palabra2))
		    {//en caso de que no pertenezcan a la lista continuo con las comprobaciones
		
		       iterador=palabrasReservadas.iterator();//hago que mi iterador apunte a la lista de mi primer termino
		       //de todas las palabras que no eran (los,las,son,es,etc..)
		    	
		    	while(iterador.hasNext())
		    	{//abre while 2
		    		//ahora voy iterando sobre dicha lista
		    		
		    		aux=iterador.next().toString();//convierto en string cada posicion del iterador para posteriormente comprobar
		    		
		    		//System.out.println("valor de aux: "+aux);
		    		
		    		if(aux.equals(palabra2))
		    		{
		    			//si aux es igual a palabra2
		    			//le asigno a terminoMedio el valor de aux
		    			terminoMedio=aux;	
		    		}//cierra if
		    	}//cierra while	2
		    }//cierra if   
		}//cierra while 1
		
		return terminoMedio;
	}//cierra metodo obtenerTerminoMedio
	

	
	private boolean comprobandoPalabras(String dato)
	{
		
		/* Este metodo (comprobandoPalabras) retorna false , si el dato mandado como parametro 
		 * coincide con alguna palabra de mi lista,caso contrario retorna true
		 * lo que significa que el dato mandado como parametro no coincide con ninguna palabra(los,las,toda,todas,etc..)
		 * */
		
		List lista = new ArrayList();

		lista.add("los");
		lista.add("las");
		lista.add("toda");
		lista.add("todos");
		lista.add("ningun");
		lista.add("ninguna");
		lista.add("son");
		lista.add("de");
		lista.add("algunas");
		lista.add("algun");
		lista.add("es");
		lista.add("algunos");
		lista.add("no");
		lista.add("esta");
		lista.add("estan");
		lista.add("todas");
		lista.add("era");
		
		iterador=lista.iterator();//con esta instruccion mi iterador empieza a apuntar a la lista
		
		while (iterador.hasNext())//mientras exista otro token en mi String
		{
			aux=iterador.next().toString();
			
			if(dato.equals(aux))
			{
				return false;
			}
			
		}
			
		return true;
	}
	
	private boolean comprobarParticulares(String dato)
	{
		
		//Este metodo retorna true si el dato recibido como parametro
		// se encuentra en la listaParticulares , si no se encuentra
		//retorna false;
		
		List listaParticulares = new ArrayList();
		Iterator iterador;
		String palabra;
	
		
		listaParticulares.add("algunos");
		listaParticulares.add("alguna");
		listaParticulares.add("algunas");
		listaParticulares.add("algun");
		
        iterador=listaParticulares.iterator();//con esta instruccion mi iterador empieza a apuntar a la lista
		
		while (iterador.hasNext())//mientras exista otro token en mi String
		{
			palabra=iterador.next().toString();
			
			if(dato.equals(palabra))
			{
				return true;
			}
			
		}
	
		return false;
	}
	
	//este metodo funciona igual que el metodo comprobarParticulares
	//retorna true si encuentra una coincidencia
	//de lo contrario retorna false;
	private boolean comprobarUniversales(String dato)
	{
		List listaUniversales = new ArrayList();
		Iterator iterador;
		String palabra;
	
		
		listaUniversales.add("todos");
		listaUniversales.add("todas");
		listaUniversales.add("todo");
		listaUniversales.add("toda");
		
        iterador=listaUniversales.iterator();//con esta instruccion mi iterador empieza a apuntar a la lista
		
		while (iterador.hasNext())//mientras exista otro token en mi String
		{
			palabra=iterador.next().toString();
			
			if(dato.equals(palabra))
			{
				return true;
			}
			
		}
	
		return false;
		
	}
	
	//solo busco que se encuentre la palabra no 
	private boolean negativas(StringTokenizer dato)
	{
		
		while(dato.hasMoreElements())
		{
			aux=dato.nextToken();
			
		    if(aux.equals("no"))
		    {
		    	return true;
		    }
		
		}
		
		return false;
	}
	
	public char generarLetra(String termino)
	{
		termino=convertirMinusculas(termino);
		StringTokenizer token =new StringTokenizer(termino);
		char letra;
		letra=' ';
			
		while(token.hasMoreElements())
		{
			palabra1=token.nextToken();
			
		    if(comprobarParticulares(palabra1))
		    {
		    	if(negativas(token))
		    	{
		    		letra='O';
		    	}
		    	else
		    	{
		    		letra='I';
		    	}
		    }
		    else
		    {//abre else 1
		    	
		    	if(palabra1.equals("ninguna")) 
		    	{
		    		letra='E';
		    	}
		    	else if(palabra1.equals("ningun"))
		    	{
		    		letra='E';
		    	}
		    	else
		    	{//abre else 2

		    		if(comprobarUniversales(palabra1))
		    		{
		    			if(negativas(token)){
		    				letra='E';
		    			}
		    			else{
		    				letra='A';
		    			}
		    		}
		    		
		    	}//cierra else 2
		    	
		    }//cierra else 1
		
		}//cierra while
		
		return letra;
		
	}//cierra metodo
	
	public String determinarModo(char letraA , char letraB , char letraC , int figura)
	{
		switch(figura)
		{
		   case 1:
			     if(letraA=='A' && letraB=='A' && letraC =='A')
			     {
			    	 modo = "BARBARA";
			     }
			     else if(letraA=='E' && letraB=='A' && letraC =='E')
			     {
			    	 modo = "CELARENT";
			     }
			     else if(letraA=='A' && letraB=='I' && letraC =='I')
			     {
			    	 modo = "DARII";
			     }
			     else if(letraA=='E' && letraB=='I' && letraC =='O')
			     {
			    	 modo = "FERIO";
			     }
			     else 
			     {
			    	 modo = "X";
			     }
			  break;
		   case 2:
			   if(letraA=='E' && letraB=='A' && letraC =='E')
			     {
			    	 modo = "CESARE";
			     }
			     else if(letraA=='A' && letraB=='E' && letraC =='E')
			     {
			    	 modo = "CAMESTRES";
			     }
			     else if(letraA=='E' && letraB=='I' && letraC =='O')
			     {
			    	 modo = "FESTINO";
			     }
			     else if(letraA=='A' && letraB=='O' && letraC =='O')
			     {
			    	 modo = "BAROCO";
			     }
			     else 
			     {
			    	 modo = "X";
			     }
			   
			   break;
		   case 3:
			   if(letraA=='A' && letraB=='A' && letraC =='I')
			     {
			    	 modo = "DARAPTI";
			     }
			     else if(letraA=='A' && letraB=='I' && letraC =='I')
			     {
			    	 modo = "DATISI";
			     }
			     else if(letraA=='E' && letraB=='A' && letraC =='O')
			     {
			    	 modo = "FELAPTON";
			     }
			     else if(letraA=='E' && letraB=='I' && letraC =='O')
			     {
			    	 modo = "FERISON";
			     }
			     else if(letraA=='O' && letraB=='A' && letraC =='O')
			     {
			    	 modo = "BOCARDO";
			     }
			     else if(letraA=='I' && letraB=='A' && letraC =='I')
			     {
			    	 modo = "DISAMIS";
			     }
			     
			     else
			     {
			    	 modo = "x";
			     }
			   break;
		}//cierra switch
		
		return modo ;
	}
	
	public char generarLetra(char letra1,char letra2)
	{
		char letraConclusion;
		letraConclusion=' ';
		
		if(letra1=='A' && letra2=='A')
		{
			letraConclusion=letra1;
		}
		else if(letra1=='A' && letra2!='A'){
			letraConclusion=letra2;
		}
		else if(letra2=='A')
		{
			letraConclusion=letra1;
		}
		
		else if(letra1 == 'E' && letra2 == 'I')
		{
			letraConclusion='O';
		}
		else if(letra1=='I' && letra2=='E')
		{
			letraConclusion='O';
		}
		else if(letra1=='I' && letra2=='O')
		{
			letraConclusion='O';
		}
		else if(letra1=='O' && letra2=='I')
		{
			letraConclusion='O';
		}
		else
		{
			JOptionPane.showMessageDialog(null, "NO HAY CONCLUSION", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
				
		
		
		
		
		
		return letraConclusion;
	}
	
	
	public String generarConclusion(String premisaMenor , String premisaMayor , char letra)
	{
		String conclusion = "";
		
		switch(letra)
		{
		
		case 'I':
			conclusion = "ALGUNOS SERES " + premisaMenor + " SON " + premisaMayor;
		 break;
		case 'A':
			 conclusion = "TODOS LOS " + premisaMenor + " SON " + premisaMayor;
       	break;
		case 'E':
			conclusion = "NINGUN " + premisaMenor + " ES" + premisaMayor;
			break;
		case 'O':
			conclusion = "AlGUNOS "+ premisaMenor + " NO SON " + premisaMayor;
			break;
		 
		  
		
		}
		
		
		return conclusion.toUpperCase();
	}
	
}
