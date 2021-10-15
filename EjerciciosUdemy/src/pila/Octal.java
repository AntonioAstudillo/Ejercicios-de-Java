package pila;

public class Octal {
	
	private int valor;
	private int residuo;
	private int contador;
	Pila objeto;
	
	public Octal(int valor) {
		this.valor = valor;
		this.residuo = 0;
		objeto = new Pila();
	}
	
	//en esta funcion ire rompiendo el numero en digitos por medio del residuo
	private void divirNumero() {
		
		while(valor>=1) {
			residuo = valor %8;
			valor = valor / 8;
			objeto.agregarValor(residuo);
		}
		
	}
	
	public void mostrarNumero() {
		int i=0;
		int aux;
		
		divirNumero();
		
		do{
			aux = objeto.obtenerValor();
			if(aux!=-1) {
				System.out.print(aux);
			}
			
			
		}while(aux!=-1);
	}
	
	

}
