package pilas;

public class Pila<T>{
	
   private Nodo<T> p;
   
   public Pila() {
	   p = null;
   }
   
   public void poner(T v) {
	   Nodo<T> nuevo = new Nodo<T>();
	   nuevo.valor = v;
	   nuevo.sig = p;
	   p = nuevo;
   }
   
   public T sacar() {
	   Nodo<T> aux = p ;
	   T ret = aux.valor;
	   p = p.sig;
	   return ret;
   }
}
