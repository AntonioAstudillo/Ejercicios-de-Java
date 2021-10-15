package ejercicios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PruebaEventos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		MarcoBotones mimarco=new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoBotones extends JFrame{
	
 public MarcoBotones()
 {
	 setTitle("BOTONES Y EVENTOS");
	 setBounds(700,300,500,300);
	 
	 LaminaBotones milamina=new LaminaBotones();
 
      add(milamina);
 }
	
	
}

class LaminaBotones extends JPanel 
{
	JButton botonAzul=new JButton("azul");
	JButton botonAmarrillo = new JButton("Amarrillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones()
	{
		add(botonAzul);	
		add(botonAmarrillo);
		add(botonRojo);
		
		ColorFondo amarrillo=new ColorFondo(Color.YELLOW);
		ColorFondo azul=new ColorFondo(Color.blue);
		ColorFondo rojo=new ColorFondo(Color.red);
		
		botonAmarrillo.addActionListener(amarrillo);
		botonAzul.addActionListener(azul);
		botonRojo.addActionListener(rojo);
        	
	}
	
	private class ColorFondo implements ActionListener
	{
		public ColorFondo(Color c)
		{
			colorDeFondo=c;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
	}
	
	
}

