package Wordle2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Wordle -------------------");
		int intentos = 0;
		boolean fin=false;
		
		Wordle wl = new Wordle();		
	System.out.println(wl.getPalabraAAcertar());
		Scanner sc = new Scanner(System.in);
		String intento;
		do {
			System.out.println("Escribe una palabra para acertar");
			intento = sc.nextLine();
			fin = wl.comprobar(intento);
			System.out.println(wl);			
			intentos++;
		} while (intentos < 6 && !fin);
		
		
		//Comprobar ganador
		if(fin) {
			System.out.println("YOU WIN");
		} else {
			System.out.println("YOU LOOSE");
		}
		
	}

}
