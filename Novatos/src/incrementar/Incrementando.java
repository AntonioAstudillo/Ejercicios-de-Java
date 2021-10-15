package incrementar;

public class Incrementando {

	static int numero = 15;
	
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 0;
		Incrementando.numero++;
		
		
		z = x++ + y ;
		
		System.out.println("El valor de z es: "+z);
		System.out.println("El valor de x despuesde la suma es: " + x);

	}

}
