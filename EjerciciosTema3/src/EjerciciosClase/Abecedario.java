package EjerciciosClase;

public class Abecedario {

	/**
	 * Pinta los elementos de un vector
	 * @param numeros, array
	 */
	public static void pintarVector(char letras[]) {
		System.out.print("[");
		for(int i=0; i<letras.length; i++) {
			if (i == letras.length-1)
				System.out.print(letras[i]);
			else
				System.out.print(letras[i] + ", ");
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		char abecedario[] = new char[26];
		char car = 'A';
		
		for(int i=0; i<abecedario.length; i++) {
			abecedario[i] = car;
			car++;
		}

		pintarVector(abecedario);
	}

}
