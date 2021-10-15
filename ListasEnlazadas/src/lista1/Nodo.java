package lista1;

public class Nodo {
  private int elemento;
  private Nodo siguiente;
  
  public Nodo(int elem , Nodo sig) {
	  this.elemento = elem;
	  this.siguiente = sig;
  }
  
  public Nodo getSiguiente() {
	  return siguiente;
  }
  
  public void setSiguiente(Nodo sig) {
	  this.siguiente = sig;
  }
  
  public void setElemento(int elem) {
	  elemento = elem;
  }
  
  public int getElemento() {
	  return this.elemento;
  }
}
