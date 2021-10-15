package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;


public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		DameLaHora oyente=new DameLaHora();
		
		Timer miTemporizador = new Timer(5000,oyente);
        
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
	
	    System.exit(0);
	}
	

}


class DameLaHora implements ActionListener{
	
   public void actionPerformed(ActionEvent e)
   {
	   Date hora=new Date();
	   
	   System.out.println("Te ponga la hora cada 5sg: "+hora);
       
	   //con la siguiente instruccion hago que suene un sonido
	   Toolkit.getDefaultToolkit().beep();
   
   }
	
}