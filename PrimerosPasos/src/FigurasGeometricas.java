import javax.swing.*;
import java.util.*;

public class FigurasGeometricas {

	public static void main(String[] args)
	{
		int opcion;
		//creo el objeto de tipo entrada
		
		Scanner objetoEntrada = new Scanner(System.in);
		
		System.out.print("Que formula desea calcular\n 1-Cuadrado\n 2-Rectangulo\n3-triangulo\n ");
		
       opcion=objetoEntrada.nextInt();
       
       switch(opcion)
       {
          case 1:
        	    int lado;
        	    
        	    lado=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADO DEL CUADRADO"));
        	    

        	    
        	    System.out.print("EL AREA DEL CUADRADO ES "+ Math.pow(lado, 2));
        	    
          break;       
          case 2:
        	    int base , altura;
        	    int resultado;
        	    
        	    base=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA BASE DEL RECTANGULO"));
        	    altura=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA ALTURA DEL RECTANGULO"));
        	    
        	    resultado=base*altura;
        	    
        	    System.out.println("EL AREA DEL RECTANGULO ES "+resultado);
          break;
          case 3:
        	   
        	   base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
        	   altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
        	   resultado=(base*altura)/2;
        	   System.out.print("EL AREA DEL TRIANGULO ES "+resultado);
        	  break;
       
       
       
       }
		 
		
	}

}
