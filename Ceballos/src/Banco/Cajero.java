package Banco;

public class Cajero
{
     private String nombreUsuario;
     private double saldo;
     private double tipoInteres;
     
     public Cajero()
     {
    	 saldo=0.0;
    	 tipoInteres=0.0;
    	 nombreUsuario="Desconocido";
     }
     
     public void ingresarDinero(double numero)
     {
    	 saldo=numero;
     }
     
     public double retirarDinero(double numero)
     {
    	 saldo = saldo - numero;
    	 
    	 return saldo;
     }
     
     public void abonarIntereses(double numero)
     {
    	 tipoInteres = tipoInteres + numero;
     }
     
     public void ingresarNombreUsuario(String nom)
     {
    	 nombreUsuario = nom ;
     }
     
     public double obtenerSaldo()
     {
    	 return saldo;
     }
     
}
