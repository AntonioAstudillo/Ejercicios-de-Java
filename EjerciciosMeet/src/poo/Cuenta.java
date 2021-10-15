package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {
		this.nombre = "";
		this.numCuenta = "";
		this.tipoInteres = 0.0;
		this.saldo = 0.0;
	}

	public Cuenta(String nombre, String numCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}

	public Cuenta(Cuenta objeto) {
		this.nombre = objeto.nombre;
		this.numCuenta = objeto.numCuenta;
		this.saldo = objeto.saldo;
		this.tipoInteres = objeto.tipoInteres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
	//aumentar el saldo en la cantidad que se indique
	public boolean ingreso(double valor) {
		
		boolean bandera;
		
		bandera = (valor<0)? false : true;
		
		if(bandera) {
			this.saldo = this.saldo + valor;
		}
		
		return bandera;
		
	}
	
	//disminuir el saldo en una cantidad
	
	public boolean  reintegro(double valor) {
		
		boolean bandera;
		
		if(this.saldo>= valor) {
			this.saldo = this.saldo - valor;
			bandera = true;
		}else {
			bandera = false;
			JOptionPane.showMessageDialog(null, "Saldo insuficiente","No hay saldo",JOptionPane.WARNING_MESSAGE);
		}
		
		return bandera;
		
	}
	
	public boolean transferencia(Cuenta obj , double importe) {
		
		boolean bandera;
		double dinero;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Cuanto dinero desea transferir");
		dinero = in.nextDouble();
		
		if(this.saldo>=dinero) {
			obj.saldo = obj.saldo + dinero;
			bandera = true;
		}else {
			bandera = false;
		}
		
			
		return bandera;
	}
}
