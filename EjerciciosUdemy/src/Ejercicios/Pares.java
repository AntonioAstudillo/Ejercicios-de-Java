package Ejercicios;

public class Pares {
	
	private int n;
	private int m;
	
	public Pares(int n , int m){
		this.n = this.validarNumero(n);
		this.m = this.validarNumero(m);
	}
	
	public void mostrarPares() {
		int i;
		
		this.validarNumero();
		System.out.printf("Mostrando los numeros pares entre %d  y %d: ",this.n,this.m);
		
		for(i=this.n; i<=this.m; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
	}
	
	private int validarNumero(int numero) {
		return (numero>=1 && numero <=100)?numero:1;
	}
	
	private void validarNumero() {
		if(this.n>this.m) {
			int aux = n;
			this.n = this.m;
			this.m = aux;
		}
	}

}
