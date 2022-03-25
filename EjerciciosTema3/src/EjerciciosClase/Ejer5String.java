package EjerciciosClase;

public class Ejer5String {

	public static void main(String[] args) {
		
		String cadena = "Esto es una cadenas";
		
		if (cadena.length() % 2 == 0) { //Longitud par
			System.out.println( cadena.substring(0, cadena.length() / 2) );	
		} else {
			System.out.println( cadena.substring(0,cadena.length() / 2 + 1) );
		}

	}

}
