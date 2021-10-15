package poo;

public class Coche {
		
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
    private int peso_total;
    private boolean asientos_cuero , climatizador;
    
	//declaro el metodo constructor 
	public Coche() 
	{	
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	    estableceColor("verde");
	}
	
	
	public String dimeLargo()//metodo getter
	{	
		return "EL LARGO DEL COCHE ES "+largo;
	}
	
	public void estableceColor(String colorCoche)//metodo setter
	{
		color=colorCoche;
	}
	
	public String dimeColor()
	{
		return "EL COLOR DEL COCHE ES "+color;
	}

	public void configuraAsientos(String asientos_cuero) 
	{
		
		if(asientos_cuero=="si")
		{
			this.asientos_cuero=true;
		}
		else
		{
			this.asientos_cuero=false;
		}
	}
	
	public String dimeAsientos()
	{
		if(asientos_cuero)
		{
			return "El coche tiene asientos de cuero";
		}
		else 
		{
			return "El coche tiene asientos de serie";
		}
	}
	

	
	
}//cierra clase
