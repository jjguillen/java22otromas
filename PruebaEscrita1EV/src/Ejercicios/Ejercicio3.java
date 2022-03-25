package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Pinta la matriz
	 * @param matriz
	 */
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			//Pinta la fila entera
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			//Cuando termino la fila, pinto un salto de lÃ­nea
			System.out.println();
		}
	}
	
	/** 
	 * Suma los valores de la fila pasada como parámetro
	 * @param matriz
	 * @param fila
	 * @return
	 */
	public static int sumarFila(int[][] matriz, int fila) {
		int suma=0;
		for(int i=0;i < matriz[fila].length; i++)
			suma += matriz[fila][i];
		
		return suma;
	}
	
	/**
	 * Suma los valores de la columna pasada como parámetro
	 * @param matriz
	 * @param col
	 * @return
	 */
	public static int sumarColumna(int[][] matriz, int col) {
		int suma=0;
		for(int i=0;i < matriz.length; i++)
			suma += matriz[i][col];
		
		return suma;
	}
	
	/**
	 * Suma los valores en ambas diagonales de la matriz y los pinta por pantalla
	 * @param matriz
	 */
	public static void sumaDiagonales(int[][] matriz) {
		int sumaM=0, sumaMI=0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if (i==j)
					sumaM += matriz[i][j];
				if (i+j == matriz.length-1) {
					sumaMI += matriz[i][j];
				}
			}
		}
		
		System.out.println("Suma diagonal principal "+sumaM);
		System.out.println("Suma diagonal secundaria "+sumaMI);
	}
	
	/**
	 * Pinta la matriz traspuesta a la pasada como parámetro
	 * @param matriz
	 */
	public static void matrizTraspuesta(int[][] matriz) {
		int matrizT[][] = new int[matriz.length][matriz.length];
		
		//Transformo
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matrizT[j][i] = matriz[i][j];
			}
		}
		
		pintarMatriz(matrizT);
	}
	
	/**
	 * Devuelve la media de todos los valores de la matriz
	 * @param matriz
	 * @return
	 */
	public static double media(int[][] matriz) {
		int media=0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				media += matriz[i][j];
			}
		}
		
		return media/(Math.pow(matriz.length, 2));
	}
	
	/** 
	 * Ordena un vector de mayor a menor con el método de la burbuja
	 */
	public static void burbujaMejorada(int vector[]) {
		int aux=0;
		for(int i=vector.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if (vector[j] < vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}		
	}
	
	/**
	 * Ordena cada fila de la matriz de mayor a menor
	 * @param matriz
	 */
	public static void matrizFilasOrdenadas(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			burbujaMejorada(matriz[i]);
		}
		
		pintarMatriz(matriz);
	}
	
	
	public static void main(String[] args) {
		
		int opcion=0;
		int matriz[][] = new int[3][3];
		
		//Rellenar matriz
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		pintarMatriz(matriz);
		
		//Creamos el scanner para pedir por teclado
		Scanner sc = new Scanner(System.in);
		
		//MENU
		do {
			System.out.println();
			System.out.println("Opciones:");
			System.out.println("1.Suma fila");
			System.out.println("2.Suma columna");
			System.out.println("3.Suma diagonales");
			System.out.println("4.Media de todos los valores");
			System.out.println("5.Matriz traspuesta");
			System.out.println("6.Matriz con filas ordenadas");
			System.out.println("7.Salir");
			
			
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Opción incorrecta");
			}
			
			switch (opcion) {
				case 1: {
					System.out.println("Introduzca número de fila (0,"+(matriz.length-1)+"):");
					int fila=0;
					try {
						fila = Integer.parseInt(sc.nextLine());
					} catch(Exception e) {
						System.out.println("Error en la entrada, no ha escrito un número");
						break;
					}
					
					if ( (fila>=0) && (fila<matriz.length) ) {
						System.out.println(sumarFila(matriz, fila));
					} else {
						System.out.println("Fila incorrecta, la próxima vez ponga una fila en el rango");
					}
					
					break;
				}
				case 2: {
					System.out.println("Introduzca número de columna (0,"+(matriz[0].length-1)+"):");
					int col=0;
					try {
						col = Integer.parseInt(sc.nextLine());
					} catch(Exception e) {
						System.out.println("Error en la entrada, no ha escrito un número");
						break;
					}
					
					if ( (col>=0) && (col<matriz[0].length) ) {
						System.out.println(sumarColumna(matriz, col));
					} else {
						System.out.println("Fila incorrecta, la próxima vez ponga una fila en el rango");
					}
					break;
				}
				case 3: {
					sumaDiagonales(matriz);
					break;
				}
				case 4: {
					System.out.println(media(matriz));
					break;
				}
				case 5: {
					matrizTraspuesta(matriz);
					break;
				}
				case 6: {
					matrizFilasOrdenadas(matriz);
					break;
				}
				case 7: {
					System.out.println("Hasta la próxima");
					break;
				}
				default:
					throw new IllegalArgumentException("Opción incorrecta: " + opcion);
			}
			
		} while (opcion != 7);
	}

}
