package ejersT3;

import java.util.Scanner;

public class Ejercicio13MCuadrada {

	/**
	 * Pinta los elementos de un vector
	 * @param numeros, array
	 */
	public static void pintarMatriz(int numeros[][])  {

		for(int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " | ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		
		//Lo rellenamos
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Fila " + i);
			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print("Introduce valor "+j+":");
				
				matriz[i][j] = Integer.parseInt(sc.nextLine());
			}
			System.out.println();
			
		}
		
		//Pintamos la matriz
		pintarMatriz(matriz);
		
		int sumaF,sumaC;
		//Sumamos las filas
		for(int i=0; i<matriz.length; i++) {	
			
			//Cada fila empieza a sumar desde cero
			sumaF = 0;
			sumaC = 0;
			
			for(int j=0; j<matriz[i].length; j++) {
				sumaF += matriz[i][j];
				sumaC += matriz[j][i];
			}
			
			System.out.println("La suma de la fila "+ i +" es " + sumaF);
			System.out.println("La suma de la columna "+ i +" es " + sumaC);
		}
		
		
	}

}
