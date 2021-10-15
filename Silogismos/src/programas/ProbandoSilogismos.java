 package programas;

import javax.swing.JOptionPane;

public class ProbandoSilogismos {

	public static void main(String[] args) {
		
		 String termino1 , termino2 , terminoMedio;
		 String premisaMayor , premisaMenor;
		 char letra1 , letra2 , letraConclusion;
		 int modo = 0 ;
		 
		 termino1=JOptionPane.showInputDialog("INGRESE UNA FRASE");
		 termino2=JOptionPane.showInputDialog("INGRESE UNA FRASE");
		 
		 Silogismos objeto = new Silogismos(termino1 , termino2);
		 
		 letra1=objeto.generarLetra(termino1);
		 letra2=objeto.generarLetra(termino2);
		 letraConclusion=objeto.generarLetra(letra1, letra2);
		 terminoMedio=objeto.obtenerTerminoMedio();
		 premisaMayor = objeto.calcularPremisa(termino1 , terminoMedio);
		 premisaMenor = objeto.calcularPremisa(termino2 , terminoMedio);
		 
		 
		 System.out.println("EL TERMINO MEDIO ES: "+terminoMedio);
		 System.out.println("LA PRIMERA LETRA ES: "+letra1);
		 System.out.println("LA SEGUNDA LETRA ES: "+letra2);
		 System.out.println("LA LETRA DE LA CONCLUSION ES: "+letraConclusion);
		 System.out.println("LA PREMISA MAYOR ES: "+objeto.calcularPremisa(termino1 , terminoMedio));
		 System.out.println("LA PREMISA MENOR ES: "+objeto.calcularPremisa(termino2 , terminoMedio));
		
		 modo=objeto.calcularFigura(termino1, termino2, terminoMedio, premisaMenor, premisaMayor );
		
		 System.out.println("LA FIGURA ES "+modo);
		 System.out.println("EL MODO ES: "+objeto.determinarModo(letra1, letra2, letraConclusion, modo));
		 System.out.println(objeto.generarConclusion(premisaMenor, premisaMayor, letraConclusion));

	}

}
