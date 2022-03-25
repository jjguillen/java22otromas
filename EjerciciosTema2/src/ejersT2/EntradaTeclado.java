package ejersT2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EntradaTeclado {

	public static void main(String[] args) {
		
		
		//Leer de teclado con Scanner
		Scanner teclado = new Scanner(System.in); //Solo se crea al principio
		
		//Leemos una cadena y la pasamos a entero - nextLine()
		System.out.print("Introduce un entero: ");
		String cadena = teclado.nextLine();
		int unNumero=0;
		try {
			unNumero = Integer.parseInt(cadena);
		} catch (NumberFormatException ex) {
			System.out.println("No has introducido un entero");
		}		
		System.out.println(unNumero);
		
		/*
		//Leemos un entero directamente - nextInt()
		System.out.print("Introduce un entero: ");
		int numero=0;
		try {
			numero = teclado.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("No has introducido un entero, lo siento");
		}
		System.out.println(numero);
		*/
		
		//Leemos un entero directamente - nextInt()
		System.out.print("Introduce un double: ");
		double opcion=0;
		try {
			opcion = Double.parseDouble(teclado.nextLine());
		} catch (InputMismatchException ex) {
			System.out.println("No has introducido un double, lo siento");
		}
		System.out.println(opcion);
				
		teclado.close();
		
		

	}

}
