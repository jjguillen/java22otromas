package EjerciciosClase;

public class BonoLoto {

	/**
	 * Pinta los elementos de un vector
	 * @param numeros, array
	 */
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for(int i=0; i<numeros.length; i++)
			if (i == numeros.length-1)
				System.out.print(numeros[i]);
			else
				System.out.print(numeros[i] + ", ");
		
		System.out.println("]");
	}
	
	/**
	 * Genera número entero aleatorio entre 1 y 49
	 * @return
	 */
	public static int generarAleatorio() {
		int num=0;
		
		num = (int) (Math.random() * 49 + 1);
		
		return num;
	}
	
	/**
	 * Comprueba si un número está en un vector
	 * @param numero
	 * @param vector
	 * @return true si está, false si no está
	 */
	public static boolean estaRepetido(int numero, int[] vector) {
		boolean estaRepetido = false;
		
		for(int i=0; i<vector.length; i++) {
			if (vector[i] == numero) {
				estaRepetido = true;
				break;
			}			
		}
		
		return estaRepetido;
	}
	
	public static void main(String[] args) {
		
		//Programa que genere una combinación de 6 números de lotería
		//Esos números van de 1 a 49
		//No puede haber ninguno repetido
		
		int combinacion[] = new int[6];
		int numero=0;
		
		for(int i=0; i<combinacion.length; i++) {
			
			//Generar un número que no esté ya en la combinación
			do {
				numero = generarAleatorio();	
			} while (estaRepetido(numero, combinacion));
			
			//Lo meto en la combinación
			combinacion[i] = numero;
		}
		
		pintarVector(combinacion);
		
		
		int n=0;
		n = (int) (Math.random() * 3) + 2;
		System.out.println(n);
		

	}

}
