package ejercicios;
import javax.swing.*;
import java.awt.event.*;


public class EventosVentana {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MarcoVentana mimarco=new MarcoVentana();
		MarcoVentana mimarcoDos=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarcoDos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(300, 300, 500, 350);
        
        mimarcoDos.setTitle("Ventana 2");
        mimarcoDos.setBounds(900,300,500,350);
	
	
	}

}


class MarcoVentana extends JFrame{
	
	
	public MarcoVentana()
	{
		//setTitle("Ventana Eventos");
		//setBounds(300,300,500,350);
		setVisible(true);
	
	   // M_Ventana oyente_ventana=new M_Ventana();
	   //addWindowListener(oyente_ventana);
	   
	  addWindowListener(new M_Ventana());	
		
	}
	
	
	
	
}

class M_Ventana extends WindowAdapter
{
	//tenemos que implementar los metodos

	
	public void windowIconified(WindowEvent e)
	{  	
   	   System.out.println("VENTANA MINIMIZADA");
    }
	
	/*public void windowActivated(WindowEvent e) {
    	 System.out.println("Ventana Activada");
    } 
    public void windowClosed(WindowEvent e) {
    	System.out.println("La ventana ha sido cerrada");
    }
    public void windowClosing(WindowEvent e) {
    	System.out.println("Cerrando Ventana");
    }
    public void windowDeactivated(WindowEvent e) {
    	System.out.println("Ventana DesActivada");
    } 
    public void windowDeiconified(WindowEvent e) {
    	System.out.println("Ventana Restaurada");
    }
    public void windowIconified(WindowEvent e) {
    	
    	 System.out.println("VENTANA MINIMIZADA");
    }
    public void windowOpened(WindowEvent e) {
    	System.out.println("Ventana Abierta");
    }    
    
    */

}