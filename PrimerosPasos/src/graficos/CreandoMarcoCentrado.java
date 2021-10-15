package graficos;

import java.awt.Toolkit;
import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco1 = new MarcoCentrado();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
		
		//cambiar el titulo
		

	}

}

class MarcoCentrado extends JFrame
{
	public MarcoCentrado()
	{
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
        //con este metodo obtenemos 
		Dimension tamanoPantalla = miPantalla.getScreenSize();
	
	    int alturaPantalla = tamanoPantalla.height;
	    int anchoPantalla = tamanoPantalla.width;		
	    
	    
	    setSize(anchoPantalla/2,alturaPantalla/2);
	    
	    setLocation(anchoPantalla/4,alturaPantalla/4);
	    
	    setTitle("Marco Centrado");
	    
	    //poner icono nuevo
	    //tenemos que utilizar el metodo
	    //getImage
	    
	    Image miIcono = miPantalla.getImage("src/graficos/icono.jpeg");
	    setIconImage(miIcono);
	    
	}
	
	
}