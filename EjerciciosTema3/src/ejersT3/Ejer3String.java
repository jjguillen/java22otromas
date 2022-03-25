package ejersT3;

import java.util.Scanner;

public class Ejer3String {

	public static void main(String[] args) {
		
		String cadena = "Esto es lo que hay, la programación es muy dura, :(";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena a buscar");
		String str = sc.nextLine();
		
		//Buscar str en cadena y contar las veces que aparece
		int contador=0;
		
		int posicion=0;
		while (posicion >=0) { // Hasta que indexof devuelva -1, o sea no encontrado
			posicion = cadena.indexOf(str,posicion);
			if (posicion >=0) { //Encontrado
				contador++;
				posicion++;
			}
		}
		
		System.out.println(contador);
		
		
	}

}
