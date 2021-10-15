import java.util.*; //paquete para utilizar el constructor Scanner

public class entradaEjemplo1 {

	public static void main(String[] args)
	{   // el system.in le indico que quiero los datos de entrada
		Scanner objetoEntrada = new Scanner(System.in); //creo un objeto DE TIPO Scanner
		//creo dos variables , una de tipo string y la otra de tipo int 
		String nombre;
		int edad;
		
		//le pido al usuario que me ingrese su nombre
		System.out.println("INTRODUCE TU NOMBRE");		
		nombre=objetoEntrada.nextLine();
		
		System.out.println("INTRODUCE TU EDAD");
		edad=objetoEntrada.nextInt();
		
		System.out.print("HOLA "+nombre+" TU EDAD ES "+edad);

	}

}
