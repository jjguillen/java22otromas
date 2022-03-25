package ejersT2;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		int opcion=0;
		Integer num = 1234;
		String cadena = num.toString();
		System.out.println(cadena.charAt(2));
		
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Te has columpiado, escribe un entero");
			}
		} while (opcion != 0);
		
		
		
		
		
		

	}

}
