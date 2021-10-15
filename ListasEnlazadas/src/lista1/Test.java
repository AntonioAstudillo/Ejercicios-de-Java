package lista1;

public class Test {

	public static void main(String[] args) {
		Lista objeto = new Lista();
		
		objeto.insertarPrimero(8);
		objeto.insertarPrimero(7);
		objeto.insertarPrimero(6);
		objeto.insertarPrimero(5);
		objeto.insertarPrimero(4);
		objeto.insertarPrimero(3);
		objeto.insertarFinal(9);
		//objeto.borrar(5);
		objeto.listar();

	}

}
