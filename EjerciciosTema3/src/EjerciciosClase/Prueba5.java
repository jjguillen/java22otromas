package EjerciciosClase;

import java.util.Arrays;

public class Prueba5 {

	
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
	
	
	public static void main(String[] args) {
		
		int vector[] = new int[10];
		
		for(int i=0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 100 + 1);
		}
		pintarVector(vector);
		
		System.out.println(Arrays.toString(vector));
		
	}

}
