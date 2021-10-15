import javax.swing.JOptionPane;

public class MatrizDimensiones {

	public static void main(String[] args) 
	{
		//declaracion de una matriz bidimensional
		int [][] matrix=new int[4][5];
		int i , y ;
		

		
		for(i=0; i<4;i++)
		{
			for(y=0; y<5; y++)
			{
				matrix[i][y]=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN VALOR"+(i+1)));
			}
		}

		
		
		for(i=0; i<4;i++)
		{
			for(y=0; y<5; y++)
			{
				System.out.println(matrix[i][y]);
			}
		}

	}

}
