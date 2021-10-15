package poo;
//con la palabra reservada extendes le indicamos al compilador que la clase 
//furgoneta debe de heredar de la clase coche
public class Furgoneta extends Coche{
	 
	 private int capacidad_carga;
	 private int plazas_extra;
	 
	 public Furgoneta(int plazas_extra , int capacidad_carga)
	 {
		 //esta instruccion llama al constructor
		 //de la clase padre
		 super();
		 this.capacidad_carga=capacidad_carga;
		 this.plazas_extra=plazas_extra;
       
	 }
	 
	 public String dimeDatosFurgoneta()
	 {
		 return " La capacidad de carga es :" + capacidad_carga + " Y las plazas son "+ plazas_extra;
	 }

}
