package ejercicios;
import javax.swing.*;
import java.awt.*; //importa clase image
import javax.imageio.*;
import java.io.*;

public class PruebaImagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoImagen extends JFrame
{
	public MarcoImagen()
	{
		setTitle("Marco Con Imagen");
		setBounds(200,100,100,200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
		
	}
}

class LaminaConImagen extends JPanel
{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	//File miimagen=new File("C:\\Users\\Antonio\\eclipse-workspace\\Graficos\\src\\ejercicios\\tiger.jpg");
		
		try
		{
			imagen=ImageIO.read(new File("C:\\Users\\Antonio\\eclipse-workspace\\Graficos\\src\\ejercicios\\tiger.jpg"));	
		
		}catch(IOException e){
			 
			System.out.println("IMAGEN NO SE ENCUENTRA"+e);
		}
		
		int anchuraImagen = imagen.getWidth(this); //con este metodo , encuentro la anchura de imagen
		int alturaImagen=imagen.getHeight(this); //con este metodo , encuentro la altura de una imagen
		
		g.drawImage(imagen, 5, 5, null);
		
		
		
		g.copyArea(10, 5, 600, 900, 634 ,0 );
		
		
	}
	
	private Image imagen;
}