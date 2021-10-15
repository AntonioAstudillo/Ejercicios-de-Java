
public class manipulacionCadenas {

	public static void main(String[] args)
	{
        int ultimaLetra;
		String nombre = "jesus antonio astudillo jaimes";
		
		
		ultimaLetra=nombre.length()-1;
		
        System.out.println("MI NOMBRE ES "+nombre);
        System.out.println("Mi nombre tiene " +nombre.length()+ " LETRAS");
        System.out.println("LA quinta letra de mi nombre es " + nombre.charAt(4));;
        System.out.println("LA ULTIMA LETRA DE TU NOMBRE ES "+nombre.charAt(ultimaLetra));

	}

}
