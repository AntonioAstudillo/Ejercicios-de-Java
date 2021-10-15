package cadenasComparando;

public class ComparandoCadenas {

	public static void main(String[] args) 
	{
		String saludo = "Hola mami, no se que vaya a pasar";
        String saludoDos = saludo;
        saludo = "Que pedo";
        saludo = "Hola mami, no se que vaya a pasar";
        
        if(saludo == saludoDos) {
        	System.out.println("Los dos String's apuntan a la misma cadena");
        }else {
        	System.out.println("Las direcciones de memoria no son iguales");
        }
        
        System.out.println(saludo);
        System.out.println(saludoDos);
        
        if(saludo.equals(saludoDos)) {
        	System.out.println("Son iguales!!!!!");
        }
	}

}
