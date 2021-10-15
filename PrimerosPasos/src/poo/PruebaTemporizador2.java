package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj(3000,false);
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "PULSA ACEPTAR PARA TERMINAR");
		
		System.exit(0);

	}

}


class Reloj
{
	
	public Reloj(int intervalo,boolean sonido)
	{
	    this.intervalo=intervalo;
	    this.sonido=sonido;
	}
	
	public void enMarcha()
	{
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,oyente);
		
		miTemporizador.start();
	}
	
	
	private int intervalo;
	private boolean sonido;
	
	//clase interna
	//solo las clases internas pueden tener el
	//modificador de acceso private
	private class DameLaHora2 implements ActionListener
	{
		
		public void actionPerformed(ActionEvent evento)
		{
			Date ahora= new Date();
			
			System.out.println("Te ponga la hora cade 3 seg:"+ahora);
			
			if(sonido)
			{
				Toolkit.getDefaultToolkit().beep();
			}
		}


	}
	
	
	
}



