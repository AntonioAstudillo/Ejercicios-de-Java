package ejercicios;
import javax.swing.*;
import java.awt.GraphicsEnvironment;

public class Pruebas {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String fuente=JOptionPane.showInputDialog("INTRODUCE FUENTE");
        
        boolean estalaFuente=false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	
	  for(String var:nombresDeFuentes)
	  {
		  
		  if(fuente.equals(var))
		  {
			 estalaFuente=true;   
		  }  
	  }
	  
	  if(estalaFuente)
	  {
		  System.out.println("LA FUENTE INGRESADA SI EXISTE");
	  }
	  else
	  {
		  System.out.println("LA FUENTE NO SE ENCUENTRA INSTALADA" );
	  }
	}

}
