import javax.swing.JOptionPane;

public class ArrrayString {

	public static void main(String[] args) 
	{
		String [] paises=new String[8];
		int i;
		
		
		
		for(i=0; i<8;i++)
		{
			paises[i]=JOptionPane.showInputDialog("INTRODUCE UN NOMBRE DE UN PAIS");
		}
	    
		
		for(String pais:paises)
		{
			System.out.println(pais);
		}
		

	}//CIERRA METODO VOID

}//CIERRA CLASE
