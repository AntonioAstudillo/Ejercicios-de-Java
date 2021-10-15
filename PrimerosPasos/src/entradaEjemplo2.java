import javax.swing.*;
public class entradaEjemplo2 {

	public static void main(String[] args) 
	{
		//el metodo JOptionPane.showInputDiaglo regresa un string
		//para utilizar un valor numerico tenemos que convertir
		//por el metodo parseInt
		int edad;
		
		String nombreUsuario=JOptionPane.showInputDialog("INTRODUCETU NOMBRE");
		String edadUsuario=JOptionPane.showInputDialog("INTRODUCE TU EDAD");
		edad=Integer.parseInt(edadUsuario);
		
		edad++;
		
		System.out.println("HOLA " + nombreUsuario+"  tienes " + (edad)+ "  años");

	}

}
