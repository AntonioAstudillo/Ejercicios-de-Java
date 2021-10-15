package pilas;

public class testPila {

	public static void main(String[] args) 
	{
		Pila p =  new Pila();
		p.poner('S');
		p.poner('B');
		p.poner('5');
		
		System.out.println(p.sacar());
		System.out.println(p.sacar());
		System.out.println(p.sacar());

	}

}
