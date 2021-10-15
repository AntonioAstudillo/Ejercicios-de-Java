import javax.swing.*;
public class UsoArrays2 {

	public static void main(String[] args) {
		
		int[] arregloAleatorios=new int[150];
		int i , longitud;
		
		longitud=arregloAleatorios.length;
		
		for(i=0; i<longitud;i++)
		{
			arregloAleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numero:arregloAleatorios)
		{
			System.out.print(numero+" ");
		}

	}

}
