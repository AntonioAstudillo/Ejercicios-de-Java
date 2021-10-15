package ejercicios;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class EventosTeclado {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         MarcoConTeclas mimarco=new MarcoConTeclas();  
         mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	
	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas()
	{
		setVisible(true);
		setBounds(700,300,600,450);
		
		//asi le indicamos al marco
		//el objeto oyendo
		EventoDeTeclado tecla=new EventoDeTeclado();		
		//la ponemos a la escucha		
		addKeyListener(tecla);
		
		
		
	}	
}

//construir nuestro objeto oyente

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e)
	{
       //int codigo;
       
      // codigo=e.getKeyCode();
       
       //System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
			
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
		char letra;
		
		letra=e.getKeyChar();
		
		System.out.println(letra);
		
		
		
	}
	//eclipse nos obliga a implementar
	//los tres metodos de la clase keylISTENER

     

}