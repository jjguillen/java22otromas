package Wordle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Wordle wl = new Wordle();
		
		boolean acierto = true;
		int intentos = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe una palabra:");
			String palabra = sc.nextLine();
			acierto = wl.comprobar(palabra);
			intentos++;
			if (!acierto)
				System.out.println(wl);
		} while (intentos < 6 && !acierto);
		
		if (acierto)
			System.out.println("Ganaste");
		else 
			System.out.println("Perdiste. Prueba de nuevo");
	}

}
