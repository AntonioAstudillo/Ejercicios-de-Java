package ventana;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Ventana extends JFrame
{
  //constructor de nuestra ventana
	public Ventana()
	{
		//establecemos el tamaño
		this.setSize(300, 300);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("MI VENTANA PRINCIPAL");
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//metodo para posicionar la ventana en el centro
	    //this.setResizable(false);//con eso impedimos cambiar el tamaño de la ventana
		this.setBounds(550, 300, 650, 450);
		this.setMinimumSize(new Dimension(500,200)); //con eso indicamos el tamaño minimo que puede tener nuestra ventana
		this.getContentPane().setBackground(Color.blue);//le damos un color a nuestra ventana
	    
	
	}
	
	public static void main(String[]args)
	{
		Ventana objeto = new Ventana();
		
		
	}
}
