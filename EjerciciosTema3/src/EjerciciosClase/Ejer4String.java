package EjerciciosClase;

public class Ejer4String {

	public static void main(String[] args) {
		//Elimina todos los espacios en blanco de una cadena
		
		String cadena = "   Hay   muchos  espacios     en esta    cadena    ";
		
		cadena = cadena.trim(); //Quita espacios en blanco del principio y el final
		System.out.println(cadena+".");
		
		//Recorremos la cadena pasándola a otra resultado
		//Si encuentra espacios en blanco no los pasa a la cadena resultado
		String resultado = "";
		for(int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				resultado += cadena.charAt(i);
			}
		}
		
		System.out.println(resultado);
		
	}

}
