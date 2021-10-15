package ejercicios;

import java.util.*;

public class Conversion 
{
     public static void main(String[]args)
     {
    	 
    	// String numero="20";
    	 //int resultado;
    	 
    	 //hacemos una conversion de tipos de datos
    	 //de string a entero
    	 
    	// resultado=10+Integer.parseInt(numero);
    	 
    	 //System.out.println("LA SUMA DE LOS NUMEROS ES "+resultado);
    	 
    	 //utilizando el metodo  charAt
    /*	 
    	 String correo="quepedoperro@hotmail.com";
    	 char letra;
    	 int longitud , i;
    	 int contador;
    	 
    	 
    	 longitud = correo.length();
    	 contador=0;
    	 
    	 for(i=0; i<longitud; i++)
    	 {
    		 letra=correo.charAt(i);
    		 
    		 if(letra=='@')
    		 {
    			 contador++;
    		 }
    	 }
    	 
    	 
    	 if(contador!=1)
    	 {
    		 System.out.println("CORREO INVALIDO");
    	 }
    	 else
    	 {
    		 System.out.println("CORREO CORRECTO");
    	 }
    	 
    	 
    	 */
    	 
    	 
    	 
    	 //SIMULANDO VALIDAR UN CORREO ELECTRONICO
    /*	 
    	 Scanner entrada = new Scanner(System.in);
    	 String correo;
    	 int i , longitud , contador;
    	 
    	 System.out.println("INGRESE UN CORREO ELECTRONICO");
    	 correo=entrada.nextLine();
    	 
    	 longitud = correo.length();
    	 contador=0;
    	 
    	 for(i=0; i<longitud; i++)
    	 {
    		 
    		 
    		 if(correo.charAt(i)=='@')
    		 {
    			 contador++;
    		 }
    	 }
    	 
    	 
    	 if(contador!=1)
    	 {
    		 System.out.println("CORREO INVALIDO");
    	 }
    	 else
    	 {
    		 System.out.println("CORREO CORRECTO");
    	 }
    	 
    	 
    	 */
    	 
    	 
    	 //haciendo casting
    	 
    	 double valor=1324.23;
    	 int numero;
    	 
    	 numero=(int)valor;
    	 
    	 numero=numero-1323;
    	 
    	 System.out.println(numero);
    	 
    	 
     }
}


