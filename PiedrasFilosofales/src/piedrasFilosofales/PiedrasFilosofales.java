package piedrasFilosofales;

public class PiedrasFilosofales {
	private int camaraSecreta[][];
	private int filas;
	private int columnas;

	public PiedrasFilosofales(int filas, int columnas) {

		this.filas = filas;
		this.columnas = columnas;
		camaraSecreta = new int[filas][columnas];

	}

	// este metodo se va encargar de inicializar con valores mi camara secreta
	private void llenarCamara() {
		int i, y;

		for (i = 0; i < filas; i++) {

			for (y = 0; y < columnas; y++) {
				this.camaraSecreta[i][y] = (int) (Math.random() * 100 + 1);
			}
		}
	}// cierra metodo llenarCamara

	public int recojerPiedras() {

		int aux, acumulador, i, y;

		llenarCamara();
		acumulador = 0;
		aux = 0;
		y = 0;

		// antes de entrar, el numero aleatorio tiene que estar en un rango
		// del primero al ultimo elemento de la primera fila
		mostrarCamara();

		try {
			aux = (int) (Math.random() * this.columnas);

			for (i = 0; i < this.filas; i++) {
				if (aux == this.columnas) {
					aux = aux - 1;
				}

				acumulador = acumulador + this.camaraSecreta[i][aux];

				System.out.println("Este camino recorrio Harry Potter" + this.camaraSecreta[i][aux]);

				y = (int) (Math.random() * 3);

				switch (y) {
				case 0:
					aux = aux + 0;
					break;
				case 1:
					if (aux < this.columnas) {
						aux = aux + 1;
					} else {
						aux = aux + 0;
					}
					break;
				case 2:
					if (aux > 0) {
						aux = aux - 1;
					} else {
						aux = aux + 0;
					}
					break;

				}

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hubo un problema");
			System.out.println("Esto vale aux: " + aux);
			System.out.println("Esto vale y :" + y);
			System.out.println("Esto vale Acumulador: " + acumulador);
		}

		return acumulador;
	}

	private void mostrarCamara() {
		int i, y;

		for (i = 0; i < filas; i++) {

			for (y = 0; y < columnas; y++) {
				System.out.print(" " + this.camaraSecreta[i][y] + " ");
			}

			System.out.println();
		}
	}
	
}//cierra clase PiedrasFilosofales
