package programas;

import java.util.*;

import javax.swing.JOptionPane;

public class TerminoMedio
{

	public static void main(String[] args) 
	{
		String termino =JOptionPane.showInputDialog("INGRESE PREMISA MAYOR");
		String terminoDos =JOptionPane.showInputDialog("INGRESE PREMISA MENOR");
		
		
		//convierto termino y terminoDos a minusculas
		termino=termino.toLowerCase();
		terminoDos=terminoDos.toLowerCase();
		
		//instancio dos objetos de la clase StringTokenizer y le mando como parametro al constructor de dicha clase de mis 2 objetos
		//mis dos terminos , para de esa manera empezar a trabajar con ellos
		StringTokenizer token1=new StringTokenizer(termino);
		StringTokenizer token2=new StringTokenizer(terminoDos);
		
		//palabra1 y palabra2 , me van a servir para ir capturando
		//los tokens creador por la clase StringTokenizer
		String palabra1 = null;
		String palabra2 = null;
		
		//un simple auxiliar que me va servir para comprobar si coinciden dos token
		String aux=null;
		
		//aqui voy a almacenar el valor de los dos token iguales
		String terminoMedio=null;
		
		//creo una lista en la cual voy a almacenar los valores de mi primer termino donde
		//los token o palabras no sean (los,las,son,esta,etc...)
		List palabrasReservadas = new ArrayList();
		//con este iterador voy a apuntar a las listas
		Iterator iterador = null;
		
		
	    //aqui voy rompiendo y comprobando
		//que las palabras de mi primer termino
		//no se encuentren dentro de la lista 
		//las palabras que no se encuentran en dicha lista
		//las voy guardando en otra lista
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
		{
			palabra2=token2.nextToken(); //a palabra2 le asigno el primer token de mi termino dos
			
			//System.out.println("valor de palabra: "+palabra2);
			
			//compruebo que palabra2 no pertenezca a la lista(los,las,son,es,etc..)
		    if(comprobandoPalabras(palabra2))
		    {//en caso de que no pertenezcan a la lista continuo con las comprobaciones
		
		       iterador=palabrasReservadas.iterator();//hago que mi iterador apunte a la lista de mi primer termino
		       //de todas las palabras que no eran (los,las,son,es,etc..)
		    	
		    	while(iterador.hasNext())
		    	{
		    		//ahora voy iterando sobre dicha lista
		    		
		    		aux=iterador.next().toString();//convierto en string cada posicion del iterador para posteriormente comprobar
		    		
		    		//System.out.println("valor de aux: "+aux);
		    		
		    		if(aux.equals(palabra2))
		    		{
		    			//si aux es igual a palabra2
		    			//le asigno a terminoMedio el valor de aux
		    		
		    			terminoMedio=aux;
		    			
		    		}
		    		
		    	}	
		    }
		    
		}
		
		
		
	    //aqui voy rompiendo y comprobando
		//que las palabras de mi primer termino
		//no se encuentren dentro de la lista 
		//las palabras que no se encuentran en dicha lista
		//las voy guardando en otra lista
		
		JOptionPane.showMessageDialog(null, "EL TERMINO MEDIO ES "+terminoMedio);
		generarPrimeraLetra(termino);
		
	    		
	}//cierra metodo main
	
	
	/*Este metodo (comprobandoPalabras) retorna false , si el dato mandado como parametro 
	 * coincide con alguna palabra de mi lista,caso contrario retorna true
	 * lo que significa que el dato mandado como parametro no coincide con ninguna palabra(los,las,toda,todas,etc..)
	 * 
	 * 
	 * */
	public static boolean comprobandoPalabras(String dato)
	{
		List lista = new ArrayList();
		Iterator iterador;
		String aux;
		
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
	
	public static boolean comprobarParticulares(String dato)
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
	public static boolean comprobarUniversales(String dato)
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
	public static boolean negativas(StringTokenizer dato)
	{
		String aux;
	
		
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
	
	public static void generarPrimeraLetra(String termino)
	{
		StringTokenizer token =new StringTokenizer(termino);
		char letra1 ;
		letra1=' ';
		String palabra1=null;
			
		while(token.hasMoreElements())
		{
			palabra1=token.nextToken();
			
		    if(comprobarParticulares(palabra1))
		    {
		    	if(negativas(token))
		    	{
		    		letra1='O';
		    	}
		    	else
		    	{
		    		letra1='I';
		    	}
		    }
		    else
		    {
		    	if(!palabra1.equals("ninguna") || palabra1.equals("ningun"))
		    	{
		    		if(comprobarUniversales(palabra1))
		    		{
		    			if(negativas(token))
		    			{
		    				letra1='E';
		    			}
		    			else
		    			{
		    				letra1='A';
		    			}
		    		}
		    	}
		    	else
		    	{
		    		letra1='E';
		    	}
		    }//cierra else
		
		}//cierra while
		
		JOptionPane.showMessageDialog(null, "LA PRIMERA LETRA ES "+letra1);
		
	}//cierra metodo
	
}