package clasesAbstractas;

public class Clase1 
{
   public static void main(String args[])
   {
	   Shape a;
	   a = new Triangulo(10,5);
	   
	   System.out.print(a.area());
	   
   }
}


 abstract class Shape{
	
	public abstract int area();
	
}
 
 class Triangulo extends Shape{

   private int base;	
   private int altura;
   
   Triangulo(int base , int altura)
   {
	   this.base = base;
	   this.altura = altura;
   }
	 
	 
	public int area() {
		
		return (base*altura)/2;
	}
	 
	 
	 
	 
 }