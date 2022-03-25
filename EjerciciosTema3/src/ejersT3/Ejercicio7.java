package ejersT3;

import java.util.Scanner;

public class Ejercicio7 {

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
		
		//Diseñar  una  aplicación  que  declare  una  tabla  de  10  elementos
		//enteros.  Leer  mediante  el  teclado  8  números <- ALEATORIO YO
		//Después  se  debe  pedir  un  número  y  una  posición,  insertarlo  en
		//la  posición  indicada,  desplazando  los  que  estén detrás.  

		int numeros[] = new int[10];
		
		for(int i=0; i < 8; i++) {
			numeros[i] = (int) (Math.random() * 100 + 1);
		}
		
		pintarVector(numeros);
		
		Scanner sc = new Scanner(System.in);
		
		//Introduce la posición donde vamos a meter un nuevo valor
		int posicion = 0;
		do {
			System.out.println("Introduce una posición entre 0 y 7");
		
			try {
				posicion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while(posicion < 0 || posicion > 7);
		
		//Pide por teclado el valor a introducir en esa posicion
		int numero = 0;
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover todos los elementos desde posicion hasta Length-1 a la derecha
		//Me voy al final, e intercambio lo que hay en la posición i, lo pongo en i+1
		for(int i=8; i>=posicion; i--) {
			numeros[i+1] = numeros[i];
		}
		//pintarVector(numeros);
		
		//Insertar el número en la posición seleccionada
		numeros[posicion] = numero;
		
		pintarVector(numeros);
		
		
		
		
		
		
	}

}
