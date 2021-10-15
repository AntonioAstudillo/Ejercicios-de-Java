package arreglos;

public class Ejercicio11 {

	private int a[];

	public Ejercicio11(int a[]) {
		this.a = a;
	}

	public static boolean comprobarNumeros(int a[]) {
		boolean bandera;

		bandera = false;

		for (int i = 0; i < 5; i++) {

			for (int j = i + 1; j < 5; j++) {

				if (a[i] > a[j]) {
					bandera = true;
					break;
				}
			}

			if (bandera) {
				break;
			}

		}

		return bandera;
	}

	public void insertarNumero(int numero) {

		int b[] = new int[10];
		int contador;
		boolean bandera;

		contador = 0;
		bandera = false;

		if (numero > this.a[4]) {
			this.a[5] = numero;
		} else {
			for (int i = 0; i < 6; i++) {

				if (numero < this.a[i] && !bandera) {
					b[contador] = numero;
					contador++;
					bandera = true;
				}

				b[contador] = this.a[i];
				contador++;
			}

			this.a = b;
		}

	}// cierra metodo Insertar Numero

	public void mostrar() {
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + " ");

		}
	}

}
