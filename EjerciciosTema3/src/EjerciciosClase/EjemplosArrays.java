package EjerciciosClase;

public class EjemplosArrays {

	/**
	 * Pinta los elementos de un vector
	 * @param numeros, array
	 */
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + ", ");
		
		System.out.println("]");
	}
	
	/**
	 * Suma los elementos en posiciones impares, considerando 0 la primera impar
	 * @param numeros
	 * @return
	 */
	public static int sumarImpares(int numeros[]) {
		int suma=0;
		
		for(int i=0; i<numeros.length; i+=2) {
			suma += numeros[i];
		}
		
		return suma;
	}
	
	/**
	 * Dice si un número es o no primo
	 * @param numero
	 * @return true o false, según sea o no un número primo
	 */
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		
		for(int i=2; i<=numero-1; i++) {
			if (numero%i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		return esPrimo;
		
	}
	
	/**
	 * Devuelve la suma de los elementos de un vector que sean números primos
	 * @param vector
	 * @return
	 */
	public static int sumarPrimos(int vector[]) {
		int suma=0;
		
		for(int i=0; i<vector.length; i++) {
			//Si es primo lo sumo
			if (esPrimo(vector[i])) {
				suma = suma + vector[i];
			}
		}
		
		return suma;
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Sumar los valores en posiciones impares de un array
		int numeros[] = new int[20];
		for(int i=0; i<numeros.length; i++)
			numeros[i] = (int) (Math.random() * 100 + 1);
			
		pintarVector(numeros);
		System.out.println(sumarImpares(numeros));
		
		System.out.println(sumarPrimos(numeros));
		
		
	}

}
