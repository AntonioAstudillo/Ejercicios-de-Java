package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) 
	{
		Coche objeto;
		String color;
		
		
		//color = JOptionPane.showInputDialog("INGRESE EL COLOR DEL COCHE");
			
		Coche micoche1 = new Coche();
	     
		micoche1.estableceColor("Morado");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7,580);
	
		mifurgoneta1.estableceColor("Rojo");
	    
		mifurgoneta1.configuraAsientos("Si");
		
		System.out.println(micoche1.dimeAsientos());
		System.out.println(mifurgoneta1.dimeColor());
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
	
	}//cierra metodo main

}
