import java.util.*;


public class Uso_Tallas {
	
	
	//enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};

	enum Talla
	{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura)
		{
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura()
		{
			return abreviatura;
		}
		
		private String abreviatura;
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	   
	   String talla;
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Ingrese una talla");
	   talla=entrada.next().toUpperCase();
	   
	   Talla la_talla=Enum.valueOf(Talla.class,talla);

	   System.out.print("TALLA=" +la_talla);
	   
	   System.out.println("Abreviatura="+la_talla.dameAbreviatura());
	}

}
