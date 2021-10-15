import javax.swing.*;
public class EntradaNumeros {

	public static void main(String[] args) 
	{
		double x;
		String num1=JOptionPane.showInputDialog("INTRODUCE UN NUMERO");
		
		x=Double.parseDouble(num1);
		
        System.out.print("LA RAIZ DE "+num1+" ES ");
		System.out.printf("%1.2f",Math.sqrt(x));

	}

}
