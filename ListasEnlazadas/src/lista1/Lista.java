package lista1;

public class Lista {
   private Nodo primero;
   private int numElem;
   
   public Lista() {
	   primero = null;
	   numElem = 0;
   }
   
   public void insertarPrimero(int elemento) {
	   Nodo nuevo = new Nodo(elemento,primero);
	   primero = nuevo;
	   numElem++;
   }
   
   public void insertarFinal (int elemento) {
	   Nodo nuevo = new Nodo(elemento,null);
	   
	   if(this.primero == null) {
		   primero = nuevo;
	   }else {
		   Nodo actual = primero;
		   
		   while(actual.getSiguiente()!=null) {
			   actual = actual.getSiguiente();
		   }
		   
		   actual.setSiguiente(nuevo);
		   numElem++;
		   
	   }
   }
   
   public void borrar (int elem) {
	   if(primero == null)
		   System.out.println("Lista Vacia");
	   else {
		   if(primero.getElemento()== elem) {
			   primero = primero.getSiguiente();
			   this.numElem--;
		   }else {
			   Nodo actual = primero;
			   while(actual.getSiguiente() != null && actual.getSiguiente().getElemento()!= elem) {
				   actual = actual.getSiguiente();
			   }
			   
			   if(actual.getSiguiente() == null) {
				   System.out.println("Elemento "+elem+" no esta en la lista");
			   }else {
				   actual.setSiguiente(actual.getSiguiente().getSiguiente());
				   this.numElem--;
			   }
		   }
	   }	   
   }
   
   public void listar() {
	   Nodo aux ;
	   
	   if(this.primero == null) {
		   System.out.println("No hay elementos en la lista");
	   }else {
		   aux = primero;
		   System.out.println("Los elementos de la lista son: ");
		   while(aux.getSiguiente() != null) {
			   System.out.print(aux.getElemento()+" ");
			   aux = aux.getSiguiente();
		   }
	   }
   }
}
