package ejercicios;

public class CRacional 
{
       private int numerador;
       private int denominador;
       
       public void asignarDatos(int num ,int den)
       {
    	   numerador=num;
    	   if(den==0)
    	   {
    		   den=1;
    	   }
    	   
    	   denominador=den;
       }
       
       public void visualizarRacional()
       {
    	   System.out.println(numerador + "/" + denominador);
       }
       
       public static CRacional sumar(CRacional a , CRacional b)
       {
    	   CRacional r = new CRacional();
    	   
    	   int num = a.numerador * b.denominador + a.denominador * b.numerador;
    	   int den =a.denominador * b.denominador;
    	   r.asignarDatos(num, den);
    	   
    	   return r;
    	   
       }
       
       public static void main(String args[]) 
       {
       	 CRacional r1, r2 ;
       	 
       	 r1 = new CRacional();
       	 
       	 r1.asignarDatos(2, 5 );
       	 
       	 r2=r1;
       	 
       	 r1.asignarDatos(3,7);
       	 r1.visualizarRacional();
       	 r2.visualizarRacional();
       	 
       	 CRacional r3 ;
       	 
       	 r2= new CRacional();
       	 r2.asignarDatos(2,5);
       	 r3=CRacional.sumar(r1,r2);
       	 r3.visualizarRacional(); 		
       	 
       }
       
}//cierra clase 



