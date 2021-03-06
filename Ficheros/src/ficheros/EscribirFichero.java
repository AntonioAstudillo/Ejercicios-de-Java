package ficheros;

import java.io.*;


public class EscribirFichero  {

	private String nombreFichero; 
	private BufferedWriter bw;
	private BufferedReader br;
	private int contador;
	
	//constructor
	public EscribirFichero()  {
		this.contador =0;
		this.nombreFichero = "c://Users//Antonio//Desktop//paginas.txt";
		
		try {
			//bw = new BufferedWriter(new FileWriter(this.nombreFichero,true));
			br = new BufferedReader(new FileReader(this.nombreFichero));
			
		}catch(IOException e) {
			System.out.println("Hubo un problema "+e);
		}
				
	}//cierra constructor 
	
	public void escribirEnArchivo(String texto) {
		try {
			this.bw.write(texto);
			this.bw.newLine();
			this.bw.close();
		}catch(IOException e) {
			System.out.println("Hubo una excepcion"+e);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void leerArchivo() {
		try {
			String aux;
			while(true) {
				aux = br.readLine();
					
				if(aux!=null) {
					System.out.println(aux);
					contador++; //me va servir para contar cuantas lineas tiene el archivo
				}else {
					break;
				}
			}
			
			br.close();
		
		}catch(IOException e) {
			System.out.println("Hubo una excepcion "+e);
		}catch(NullPointerException e) {
			System.out.println("Hubo una excepcion de tipo "+e);
		}
	}
    
	
	public int getContador() {
		return this.contador;
	}


}
