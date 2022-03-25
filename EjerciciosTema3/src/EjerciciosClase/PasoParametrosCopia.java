package EjerciciosClase;

public class PasoParametrosCopia {

	//Funciona con los tipos básicos, int, long, double, boolean, ...
	
	public static void modificar(int num) {
		num += 5;
		System.out.println("Dentro del método "+num);
	}
	
	//Funciona con objetos inmutables String, ...
	public static void modificarString(String cad) {
		cad += " ... fin";
		System.out.println("Dentro del método "+cad);
	}
	
	public static void main(String[] args) {
		
		int numero = 5;
		//numero se copia a num, pero lo que haga dentro la función no se ve modificado fuera
		modificar(numero);
		System.out.println("En el main "+numero);
		
		String cadena = "Inicio ";
		modificarString(cadena);
		System.out.println("En el main "+cadena);

	}

}
