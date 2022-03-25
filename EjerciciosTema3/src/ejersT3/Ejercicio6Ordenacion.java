package ejersT3;

import java.util.Arrays;

public class Ejercicio6Ordenacion {

	public static void pintar(int vector[]) {
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int vector[] = new int[10];
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 10) + 1;
		}
		
		pintar(vector);
		
		Arrays.sort(vector); //Ordenar el vector
		
		pintar(vector);
		
		boolean encontrado=false;
		
		for(int i=0;i<vector.length;i++) { //Busco cada número de 1 al 10
			//System.out.println(i);
			encontrado = false;
			for(int j=0; j<vector.length; j++) {
				if (i == vector[j])
					encontrado = true;
				
				if (i < vector[j]) { //No busca en la parte del vector que es mayor
								   //que el número que estamos buscando. Está ordenado
					break;
				}
			}
			
			if (!encontrado) //Si no lo encuentro en el vector no está
				System.out.println("No está "+i);
			
		}

	}

}
