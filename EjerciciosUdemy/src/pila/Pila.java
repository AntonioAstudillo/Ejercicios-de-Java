package pila;

public class Pila {
	
	private Nodo p;
	
	public Pila() {
		p = null;
	}
	
	public void agregarValor(int valor) {
		Nodo nuevo = new Nodo();
		nuevo.valor = valor;
		nuevo.sig = this.p;
		p = nuevo;
	}
	public int obtenerValor() {
		Nodo aux = p;
		int valor = -1;
		
		 if(aux!=null) {
			 
			 valor = aux.valor;
			 p = aux.sig;
		 }
		 
		return valor;
		
	}

}
