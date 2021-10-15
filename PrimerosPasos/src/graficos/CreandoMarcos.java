package graficos;

import java.awt.Frame;

import javax.swing.*;


public class CreandoMarcos {

	public static void main(String[] args) 
	{
	  MiMarco marco1 = new MiMarco();

	  //hacemos visible la ventana 
	  //con el metodo setVisible
	  
	  marco1.setVisible(true);
	  marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	}

}

class MiMarco extends JFrame
{
	public MiMarco()
	{
		//establezo el tamaño que va tener mi ventana		
		//setSize(500,300);
		//setLocation(600,300);
		
		//este metodo da ancho y alto y posiciona
		//el marco en la pantalla
		setBounds(600,300,650,550);
		//con este metodo impedimo que el
		//el usuario juegue con la dimension
		//de mi marco
		setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//le damos un titulo al marco
		setTitle("Mi ventana");
		
		
	}
	
	
}