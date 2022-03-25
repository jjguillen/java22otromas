package Ejercicios;


import java.util.Scanner;


	/** 
	 *
	 * @author Rub�n la primera parte y sjgui la segunda parte
	 *
	 */
	public class Ejercicio2 {

		public static int buscarPalabra(String vector[], String palabra) {
			int posicion=-1;
			for (int i = 0; i < vector.length; i++) {
				if (palabra.compareTo(vector[i]) == 0)
					posicion = i;
			}
			
			return posicion;
		}
		

		public static void main(String[] args) {
			
			String spanish[] = {"casa", "�rbol", "ordenador", "mesa", "ventana", "puerta", "muro", "escaleras", "cielo", "infierno", 
					"carretera", "trueno", "nada", "algo", "rat�n", "cable", "funci�n", "programa", "clase", "p�blico"};

			String english[] = {"house", "tree", "computer", "table", "window", "door", "wall", "stairs", "heaven", "hell", 
					"highway", "thunder", "nothing", "something", "mouse", "wire", "function", "program", "class", "public"};
			
			// Desarrollamos el men�
			int opcion = 0;
			Scanner sc = new Scanner(System.in);
			
			do {
				
				// Mostramos men�
				System.out.println("\nElige opci�n:");
				System.out.println("1. ES a EN");
				System.out.println("2. EN a ES");
				System.out.println("3. Salir");
				
				//Leemos opci�n
				try {
					opcion = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Opci�n no v�lida.");
					continue; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
				}
				
				switch (opcion) {
				
					case 1:
						
						String palabraS = "";
						System.out.println("Introduce una palabra en espa�ol:");
						try {
							palabraS = sc.nextLine();
						} catch (Exception e) {
							System.out.println("Opci�n no v�lida.");
							break; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
						}
						
						int posicionS = buscarPalabra(spanish,palabraS);
						
						if (posicionS >=0)
							System.out.println("Su traducci�n al ingl�s es: " + english[posicionS].toUpperCase());
						else
							System.out.println("Palabra no encontrada.");
						
						break;
						
					case 2:
						
						String palabraE = "";
						System.out.println("Introduce una palabra en ingl�s:");
						try {
							palabraE = sc.nextLine();
						} catch (Exception e) {
							System.out.println("Opci�n no v�lida.");
							break; //Si hay error termina esta pasada del bucle y vuelve a mostrar el men�
						}
						
						int posicionE = buscarPalabra(english,palabraE);
						
						if (posicionE >=0)
							System.out.println("Su traducci�n al ingl�s es: " + spanish[posicionE].toUpperCase());
						else
							System.out.println("Palabra no encontrada.");
						
						break;
						
					case 3:
						
						System.out.println("Programa finalizado.");
											
					default: System.out.println("Introduce una opci�n v�lida.");
				}
				
			} while (opcion != 3);
			
			sc.close();	
			
			
			//Segunda parte
			String frase = "La casa del �rbol tiene puerta y ventana";
			int posicion = 0;
			int index = 0;
			String palabra = "";
			boolean fin = false;
			do {
				if (frase.indexOf(" ", posicion) >= 0) { //Para sacar cada palabra substring hasta el siguiente espacio en blanco, y actualizo posicion
					palabra = frase.substring(posicion,frase.indexOf(" ", posicion));
					posicion = frase.indexOf(" ", posicion) + 1;
				} else { //�ltima palabra, hasta el final no hasta un espacio en blanco
					palabra = frase.substring(posicion,frase.length());
					fin = true;
				}
				
				//Traducir cada palabra
				index = buscarPalabra(spanish,palabra);
				if (index >= 0) {
					System.out.println(english[index]);
				} else {
					System.out.println(palabra);
				}
				
				if (fin)
					break;
			} while (posicion >= 0);
						
						
		}

	
	
	
}
