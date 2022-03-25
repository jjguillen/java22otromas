package ejersT2;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		int factorial=1;
		int n=0;
		
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número n > 1");
		
		//Leer n
		try {
			n = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Por favor, introduce un número entero");
		}
		
		//Calcular factorial
		for(int i=2; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial de "+n+" es "+factorial);
		
		
	}

}
