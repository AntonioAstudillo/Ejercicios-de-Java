package ordenarCadenas;

public class Cadenas 
{
  String aux;
  int i , y , longitud ;
  String matriz[];
  
  public Cadenas()
  {
	  this.aux = null;
	  i = y = 0;
	  longitud = 0;
  }
  
  public void ordenarMatriz(String matriz[])
  {
	  this.matriz = matriz;
	  longitud = this.matriz.length;
	  
	  for(i=0; i<longitud; i++)
	  {
		 for(y=1; y<longitud; y++)
		 {
			 if(this.matriz[y-1].length() > this.matriz[y].length())
			 {
				 aux = this.matriz[y];
				 this.matriz[y] = this.matriz[y-1];
				 this.matriz[y-1] = aux;
			 }
		 }
	  }
  }
  
  public void getMatriz()
  {
	  for(i=0; i<this.matriz.length; i++)
	  {
		  System.out.print(this.matriz[i]+ " ");
	  }
  }
	
}
