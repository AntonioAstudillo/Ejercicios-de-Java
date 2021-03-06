package ejercicio1;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Crea un ArraList y rellenalo con una cantidad aleatoria de numeros aleatorios de entre
 * 1 y 10. Por ejemplo, en una iterracion lo puedes rellenar con 20 numeros y en otra lo puedes
 * rellenar con 14 numeros. 
 * 
 * @author Antonio
 *
 */
public class ListaDinamica {
  private ArrayList<Integer> lista;
  
  public ListaDinamica() {
	  lista = new ArrayList<Integer>();
  }
  
  public void llenarLista(int cantidad) {
	  
	  for (int i = 0; i < cantidad; i++) {
		lista.add(generarAleatorio());
	}
  }
  
  public void MostrarAlternativa() {
	  
	  for(Object v : this.lista) {
		  System.out.print(v + " ");
	  }
  }
  
  /*
  public void iterarListar() {
	 Iterator it = this.lista.iterator();
	
  } */
  
  
  
  public void MostrarLista() {
	  int aux = lista.size();
	  int i = 0;
	  
	  while(i < aux) {
		  System.out.print(lista.get(i)+" ");
		  ++i;
	  }
  }
  
  private int generarAleatorio() {
	  return (int) ((Math.random() * 10) + 1);
  }
}
