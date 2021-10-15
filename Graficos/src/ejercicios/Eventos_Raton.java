package ejercicios;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MarcoRaton mimarco = new MarcoRaton();   
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}

class MarcoRaton extends JFrame
{
    public MarcoRaton()
    {
    	setVisible(true);
    	setBounds(700,300,600,450);
    	
    	//creamos una instancia de la clase
    	//que implementa MouseListener 
    	
    	//con el metodo addMouseListener
    	//ponemos ala escucha nuestro frame
    	
    	 EventosDeRaton eventoRaton = new EventosDeRaton();
    	
    	//con este metodo ponemos a nuestro marco ala escucha
    	
    	addMouseListener(eventoRaton);
    }
}

class EventosDeRaton implements MouseListener
{

	@Override
	public void mouseClicked(MouseEvent e) 
	{
        System.out.println("HAS HECHO CLIK");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE ENTRAR");
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE SALIR");
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE PRESIONAR");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE LEVANTAR");
		
	}
	
}


//CON LA CLASE ADAPTADORA MOUSEADAPTER
/*PUEDES HACER USO DE LOS METODOS
 * SIN NECESIDAD QUE TENER QUE
 * DECLARARLOS TODOS
 * 
 *  CLASS EVENTOSDERATON EXTENDS MOUSEADAPTER
 *  {
 *     //METODOS A UTIlizar
 *  }
 *  
 *  */
 